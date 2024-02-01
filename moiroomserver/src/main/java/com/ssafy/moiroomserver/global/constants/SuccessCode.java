package com.ssafy.moiroomserver.global.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

import static org.springframework.http.HttpStatus.*;

@AllArgsConstructor
@Getter
public enum SuccessCode {

    //일반
    UPLOAD_IMAGE(OK, "이미지 업로드 성공"),
    //회원
    UPLOAD_PROFILE_IMAGE(OK, "프로필 사진 업로드 성공"),
    MODIFY_MEMBER_INFO(OK, "회원 정보 수정 성공"),
    ADD_MEMBER_INFO(CREATED, "회원 정보 추가 성공");

    private final HttpStatus status;
    private final String message;
}