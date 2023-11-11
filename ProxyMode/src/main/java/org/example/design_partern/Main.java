package org.example.design_partern;

//此com.example.proxy_mode_learn包，copy到idea运行
//此目录主要是想解释静态代理类，动态代理需要使用InvocationHandler,后续再填坑
public class Main {
    public static void main(String[] args) {
        ILawSuit me = new Me();
        ZhangWei zhangWei = new ZhangWei(me);
        zhangWei.submit();
        zhangWei.defend();
        zhangWei.finish();
    }

    /*
    打印结果：
    老板拖欠工资 申请仲裁！
    证据确凿 铁证如山！
    诉讼成功！
     */

    /*

     */
}