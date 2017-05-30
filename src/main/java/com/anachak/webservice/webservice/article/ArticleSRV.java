package com.anachak.webservice.webservice.article;

import com.anachak.webservice.model.Article;

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
@Path("article")
public class ArticleSRV {

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
        List<Article> lstArticles = new ArrayList<>();
        Article article = null;
        for (int i = 1; i <= 10; i++) {
            article = new Article();
            article.setId(i);
            article.setSummary("Article " + i);
            article.setDescription("Desc " + i);
            lstArticles.add(article);
        }
        return lstArticles;
    }
}
