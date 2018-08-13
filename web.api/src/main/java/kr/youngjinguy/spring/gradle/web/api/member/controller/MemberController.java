package kr.youngjinguy.spring.gradle.web.api.member.controller;

import kr.youngjinguy.spring.gradle.common.member.entity.Member;
import kr.youngjinguy.spring.gradle.common.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author youngjin.kim@nhnent.com
 * @since 2018-08-13
 */
@RestController
@RequestMapping("/members")
public class MemberController {

    @Autowired
    private MemberService memberService;

    @RequestMapping("/{id}")
    public Member getMember(@PathVariable("id") int id) {
        return memberService.getMember();
    }
}
