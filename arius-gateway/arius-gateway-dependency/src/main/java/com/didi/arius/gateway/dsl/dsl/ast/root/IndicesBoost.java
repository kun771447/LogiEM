package com.didi.arius.gateway.dsl.dsl.ast.root;

import com.didi.arius.gateway.dsl.dsl.ast.common.KeyWord;
import com.didi.arius.gateway.dsl.dsl.ast.common.Node;
import com.didi.arius.gateway.dsl.dsl.visitor.basic.Visitor;

public class IndicesBoost extends KeyWord {

    public Node n;

    public IndicesBoost(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor vistor) {
        vistor.visit(this);
    }
}