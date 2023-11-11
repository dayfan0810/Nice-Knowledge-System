package org.example.design_partern.singleton_mode;


public class SingletonLanHan_4 {

    private SingletonLanHan_4() {

    }

    private static SingletonLanHan_4 singletonLanHan2;

    //其实到这里，基本都OK了，但是如果了解JVM的指令重排以及内存屏障，就是jvm的内存模型，后续再复习下，也不难
    //可以看看processon里面总结的
    //会出现DCL失效问题，解决办法就是在声明getSingletonLanHan4时加volatile
    public static  SingletonLanHan_4 getSingletonLanHan4() {
        if (singletonLanHan2 == null) {
            synchronized (SingletonLanHan_4.class) {
                if (singletonLanHan2 == null) {
                    singletonLanHan2 = new SingletonLanHan_4();
                }
            }
        }
        return singletonLanHan2;
    }
}
