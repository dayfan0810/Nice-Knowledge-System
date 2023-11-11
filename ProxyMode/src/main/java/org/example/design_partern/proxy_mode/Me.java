package org.example.design_partern.proxy_mode;

//诉讼人
public class Me implements ILawSuit{
    @Override
    public void submit() {
        System.out.println("老板拖欠工资 申请仲裁！");
    }

    @Override
    public void defend() {
        System.out.println("证据确凿 铁证如山！");

    }

    @Override
    public void finish() {
        System.out.println("诉讼成功！");

    }
}
