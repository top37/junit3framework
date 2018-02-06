package com.study.model.adaptermodel;

public class YBT implements ACBC{

    private ABcore aBcore;

    public YBT(ABcore aBcore) {
        this.aBcore = aBcore;
    }

    @Override
    public void underwrite() {
        aBcore.hebao();
    }
}
