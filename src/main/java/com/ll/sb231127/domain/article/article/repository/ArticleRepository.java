package com.ll.sb231127.domain.article.article.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ll.sb231127.domain.article.article.entity.Article;

public interface ArticleRepository extends JpaRepository<Article, Long> {
	List<Article> findByOrderByIdDesc();
}
