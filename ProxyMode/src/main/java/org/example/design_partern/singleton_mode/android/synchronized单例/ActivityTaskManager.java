package org.example.design_partern.singleton_mode.android.synchronized单例;

public class ActivityTaskManager {
    private static final Singleton<ActivityTaskManager> sInstance =
            new Singleton<ActivityTaskManager>() {
                @Override
                protected ActivityTaskManager create() {
                    return new ActivityTaskManager();
                }
            };

    private ActivityTaskManager() {
    }

    public static ActivityTaskManager getInstance() {
        return sInstance.get();
    }

}
