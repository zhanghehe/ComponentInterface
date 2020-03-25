package com.hh.zujianhua;

import android.app.Application;

import com.hh.componentlib.IAppComponent;

/**
 * Create by alex on 2020-03-23
 * desc:
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        initialize(this);
    }

    public void initialize(Application app) {
        for (String component : AppConfig.COMPONENTS) {
            try {
                Class<?> clazz = Class.forName(component);
                Object object = clazz.newInstance();
                if (object instanceof IAppComponent) {
                    ((IAppComponent) object).initialize(this);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
