package com.ll.sb231127.domain.article.articleComment.entity;

import static jakarta.persistence.FetchType.*;
import static lombok.AccessLevel.*;

import com.ll.sb231127.domain.article.article.entity.Article;
import com.ll.sb231127.domain.member.member.entity.Member;
import com.ll.sb231127.global.jpa.baseEntity.BaseEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Entity
@SuperBuilder
@AllArgsConstructor(access = PROTECTED)
@NoArgsConstructor(access = PROTECTED)
@Getter
@Setter
@ToString(callSuper = true)
public class ArticleComment extends BaseEntity {
	@ManyToOne(fetch = LAZY)
	private Article article;
	@ManyToOne(fetch = LAZY)
	private Member author;
	private String body;
}
