package com.ray.rayojcodesandbox.model;

import lombok.Data;

/**
 * 继承执行信息
 */
@Data
public class ExecuteMessage {

    private Integer exitValue;

    private String message;

    private String errorMessage;

    private Long time;
}
