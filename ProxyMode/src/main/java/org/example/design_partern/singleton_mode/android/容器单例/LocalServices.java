package org.example.design_partern.singleton_mode.android.容器单例;

import java.util.HashMap;

/**
 * 安卓源码实是设计模式一书的单例模式中讲到，可以使用容器实现单例模式，就发现很多安卓源码里面用到了这种方法
 * LocalServices是使用ArrayMap去实现的，我这里为了能编译pass，改成了hashMap，一样的
 */

/**
 * This class is used in a similar way as ServiceManager, except the services registered here
 * are not Binder objects and are only available in the same process.
 *
 * Once all services are converted to the SystemService interface, this class can be absorbed
 * into SystemServiceManager.
 *
 */
public final class LocalServices {
    private LocalServices() {}

    private static final HashMap<Class<?>, Object> sLocalServiceObjects =
            new HashMap<Class<?>, Object>();

    /**
     * Returns a local service instance that implements the specified interface.
     *
     * @param type The type of service.
     * @return The service object.
     */
    @SuppressWarnings("unchecked")
    public static <T> T getService(Class<T> type) {
        synchronized (sLocalServiceObjects) {
            return (T) sLocalServiceObjects.get(type);
        }
    }

    /**
     * Adds a service instance of the specified interface to the global registry of local services.
     */
    public static <T> void addService(Class<T> type, T service) {
        synchronized (sLocalServiceObjects) {
            if (sLocalServiceObjects.containsKey(type)) {
                throw new IllegalStateException("Overriding service registration");
            }
            sLocalServiceObjects.put(type, service);
        }
    }
}
