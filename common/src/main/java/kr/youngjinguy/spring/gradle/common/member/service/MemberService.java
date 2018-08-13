package kr.youngjinguy.spring.gradle.common.member.service;

import kr.youngjinguy.spring.gradle.common.member.entity.Member;
import org.springframework.stereotype.Service;

/**
 * @author youngjin.kim@nhnent.com
 * @since 2018-08-13
 */
@Service
public class MemberService {

    public Member getMember() {

        return new Member(1, "김영진");
    }
}
