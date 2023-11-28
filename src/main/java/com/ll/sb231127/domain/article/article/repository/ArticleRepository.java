package com.ll.sb231127.domain.article.article.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ll.sb231127.domain.article.article.entity.Article;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}