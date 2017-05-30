package com.anachak.webservice.controller;

import com.anachak.webservice.model.Article;
import com.anachak.webservice.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cheasocheat on 4/6/17.
 */
@Controller
@RequestMapping("/")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @RequestMapping(method = RequestMethod.GET)
    public String sayHello(ModelMap model) {
        model.addAttribute("message", "Anachak Tech Client");
        return "welcome";
    }


    @RequestMapping(value = "/articles", method = RequestMethod.GET)
    public String listArticles(Model model){
        List<Article> lstArticles = this.articleService.listArticles();
        if(lstArticles == null){
            lstArticles = new ArrayList<>();
        }
        model.addAttribute("article", new Article());
        model.addAttribute("lstArticles",lstArticles);
        return "index";
    }
}
