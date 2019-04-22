package com.tlong.core.base.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * @Auther: wangzhuo
 * @Date: 2019-04-22 09:31
 * @Description:
 */
public class BaseResultDto implements Serializable {

    public BaseResultDto() {
    }

    public BaseResultDto(Integer flag, String errorMsg, String content) {
        this.flag = flag;
        this.errorMsg = errorMsg;
        this.content = content;
        this.date = new Date();
    }

    //处理结果 0失败 1成功
    private Integer flag;

    //错误内容
    private String errorMsg;

    //返回内容
    private String content;

    //处理结束时间
    private Date date = new Date();

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
