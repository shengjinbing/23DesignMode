package com.lixiang.behaviormode.interpreter;

/**
 * 乘法结点
 */
public class ModNode extends SymbolNode {
    public ModNode(Node left, Node right) {
        super(left, right);
    }

    @Override
    public int interpret() {
        return super.left.interpret()%super.right.interpret();
    }
}
