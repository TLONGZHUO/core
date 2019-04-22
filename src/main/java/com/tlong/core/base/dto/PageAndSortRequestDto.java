package com.tlong.core.base.dto;

import java.io.Serializable;

/**
 * 功能描述: 分页请求基类
 *
 * @auther: wangzhuo
 * @date: 2019-03-20 10:28
 */
public class PageAndSortRequestDto implements Serializable {
    private static final long serialVersionUID = -6097290648750753950L;

    //起始页
    private Integer page;

    //每页数量
    private Integer size;

    //排序依据属性
    private String orderProperty;

    //顺序规则 1正序 0倒序
    private Integer direction;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getOrderProperty() {
        return orderProperty;
    }

    public void setOrderProperty(String orderProperty) {
        this.orderProperty = orderProperty;
    }

    public Integer getDirection() {
        return direction;
    }

    public void setDirection(Integer direction) {
        this.direction = direction;
    }

}
