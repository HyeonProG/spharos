package com.hj.hyeonjae.member.infrastructure;

import com.hj.hyeonjae.member.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
