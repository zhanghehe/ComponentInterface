package com.hh.logincompoent;

import android.app.Application;

import com.hh.componentlib.IAppComponent;
import com.hh.componentlib.ServiceFactory;

/**
 * Create by alex on 2020-03-23
 * desc:
 */
public class LoginApplication extends Application implements IAppComponent {
    private static Application app;

    public static Application getApp() {
        return app;
    }

    @Override
    public void initialize(Application app) {
        ServiceFactory.getInstance().setLoginService(new LoginService());
    }
}
