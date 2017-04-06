package com.anachak.webservice.webservice.article;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by cheasocheat on 4/6/17.
 */
@Path("/article")
public class Article {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getArticle(){
        return "HELLO ARTICLE";
    }
}
