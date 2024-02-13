package com.ssafy.moiroomserver.chat.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ChatMessageDTO {

    private Long memberId;
    private String memberProfileImage;
    private String content;
    private String createdAt;
}
