package com.lixiang.behaviormode.interpreter;

import java.util.Stack;

/**
 * 解释器封装类
 * （坚持理解看完）
 */
public class Calculator {
    private String statement;
    private Node node;
    public void build(String statement){
        Node left = null,right = null;
        Stack<Node> stack = new Stack();
        String[] s = statement.split(" ");
        for (int i = 0; i < s.length; i++) {
            if (s[i].equalsIgnoreCase("*")){
                left = stack.pop();
                int value = Integer.parseInt(s[++i]);
                right = new ValueNode(value);
                stack.push(new MulNode(left,right));
            }else if (s[i].equalsIgnoreCase("/")){
                left = stack.pop();
                int value = Integer.parseInt(s[++i]);
                right = new ValueNode(value);
                stack.push(new DivNode(left,right));
            }else if (s[i].equalsIgnoreCase("%")){
                left = stack.pop();
                int value = Integer.parseInt(s[++i]);
                right = new ValueNode(value);
                stack.push(new ModNode(left,right));
            }else {
                stack.push(new ValueNode(Integer.parseInt(s[i])));
            }
        }
        this.node = stack.pop();
    }

    public int compute(){
       return node.interpret();
    }
}
