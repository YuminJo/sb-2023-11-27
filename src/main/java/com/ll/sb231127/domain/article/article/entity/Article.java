package com.ll.sb231127.domain.article.article.entity;

import static jakarta.persistence.CascadeType.*;
import static jakarta.persistence.FetchType.*;
import static lombok.AccessLevel.*;

import java.util.ArrayList;
import java.util.List;

import com.ll.sb231127.domain.article.articleComment.entity.ArticleComment;
import com.ll.sb231127.domain.member.member.entity.Member;
import com.ll.sb231127.global.jpa.baseEntity.BaseEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
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
public class Article extends BaseEntity {
    @ManyToOne(fetch = LAZY)
    private Member author;
    private String title;
    private String body;
	@OneToMany(mappedBy = "article", cascade = ALL, orphanRemoval = true)
	@Builder.Default
	private List<ArticleComment> comments = new ArrayList<>();

	public void addComment(Member commentAuthor, String commentBody) {
		ArticleComment comment = ArticleComment
			.builder()
			.article(this)
			.author(commentAuthor)
			.body(commentBody)
			.build();

		comments.add(comment);
	}

	public void removeComment(ArticleComment comment) {
		comments.remove(comment);
	}
}
