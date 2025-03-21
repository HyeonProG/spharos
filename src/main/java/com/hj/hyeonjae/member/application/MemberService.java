package com.hj.hyeonjae.member.application;

import com.hj.hyeonjae.member.dto.in.MemberAddDTO;
import org.springframework.security.core.userdetails.UserDetails;

public interface MemberService {

    void addMember(MemberAddDTO memberAddDTO);

    UserDetails loadUserByUsername(String memberUUID);

}
