package com.unionclass.spharos6th.member.dto.in;

import com.unionclass.spharos6th.member.domain.Gender;
import com.unionclass.spharos6th.member.domain.Member;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Date;
import java.util.UUID;

@Getter
@NoArgsConstructor
@ToString
public class SignUpRequestDto {

    private String email;
    private String password;
    private String name;
    private String phoneNumber;
    private String nickname;
    private Date birth;
    private String address;
    private String memberUuid;
    private Gender gender;

    @Builder
    public SignUpRequestDto(
            String email,
            String password,
            String name,
            String memberUuid,
            String phoneNumber,
            String nickname,
            Date birth,
            String address,
            Gender gender
    ) {
        this.email = email;
        this.password = password;
        this.name = name;
        this.memberUuid = memberUuid;
        this.phoneNumber = phoneNumber;
        this.nickname = nickname;
        this.birth = birth;
        this.address = address;
        this.gender = gender;
    }

//    public Member toEntity( String email)

//    public static SignUpRequestDto from(SignUpRequestVo signUpRequestVo) {
//        return SignUpRequestDto.builder()
//                .email(signUpRequestVo.getEmail())
//                .password(signUpRequestVo.getPassword())
//                .name(signUpRequestVo.getName())
//                .phoneNumber(signUpRequestVo.getPhoneNumber())
//                .nickname(signUpRequestVo.getNickname())
//                .birth(signUpRequestVo.getBirth())
//                .address(signUpRequestVo.getAddress())
//                .gender(signUpRequestVo.getGender())
//                .build();
//    }
}
