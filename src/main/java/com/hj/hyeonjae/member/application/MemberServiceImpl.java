package com.hj.hyeonjae.member.application;

import com.hj.hyeonjae.member.domain.Member;
import com.hj.hyeonjae.member.dto.in.MemberAddDTO;
import com.hj.hyeonjae.member.infrastructure.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

    @Override
    public void addMember(MemberAddDTO memberAddDTO) {
        memberRepository.save(memberAddDTO.toEntity(UUID.randomUUID().toString()));
    }

    @Override
    public UserDetails loadUserByUsername(String memberUuid) {
        return memberRepository.findByUUID(memberUuid).orElseThrow(() -> new IllegalArgumentException(memberUuid));
    }
}
