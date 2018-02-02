package com.gnnt.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import org.apache.log4j.Logger;

public class MySessionListener implements HttpSessionListener{  

    Logger log = Logger.getLogger(getClass());

    @Override  
    public void sessionCreated(HttpSessionEvent se){
        log.info("session 已创建");
    }  

    @Override      
    public void sessionDestroyed(HttpSessionEvent se){  
       log.info("session 已失效");
    }  

 }  