package com.hj.hyeonjae.member.dto.in;

import com.hj.hyeonjae.member.domain.Member;
import com.hj.hyeonjae.member.vo.MemberSignUpVO;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class MemberAddDTO {
    private String name;
    private String email;
    private String password;
    private String phoneNumber;
    private String birth;

    public Member toEntity(String memberUUID) {
        return Member.builder()
                .memberUUID(memberUUID)
                .name(name)
                .email(email)
                .password(password)
                .phoneNumber(phoneNumber)
                .birth(birth)
                .build();
    }

    public static MemberAddDTO from(MemberSignUpVO memberSignUpVO) {
        return MemberAddDTO.builder()
                .name(memberSignUpVO.getName())
                .email(memberSignUpVO.getEmail())
                .password(memberSignUpVO.getPassword())
                .phoneNumber(memberSignUpVO.getPhoneNumber())
                .birth(memberSignUpVO.getBirth())
                .build();
    }

}
