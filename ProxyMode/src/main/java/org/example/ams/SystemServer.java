package org.example.ams;

public class SystemServer {
    public static void main(String[] args) {
        AMS ams = new AMS();

        ams.systemReady(() -> {
            System.out.println("AAA");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("BBB");
        });
    }
}

class AMS {
    public void systemReady(final Runnable goingCallback) {
        System.out.println("111");
        goingCallback.run();
        System.out.println("222");
    }
}


/*

在您提供的代码中，我们可以看到在 `SystemServer` 类的 `main` 方法中，我们实例化了 `AMS` 类的对象 `ams`。然后我们调用了 `ams` 对象的 `systemReady` 方法，并传递了一个 `Runnable` 匿名类作为参数。

在 `systemReady` 方法中，我们看到它打印了 `222`，但并没有调用传递的 `Runnable` 对象的 `run` 方法。这是因为您的 `systemReady` 方法并没有调用传递的 `Runnable` 对象。如果您希望 `333` 被执行，您需要在 `systemReady` 方法中调用传递的 `Runnable` 对象的 `run` 方法。

您可以通过在 `systemReady` 方法中添加 `goingCallback.run()` 来执行传递的 `Runnable` 对象的 `run` 方法。修改后的代码应该如下所示：

```java
class SystemServer {
    public static void main(String[] args) {
        AMS ams = new AMS();
        System.out.println("111");
        ams.systemReady(new Runnable() {
            @Override
            public void run() {
                System.out.println("333");
            }
        });
    }
}

class AMS {
    public void systemReady(final Runnable goingCallback){
        System.out.println("222");
        goingCallback.run(); // 调用传递的Runnable对象的run方法
    }
}
```

通过在 `systemReady` 方法中调用 `goingCallback.run()`，您将会看到 `333` 被执行并打印在控制台上。


class SystemServer {
    public static void main(String[] args) {
        AMS ams = new AMS();
        System.out.println("111");
        ams.systemReady(new Runnable() {
            @Override
            public void run() {
                System.out.println("333");
            }
        });
    }
}

class AMS {
    public void systemReady(final Runnable goingCallback){
        System.out.println("222");
        goingCallback.run(); // 调用传递的Runnable对象的run方法
    }
}

 */