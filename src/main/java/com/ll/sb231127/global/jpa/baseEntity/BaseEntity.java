package com.ll.sb231127.global.jpa.baseEntity;

import static jakarta.persistence.GenerationType.*;
import static lombok.AccessLevel.*;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@SuperBuilder
@NoArgsConstructor(access = PROTECTED)
@Getter
@EqualsAndHashCode
@ToString
public class BaseEntity {
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@EqualsAndHashCode.Include
	private Long id;
	@CreatedDate
	private LocalDateTime createDate;
	@Setter
	private LocalDateTime modifyDate;
}
