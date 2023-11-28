package com.ll.sb231127.domain.article.articleComment.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ll.sb231127.domain.article.articleComment.entity.ArticleComment;

public interface ArticleCommentRepository extends JpaRepository<ArticleComment, Long> {
	Optional<ArticleComment> findFirstByOrderByIdDesc();
	Optional<ArticleComment> findFirstByArticleIdOrderByIdDesc(long l);
}
