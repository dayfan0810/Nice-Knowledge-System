package org.example.design_partern.proxy_mode;

//律师
public class ZhangWei implements ILawSuit {
    private ILawSuit mILawSuit;

    public ZhangWei(ILawSuit mILawSuit) {
        this.mILawSuit = mILawSuit;
    }

    @Override
    public void submit() {
        mILawSuit.submit();
    }

    @Override
    public void defend() {
        mILawSuit.defend();
    }

    @Override
    public void finish() {
        mILawSuit.finish();
    }
}
