package com.jwx.system.controller;

import com.jfinal.core.Controller;

/**
 * Created by shiguangqi on 2015/11/28.
 */
public class AdminController extends Controller {
    public  void index(){
        this.renderText("hello world");
    }
}
