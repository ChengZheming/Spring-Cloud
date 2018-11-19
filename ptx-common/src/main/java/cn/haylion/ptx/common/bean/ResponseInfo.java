package cn.haylion.ptx.common.bean;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ResponseInfo<T> {
    public static final int SUCCESS = 200;
    public static final int FAILURE = 500;

    private int code;
    private String msg;
    private T data;

    public ResponseInfo(int code) {
        setCode(code);
    }

    public ResponseInfo(int code, T data) {
        setCode(code);
        this.data = data;
    }

    public ResponseInfo(int code, T data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    public static ResponseInfo success() {
        return new ResponseInfo(SUCCESS);
    }

    public static ResponseInfo failure() {
        return new ResponseInfo(FAILURE);
    }

    @JSONField(serialize = false)
    public boolean successed() {
        return this.code == SUCCESS ? true : false;
    }

    public void setCode(int code) {
        this.code = code;
        if (code == SUCCESS) {
            this.msg = "success";
        } else {
            this.msg = "failure";
        }
    }

}