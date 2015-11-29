/*
Don't modify!This file is generated automately.
*/
package jast.ast;
import java.util.*;
public class ClassNode extends AstNode{
    
    public Integer modifier;
    
    public String name;
    
    public String parentName;
    
    public List<FieldNode> fields;
    
    public List<MethodNode> methods;
    
    
    
    public ClassNode(Integer modifier=null,String name=null,String parentName=null,List<FieldNode> fields=null,List<MethodNode> methods=null){
        
            this.modifier = modifier;
        
            this.name = name;
        
            this.parentName = parentName;
        
            this.fields = fields;
        
            this.methods = methods;
        
    }
    
    
    public static ClassNode create(){
        ClassNode node = new ClassNode();
        
        node.fields = new LinkedList();
        
        node.methods = new LinkedList();
        
        return node;
    }
    
    private void addChild(List<AstNode> list,List nodes){
        if(nodes!=null) list.addAll(nodes);
    }
    
    private void addChild(List<AstNode> list,AstNode node){
        if(node!=null) list.add(node);
    }
    
    public List<AstNode> getChildren(){
        List<AstNode> ls = new LinkedList();
        
        addChild(ls,fields);
        
        addChild(ls,methods);
        
        return ls;
    }
    
    public String toString(){
        String str = "ClassNode{\r\n";
        
        str += "  modifier:" + modifier.toString()+"\r\n";
        
        str += "  name:" + name.toString()+"\r\n";
        
        str += "  parentName:" + parentName.toString()+"\r\n";
        
        str += "  fields:" + fields.toString()+"\r\n";
        
        str += "  methods:" + methods.toString()+"\r\n";
        
        return str+"}";
    }
}