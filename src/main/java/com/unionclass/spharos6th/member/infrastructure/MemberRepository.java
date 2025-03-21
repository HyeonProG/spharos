package com.unionclass.spharos6th.member.infrastructure;

import com.unionclass.spharos6th.member.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {

    Optional<Member> findByEmail(String email);
    Optional<Member> findByMemberUuid(String uuid);

}
