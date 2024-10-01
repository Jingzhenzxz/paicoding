package com.github.paicoding.forum.web.javabetter.zsxq;

import cn.hutool.core.util.NumberUtil;
import cn.hutool.core.util.RandomUtil;

import java.util.Arrays;

public class Random {
    public static void main(String[] args) {
        // 使用 hutool 工具包生成随机数，目前有 96 人参与，抽 2 名锦鲤
        // 参数 1 为开始值（包含），参数 97 为结束值（不包含），参数 2 为抽取的数量
        Arrays.stream(NumberUtil.generateRandomNumber(1, 97, 2)).forEach(System.out::println);
    }
}