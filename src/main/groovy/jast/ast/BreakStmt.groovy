/*
Don't modify!This file is generated automately.
*/
package jast.ast;
import java.util.*;
public class BreakStmt extends Statement{
    
    
    
    
    public static BreakStmt create(){
        BreakStmt node = new BreakStmt();
        
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
        
        return ls;
    }
    
    public String toString(){
        String str = "BreakStmt{\r\n";
        
        return str+"}";
    }
}