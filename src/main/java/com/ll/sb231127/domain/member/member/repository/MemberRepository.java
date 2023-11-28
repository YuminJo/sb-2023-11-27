package com.ll.sb231127.domain.member.member.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ll.sb231127.domain.member.member.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {
}