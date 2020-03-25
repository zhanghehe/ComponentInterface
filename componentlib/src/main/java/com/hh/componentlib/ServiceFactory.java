package com.hh.componentlib;

/**
 * Create by alex on 2020-03-23
 * desc:
 */
public class ServiceFactory {
    private static final ServiceFactory s = new ServiceFactory();

    public static ServiceFactory getInstance() {
        return s;
    }

    private ILoginService loginService;
    private IMineService mineService;

    public ILoginService getLoginService() {
        if (loginService == null) {
            return new EmptyLoginService();
        } else {
            return loginService;
        }

    }

    public void setLoginService(ILoginService loginService) {
        this.loginService = loginService;
    }

    public IMineService getMineService() {
        return mineService;
    }

    public void setMineService(IMineService mineService) {
        this.mineService = mineService;
    }
}
