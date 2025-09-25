package com.zhu.ecommerce.advice;

import com.zhu.ecommerce.vo.CommonResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

/**
 * <h1>全局异常捕获处理</h1>
 */
@Slf4j
@ControllerAdvice
public class GlobalExceptionAdvice {

    @ExceptionHandler(value = Exception.class)
    public CommonResponse<String> handleException(HttpServletRequest request, Exception ex) {
        CommonResponse<String> result = new CommonResponse<>(-1,"business error");
        result.setData(ex.getMessage());
        log.error("commerce service has error: [{}]", ex.getMessage(), ex);
        return result;
    }
}
