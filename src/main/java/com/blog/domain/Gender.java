package com.blog.domain;

/**
 * Created by zhaopin on 2016/11/13.
 */
public enum  Gender {
    MALE("", 1),
    FEMALE("", 0),
    OTHER("", 2);

    private String name;

    private Integer index;

    private Gender(String name, Integer index) {
        this.name = name;
        this.index = index;
    }

    public static Gender getGender(Integer index) {
        Gender current = null;
        for(Gender g: Gender.values()) {
            if(g.getIndex().equals(index)) {
                current = g;
            }
        }
        if(current == null) {
            current = Gender.OTHER;
        }
        return current;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

}
