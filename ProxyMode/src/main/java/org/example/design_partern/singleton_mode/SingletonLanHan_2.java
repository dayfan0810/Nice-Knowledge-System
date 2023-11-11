package org.example.design_partern.singleton_mode;

//极简版的懒汉式单例类,它在第一次调用getInstance方法的时候实例化，这种技术又称为延迟加载技术，即在需要的时候才加载实例
//发现安卓中的WatchDog.java就是这种方法
public class SingletonLanHan_2 {
    private SingletonLanHan_2() {
    }

    private static SingletonLanHan_2 singletonLanHan2;

    //当出现多个线程去执行getSingletonLanHan2时，会出现，比如线程A执行到if里面，发现为null，这时候线程B也执行到if里面，发现也为null
    //这时候就会出现，A和B线程都去new了一个SingletonLanHan_2.
    //解决方法是不是说加个synchronized就好了呢？
    //很明显，如果每次调用getSingletonLanHan2方法都会同步方法，没有必要的性能开销
    //这时候需要把synchronized放到new里面，参考SingletonLanHan_3
    public synchronized static SingletonLanHan_2 getSingletonLanHan2() {
        if (singletonLanHan2 == null) {
            singletonLanHan2 = new SingletonLanHan_2();
        }
        return singletonLanHan2;
    }
}
