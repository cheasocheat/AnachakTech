package com.anachak.webservice.service.impl;

import com.anachak.webservice.dao.ArticleDao;
import com.anachak.webservice.model.Article;
import com.anachak.webservice.service.ArticleService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by cheasocheat on 4/6/17.
 */
@Service
public class ArticleServiceImpl implements ArticleService{
    @Autowired
    private ArticleDao dao;

    @Override
    @Transactional
    public void addArticle(Article article) {
        dao.addArticle(article);
    }

    @Override
    @Transactional
    public void updateArticle(Article article) {
        dao.updateArticle(article);
    }

    @Override
    @Transactional
    public List<Article> listArticles() {
        return dao.listArticles();
    }

    @Override
    @Transactional
    public void deleteArticle(int id) {
        dao.deleteArticle(id);
    }

    @Override
    @Transactional
    public Article getArticleById(int id) {
        return dao.getArticleById(id);
    }

    public void setDao(ArticleDao dao) {
        this.dao = dao;
    }
}
