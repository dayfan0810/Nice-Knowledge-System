package org.example.design_partern.singleton_mode;

//静态内部类单例模式
//安卓中SystemCertificateSource使用了这种方法
public class SingleRecomand_6 {
    private SingleRecomand_6() {
    }

    public static SingleRecomand_6 getInstance() {
        return SingleHolder.sInstance;
    }

    private static class SingleHolder {
        private static final SingleRecomand_6 sInstance = new SingleRecomand_6();
    }
}

//我们其实可以看看Android源码的AMS里面有很多getSin