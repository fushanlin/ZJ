package com.another.base.entity;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;

/**
 * Created by Zero on 2016/7/19.
 */
public class Page<T> implements Serializable{

    private List<T> data;           //数据
    private Long total;       //总条数
    private Long totalPages;     //总页数

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Long getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Long totalPages) {
        this.totalPages = totalPages;
    }
}
