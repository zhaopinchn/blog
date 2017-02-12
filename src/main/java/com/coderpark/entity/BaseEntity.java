package com.coderpark.entity;

import java.io.Serializable;

/**
 * Created by zhaopin on 2016/11/13.
 */
public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
