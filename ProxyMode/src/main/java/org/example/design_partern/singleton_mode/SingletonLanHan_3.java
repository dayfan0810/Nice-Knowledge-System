package org.example.design_partern.singleton_mode;

//发现WindowManagerGlobal用了这个方法
public class SingletonLanHan_3 {

    private SingletonLanHan_3() {

    }

    private static SingletonLanHan_3 singletonLanHan2;

    //这样其实还是不行，因为只要线程A和B都跑进去到if里面，还是都会各自new一个实例
    //所以那就在锁里面再加个判断，见SingletonLanHan_3
    public static SingletonLanHan_3 getSingletonLanHan3() {
        if (singletonLanHan2 == null) {
            synchronized (SingletonLanHan_3.class){
                singletonLanHan2 = new SingletonLanHan_3();
            }
        }
        return singletonLanHan2;
    }
}
