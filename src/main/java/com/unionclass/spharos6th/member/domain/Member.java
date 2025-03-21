package com.unionclass.spharos6th.member.domain;

import com.unionclass.spharos6th.common.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.UUID;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member extends BaseEntity implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String memberUuid;

    @Comment("회원 이름")
    @Column(nullable = false, length = 100)
    private String name;

    @Comment("회원 닉네임")
    @Column(nullable = false, unique = true, length = 100)
    private String email;
    private String password;
    private String phoneNumber;
    private String birth;

    @Builder
    public Member(
            Long id,
            String memberUuid,
            String name,
            String email,
            String password,
            String phoneNumber,
            String birth
    ) {
        this.id = id;
        this.memberUuid = memberUuid;
        this.name = name;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.birth = birth;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of();
    }

    @Override
    public String getUsername() {
        return this.memberUuid;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

}
