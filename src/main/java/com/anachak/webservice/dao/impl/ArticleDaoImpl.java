package com.anachak.webservice.dao.impl;

import com.anachak.webservice.dao.ArticleDao;
import com.anachak.webservice.model.Article;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * Created by cheasocheat on 4/6/17.
 */
@Repository
public class ArticleDaoImpl implements ArticleDao {

    private static final Logger logger = LoggerFactory.getLogger(ArticleDaoImpl.class);

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addArticle(Article article) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(article);
        logger.info("Article saved successfully, Article Details = " + article);
    }

    @Override
    public void updateArticle(Article article) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(article);
        logger.info("Article updated successfully, Article Details="+article);
    }

    @Override
    public List<Article> listArticles() {
        logger.info(">>Anachak :: list article");
        Session session = this.sessionFactory.getCurrentSession();
        List<Article> lstArticles = session.createQuery("from Article").list();
        for (Article article : lstArticles) {
            logger.info("Article List :: " + article);
        }
        return lstArticles;
    }

    @Override
    public void deleteArticle(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Article article = (Article) session.load(Article.class, new Integer(id));
        if (null != article) {
            session.delete(article);
        }
        logger.info("Article deleted successfully, Article details=" + article);
    }

    @Override
    public Article getArticleById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Article article = (Article) session.load(Article.class, new Integer(id));
        logger.info("Article loaded successfully, Article details=" + article);
        return article;
    }
}
