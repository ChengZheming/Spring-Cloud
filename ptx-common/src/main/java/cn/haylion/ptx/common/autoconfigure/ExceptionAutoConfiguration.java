package cn.haylion.ptx.common.autoconfigure;

import cn.haylion.ptx.common.bean.ResponseInfo;
import cn.haylion.ptx.common.exception.LogicException;
import cn.haylion.ptx.common.exception.ParameterException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Slf4j
@ResponseBody
@ControllerAdvice
@Configuration
public class ExceptionAutoConfiguration {

    /**
     * 内部错误
     */
    @ResponseStatus(HttpStatus.OK)
    @ExceptionHandler(Exception.class)
    public ResponseInfo handleException(Exception exception) {
        log.error(exception.getMessage(), exception);
        return new ResponseInfo(ResponseInfo.FAILURE, null, exception.getMessage());
    }

    /**
     * 参数错误
     */
    @ResponseStatus(HttpStatus.OK)
    @ExceptionHandler(ParameterException.class)
    public ResponseInfo handleParameterException(ParameterException exception) {
        return new ResponseInfo(HttpStatus.BAD_REQUEST.value(), null, exception.getMessage());
    }

    /**
     * 业务逻辑错误
     */
    @ResponseStatus(HttpStatus.OK)
    @ExceptionHandler(LogicException.class)
    public ResponseInfo handleLogicException(LogicException exception) {
        return new ResponseInfo(HttpStatus.NOT_ACCEPTABLE.value(), null, exception.getMessage());
    }

}