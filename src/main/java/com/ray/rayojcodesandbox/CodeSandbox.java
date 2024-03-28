package com.ray.rayojcodesandbox;

import com.ray.rayojcodesandbox.model.ExecuteCodeRequest;
import com.ray.rayojcodesandbox.model.ExecuteCodeResponse;

/**
 * 代码沙箱接口定义
 */
public interface CodeSandbox {

    /**
     * 执行代码
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
