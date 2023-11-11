package org.example.design_partern.singleton_mode;

//饿汉模式，是初始化类时就new了
//安卓中ArgbEvaluator  DexLoadReporter 用了这种方法
public class SingletonEHan_1 {
    private SingletonEHan_1() {
        //私有构造，外界无法new
    }

    //类加载时就会被初始化了
    private static SingletonEHan_1 singletonEHan1 = new SingletonEHan_1();

    public static SingletonEHan_1 getSingletonEHan1() {
        return singletonEHan1;
    }
}
