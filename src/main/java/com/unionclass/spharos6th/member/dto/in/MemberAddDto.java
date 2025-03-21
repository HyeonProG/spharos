package com.unionclass.spharos6th.member.dto.in;

import com.unionclass.spharos6th.member.domain.Member;
import com.unionclass.spharos6th.member.vo.MemberSignUpVo;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class MemberAddDto {
    private String name;
    private String email;
    private String password;
    private String phoneNumber;
    private String birth;

    public Member toEntity(String memberUuid) {
        return Member.builder()
                .memberUuid(memberUuid)
                .name(name)
                .email(email)
                .password(password)
                .phoneNumber(phoneNumber)
                .birth(birth)
                .build();
    }

    public static MemberAddDto from(MemberSignUpVo memberSignUpVo) {
        return MemberAddDto.builder()
                .name(memberSignUpVo.getName())
                .email(memberSignUpVo.getEmail())
                .password(memberSignUpVo.getPassword())
                .phoneNumber(memberSignUpVo.getPhoneNumber())
                .birth(memberSignUpVo.getBirth())
                .build();
    }

}
