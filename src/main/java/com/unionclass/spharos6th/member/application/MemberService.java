package com.unionclass.spharos6th.member.application;

import com.unionclass.spharos6th.member.dto.in.MemberAddDto;
import com.unionclass.spharos6th.member.dto.in.SignInRequestDto;
import com.unionclass.spharos6th.member.dto.in.SignUpRequestDto;
import com.unionclass.spharos6th.member.dto.out.SignInResponseDto;
import org.springframework.security.core.userdetails.UserDetails;

public interface MemberService {

    /**
     * Member service interface
     * 1. addMember
     * 2. signUp
     * 3. signIn
     * 4. loadUserByUsername
     */

    /**
     * 1. Add member
     * @param memberAddDto
     */
    void addMember(MemberAddDto memberAddDto);

    /**
     * 2. Sign up
     * @param signUpRequestDto
     */
    void signUp(SignUpRequestDto signUpRequestDto);

    /**
     * 3. Sign in
     * @param signInRequestDto
     * @return SignInResponseDto
     */
    SignInResponseDto signIn(SignInRequestDto signInRequestDto);

    /**
     * 4. Load user by username
     * @param memberUuid
     * @return UserDetails
     */
    UserDetails loadUserByUsername(String memberUuid);

}
