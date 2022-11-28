package com.lee.hotnews.service;

import com.lee.hotnews.entity.Article;

import java.util.List;

public interface ArticleService {

    List<Article> getAllArticles();

    void saveArticle(Article article);

    Article getArticleById(Long id);

    void deleteArticleById(Long id);
}
