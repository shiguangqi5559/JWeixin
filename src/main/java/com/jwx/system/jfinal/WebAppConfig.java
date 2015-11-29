package com.jwx.system.jfinal;

import com.jfinal.config.*;
import com.jwx.system.controller.AdminController;

/**
 * Created by shiguangqi on 2015/11/28.
 */
public class WebAppConfig extends JFinalConfig {

    public void configConstant(Constants me) {
        me.setDevMode(true);
    }

    public void configRoute(Routes me) {
        me.add("/hello", AdminController.class);
    }

    public void configPlugin(Plugins me) {
    }

    public void configInterceptor(Interceptors me) {
    }

    public void configHandler(Handlers me) {
    }

}
