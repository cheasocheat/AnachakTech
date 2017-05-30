package com.anachak.webservice.dao;

import com.anachak.webservice.model.Article;
import java.util.List;

/**
 * Created by cheasocheat on 4/6/17.
 */
public interface ArticleDao {
    void addArticle(Article article);
    void updateArticle(Article article);
    List<Article> listArticles();
    void deleteArticle(int id);
    Article getArticleById(int id);
}
