package com.ray.rayojcodesandbox.model;

import lombok.Data;

/**
 * 判题信息
 */
@Data
public class JudgeInfo {
    /**
     * 程序执行信息
     */
    private String message;

    /**
     * 程序执行时间(ms)
     */
    private Long time;

    /**
     * 程序占用内存(kb)
     */
    private Long memory;
}
