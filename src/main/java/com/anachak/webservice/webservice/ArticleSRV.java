package com.anachak.webservice.webservice;

import com.anachak.webservice.model.Article;
import com.anachak.webservice.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by cheasocheat on 4/6/17.
 */
@Component
@Path("article")
public class ArticleSRV {

    @Autowired
    private ArticleService articleService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getArticle() {
        return "HELLO ARTICLE";
    }

    @GET
    @Path("/list_articles")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public List<Article> listAllArticle(){
        List<Article> lstArticles = articleService.listArticles();
        return lstArticles == null ? new ArrayList<>() : lstArticles;
    }
}
