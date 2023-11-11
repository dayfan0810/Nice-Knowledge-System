package org.example.design_partern.singleton_mode;

//安卓中大致搜了下，几乎没有采用这种方法的，看来这种炫技的技术没人赏脸
public class SingletonLanHan_5 {

    private SingletonLanHan_5() {

    }

    private volatile static SingletonLanHan_5 singletonLanHan2;
    public static SingletonLanHan_5 getSingletonLanHan5() {
        if (singletonLanHan2 == null) {
            synchronized (SingletonLanHan_5.class) {
                if (singletonLanHan2 == null) {
                    singletonLanHan2 = new SingletonLanHan_5();
                }
            }
        }
        return singletonLanHan2;
    }
}
