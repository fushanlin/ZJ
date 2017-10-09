package com.another.base.entity;

import java.io.Serializable;
import java.math.BigInteger;

/**
 * Created by wk on 2016/3/17.
 */
public class PageModel implements Serializable {

    private Integer userId;     //用户ID
    private Integer page;       //页码
    private Integer start;      //起始位置
    private Integer length;   //每页记录数
    private Long total;      //总记录数
    private Long totalPages; //总页数
    private Integer returned=0;         //返回值

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Long getTotal() {
        return total;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public void setTotal(Long total) {
        if(length == null || length.equals(0)){
            length = 30;
        }
        this.totalPages = total%length == 0 ? total/length:total/length+1;
        this.start = (page-1)*length+1;
        this.total = total;
    }

    public Long getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Long totalPages) {
        this.totalPages = totalPages;
    }

    public Integer getReturned() {
        return returned;
    }

    public void setReturned(Integer returned) {
        if(returned!=null){
            this.returned = returned;
        }else {
            this.returned = 0;
        }
    }
}
