package cn.eleven.springbootstarter.demo.service;

import lombok.AllArgsConstructor;

/**
 * @description: 包装
 * @date: 2019-09-23 21:23
 * @author: 十一
 */
@AllArgsConstructor
public class SomeService {

    private String before;

    private String after;

    public String wrap(String word) {
        return before + word + after;
    }
}
