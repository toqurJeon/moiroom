package com.ssafy.moiroomserver.member.controller;

import com.ssafy.moiroomserver.global.constants.SuccessCode;
import com.ssafy.moiroomserver.global.dto.ApiResponse;
import com.ssafy.moiroomserver.member.dto.AddMemberDto;
import com.ssafy.moiroomserver.member.dto.MemberInfo;
import com.ssafy.moiroomserver.member.dto.MemberTokenDto;
import com.ssafy.moiroomserver.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberController {

    private final MemberService memberService;

    @PatchMapping
    public ApiResponse<?> modifyMemberInfo(@RequestBody MemberInfo.ModifyRequest infoModifyRequest) {
        memberService.modifyMemberInfo(infoModifyRequest);

        return ApiResponse.success(SuccessCode.MODIFY_MEMBER_INFO);
    }

    /**
     * 카카오 회원 로그인
     * @param accountDto
     * @return
     */
    @PostMapping("/login")
    public ApiResponse<?> login(@RequestBody AddMemberDto accountDto) {
        memberService.login(accountDto);
        return ApiResponse.success(SuccessCode.LOGIN_MEMBER);
    }

    /**
     * 카카오 회원 토큰 업데이트
     * 재로그인 시 카카오 토큰 정보 업데이트
     * @return
     */
    @PatchMapping("/{memberId}")
    public ApiResponse<?> modifyMemberToken(@PathVariable Long memberId,
                                            @RequestBody MemberTokenDto tokenDto) {
        memberService.modifyMemberToken(memberId, tokenDto);
        return ApiResponse.success(SuccessCode.MODIFY_MEMBER_TOKEN);
    }
}