package com.anachak.webservice.service;

import com.anachak.webservice.model.Article;
import java.util.List;

/**
 * Created by cheasocheat on 4/6/17.
 */
public interface ArticleService {
    void addArticle(Article article);
    void updateArticle(Article article);
    List<Article> listArticles();
    void deleteArticle(int id);
    Article getArticleById(int id);
}
