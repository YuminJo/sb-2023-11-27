package com.ll.sb231127.domain.article.article.entity;

import static jakarta.persistence.GenerationType.*;
import static lombok.AccessLevel.*;

import com.ll.sb231127.domain.member.member.entity.Member;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor(access = PROTECTED)
@AllArgsConstructor(access = PROTECTED)
@Builder
@Getter
@Setter
@EqualsAndHashCode
public class Article {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;
    @ManyToOne
    private Member author;
    private String title;
    private String body;
}
