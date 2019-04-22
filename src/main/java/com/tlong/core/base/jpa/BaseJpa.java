package com.tlong.core.base.jpa;

import java.time.LocalDateTime;

/**
 * 功能描述: 所有JPA需要继承的基类
 *
 * @auther: wangzhuo
 * @date: 2019-03-20 10:26
 */
public class BaseJpa {

    //创建时间≤
    private LocalDateTime createDate;

    //创建人ID
    private Long createBy;

    //最后修改人ID
    private Long lastUpdateBy;

    //最后修改时间
    private LocalDateTime lastUpdateTime = LocalDateTime.now();


    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public Long getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    public Long getLastUpdateBy() {
        return lastUpdateBy;
    }

    public void setLastUpdateBy(Long lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy;
    }

    public LocalDateTime getLastUpdateTime() {
        return lastUpdateTime;
    }

//    public void setLastUpdateTime(LocalDateTime lastUpdateTime) {
//        this.lastUpdateTime = lastUpdateTime;
//    }
}
