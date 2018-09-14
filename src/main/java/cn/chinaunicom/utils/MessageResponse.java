package cn.chinaunicom.utils;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "MessageResponse", description = "错误响应实体")
public class MessageResponse {

    @ApiModelProperty(value = "接口错误信息")
    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

