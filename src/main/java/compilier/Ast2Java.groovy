package compilier
import jast.ast.AssignExpr;
import jast.ast.BinaryExpr;
import jast.ast.BlockStmt;
import jast.ast.BreakStmt;
import jast.ast.ClassNode;
import jast.ast.ConstExpr;
import jast.ast.ContinueStmt;
import jast.ast.ElementExpr;
import jast.ast.ExprNode;
import jast.ast.ExprStmt;
import jast.ast.FieldDeclStmt;
import jast.ast.FieldExpr;
import jast.ast.FieldNode;
import jast.ast.ForStmt;
import jast.ast.IAstVisitor
import jast.ast.AstVisitor
import jast.ast.IfStmt;
import jast.ast.InvocationExpr;
import jast.ast.LoopStmt;
import jast.ast.MethodNode;
import jast.ast.NameExpr;
import jast.ast.ParameterNode;
import jast.ast.ReturnStmt;
import jast.ast.Statement;
import jast.ast.UnaryExpr;
import jast.ast.VarDeclStmt;
import jast.ast.WhileStmt;
//@groovy.transform.TypeChecked
class Ast2Java extends AstVisitor<String>{

	protected String code = "";
	
	private String stmtDelim = ";"
	
	private String indent = "";
	
	private void incIndent(){
		indent += "  "
	}
	
	private void decIndent(){
		indent = indent.substring(0,indent.length()-2)
	}
	
	@Override
	public String visitClassNode(ClassNode node) {
		incIndent()
		String fs = visit(node.fields).join("\r\n");
		String mds = visit(node.methods).join("\r\n");
		decIndent()
		String mdf = node.modifier
		String name = node.name
		String parentStr = node.parentName ? " extends ${node.parentName}" :""
		return "${mdf} class ${name} ${parentStr} {\r\n${fs}\r\n${mds}\r\n}"
	}

	@Override
	public String visitFieldNode(FieldNode node) {
		indent + "${node.modifier} ${node.type} ${node.name}" +(node.initExpr?"=${visit(node.initExpr)}":"") +";"
	}

	@Override
	public String visitMethodNode(MethodNode node) {
		String ps = visit(node.parameters).join(",")
		incIndent()
		String body = visit(node.body)
		decIndent()
		indent + "${node.modifier} ${node.type} ${node.name}(${ps}) ${body}"
	}

	@Override
	public String visitParameterNode(ParameterNode node) {
		"${node.type} ${node.name}"
	}


	@Override
	public String visitBlockStmt(BlockStmt node) {
		incIndent()
		String body = visit(node.statements).join("\r\n")
		decIndent()
		"{\n${body}\n" + indent + "}"
	}

	@Override
	public String visitBreakStmt(BreakStmt node) {
		indent + "break;"
	}

	@Override
	public String visitContinueStmt(ContinueStmt node) {
		indent + "continue;"
	}

	@Override
	public String visitExprStmt(ExprStmt node) {
		return indent + visit(node.expr) +';';
	}

	@Override
	public String visitFieldDeclStmt(FieldDeclStmt node) {
		indent + "${node.fieldType} ${node.fieldName}"+(node.initExpr?"=${visit(node.initExpr)}":"") + ";"
	}

	@Override
	public String visitForStmt(ForStmt node) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visitIfStmt(IfStmt node) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visitLoopStmt(LoopStmt node) {
		def pre = node.preConditionExpr;
		def post = node.postConditionExpr;
		def body = visit(node.loopBody)
		def oldIndent = this.indent
		this.indent = ""
		this.stmtDelim = ""
		def init = visit(node.initStmts).join(",");
		this.indent = oldIndent
		this.stmtDelim = ";"
		if(pre){
			return indent + "for(${init};${visit(pre)};)${body}"
		}else{
			return indent + "do{${body}}while(${visit(post)});"
		}
	}

	@Override
	public String visitReturnStmt(ReturnStmt node) {
		indent + "return ${visit(node.expr)};"
	}

	@Override
	public String visitVarDeclStmt(VarDeclStmt node) {
		String code = "${node.type} ${node.varName}"
		if(node.initExpr){
			code+= "=${visit(node.initExpr)}"
		}
		indent + code + this.stmtDelim;
	}

	@Override
	public String visitWhileStmt(WhileStmt node) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visitAssignExpr(AssignExpr node) {
		"${visit(node.to)}=${visit(node.from)}"
	}

	@Override
	public String visitBinaryExpr(BinaryExpr node) {
		"${visit(node.expr1)}${node.operation}${visit(node.expr2)}"
	}

	@Override
	public String visitConstExpr(ConstExpr node) {
		"${node.value}"
	}

	@Override
	public String visitElementExpr(ElementExpr node) {
		"${visit(node.target)}[${visit(node.key)}]"
	}

	@Override
	public String visitFieldExpr(FieldExpr node) {
		"visit(${node.target}).${node.fieldName}"
	}

	@Override
	public String visitInvocationExpr(InvocationExpr node) {
		def args = visit(node.arguments).join(",");
		"${node.methodName}($args)"
	}

	@Override
	public String visitUnaryExpr(UnaryExpr node) {
		"${node.preOperation?:''}${visit(node.expr)}${node.postOperation?:''}"
	}

	@Override
	public String visitNameExpr(NameExpr node) {
		"${node.name}"
	}

}
