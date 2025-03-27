package com.unionclass.spharos6th.member.presentation;

import com.unionclass.spharos6th.member.application.MemberService;
import com.unionclass.spharos6th.member.dto.in.MemberAddDto;
import com.unionclass.spharos6th.member.dto.in.SignInRequestDto;
import com.unionclass.spharos6th.member.vo.MemberSignUpVo;
import com.unionclass.spharos6th.member.vo.SignInRequestVo;
import com.unionclass.spharos6th.member.vo.SignInResponseVo;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1/member")
@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;


    /**
     * api/v1/member
     * 1. 회원가입
     * 2. 로그인
     * 3. 로그아웃
     * 4. 소셜로그인
     */

    /**
     * 회원가입
     * @param memberSignUpVo
     */
    @Operation(summary = "SignUp API", description = "회원가입 API", tags = {"Member-Service"})
    @PostMapping("/sign-up")
    public void singUp(
          @RequestBody MemberSignUpVo memberSignUpVo
    ) {
        memberService.addMember(MemberAddDto.from(memberSignUpVo));
    }

    /**
     * 로그인
     * @param signInRequestVo
     * @return SignInResponseVo
     */
    @Operation(summary = "SignIn API", description = "SignIn API 입니다.", tags = {"Member-service"})
    @PostMapping("/sign-in")
    public SignInResponseVo signIn(
          @RequestBody SignInRequestVo signInRequestVo
    ) {
        return memberService.signIn(SignInRequestDto.from(signInRequestVo)).toVo();
    }
}
