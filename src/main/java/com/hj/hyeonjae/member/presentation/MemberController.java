package com.hj.hyeonjae.member.presentation;

import com.hj.hyeonjae.member.application.MemberService;
import com.hj.hyeonjae.member.dto.in.MemberAddDTO;
import com.hj.hyeonjae.member.vo.MemberSignUpVO;
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

    @PostMapping("/sign-up")
    public void signUp(@RequestBody MemberSignUpVO memberSignUpVO) {
        memberService.addMember(MemberAddDTO.from(memberSignUpVO));
    }

}
