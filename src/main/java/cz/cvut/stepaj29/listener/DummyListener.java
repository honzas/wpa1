/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cz.cvut.stepaj29.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Web application lifecycle listener.
 *
 * @author jan
 */
public class DummyListener implements ServletContextListener {

    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("app loaded");
    }

    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("app destroyed");
    }
}
