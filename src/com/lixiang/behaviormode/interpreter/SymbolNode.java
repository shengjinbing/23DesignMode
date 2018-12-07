package com.lixiang.behaviormode.interpreter;

/**
 * 抽象的非终结符表达式类
 * 所有的非终结符都对应左右两个操作部分
 */
public abstract class SymbolNode implements Node{

    protected  Node  left;
    protected  Node  right;

    public SymbolNode(Node left, Node right) {
        this.left = left;
        this.right = right;
    }

}
