package com.zxx.store.common;

import com.zxx.store.constant.CodeConstant;
import org.springframework.util.StringUtils;

import java.io.Serializable;

public class Response implements Serializable {

    public static final String SUCC_CODE_STR = "0";

    public static final String STATE_CODE_KEY = "stateCode";

    public static final String MESSAGE_KEY = "message";

    public static final String DATA_KEY = "data";

    private int stateCode;
    private String message;
    private Object data;

    public int getStateCode() {
        return stateCode;
    }

    public void setStateCode(int stateCode) {
        this.stateCode = stateCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static Response success(Object data){
        Response response = new Response();
        response.setData(data);
        return response;
    }

    public static Response success(){
        return Response.success(null);
    }

    public static Response error(int stateCode, String message) {
        Response response = new Response();
        if (StringUtils.isEmpty(message)) {
            response.updateErrMsgFromCode();
        } else {
            response.setMessage(message);
        }
        return response;
    }

    public void updateErrMsgFromCode(){
        this.message = CodeConstant.valueOf(this.stateCode).getMessage();
    }

}
