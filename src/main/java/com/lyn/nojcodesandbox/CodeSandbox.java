package com.lyn.nojcodesandbox;


import com.lyn.nojcodesandbox.model.ExecuteCodeRequest;
import com.lyn.nojcodesandbox.model.ExecuteCodeResponse;

public interface CodeSandbox {

    /**
     * 执行代码
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);

}
