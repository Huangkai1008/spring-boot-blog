package com.huangkai.blog.controller;

import com.huangkai.blog.entity.Article;
import com.huangkai.blog.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class ArticleController {

    private final
    ArticleRepository articleRepository;

    @Autowired
    public ArticleController(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @CrossOrigin(origins = "*", maxAge = 3600)
    @GetMapping(name = "/articles", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Article> getArticles() {

        return articleRepository.findAll();
    }
}
