package kr.youngjinguy.spring.gradle.common.member.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author youngjin.kim@nhnent.com
 * @since 2018-08-13
 */
@Getter
@Setter
@AllArgsConstructor
public class Member {

    private int memberId;

    private String name;
}
