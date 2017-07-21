package com.anachak.webservice;

import com.anachak.webservice.webservice.article.ArticleSRV;
import org.glassfish.jersey.server.ResourceConfig;

/**
 * Created by cheasocheat on 7/21/17.
 */
public class MyApplication extends ResourceConfig {
    public MyApplication() {
        //packages("com.anachak.webservice.webservice.article");
        register(ArticleSRV.class);
    }
}
