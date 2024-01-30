package com.ssafy.moiroomserver.oauth.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="kakao_member")
public class KakaoMember {

    @Id
    @Column(name = "kakao_member_id", columnDefinition = "CHAR(50)", nullable = false)
    private String kakaoMemberId;

    @Column(name="kakao_id", columnDefinition = "VARCHAR(100)")
    private String kakaoId;

    @Column(name="email", columnDefinition="VARCHAR(100)")
    private String email;

    @Column(name="oauth_type", columnDefinition="VARCHAR(50)")
    private String oauthType;
}