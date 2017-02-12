package com.company;

import java.util.Date;

public class Article {

    private Date createDate;

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString(){
        return getCreateDate() + " " + getClass().getSimpleName();
    }
}
