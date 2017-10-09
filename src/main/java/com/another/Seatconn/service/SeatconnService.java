package com.another.Seatconn.service;


import com.another.base.entity.Page;
import com.another.Seatconn.entity.Seatconn;
import com.another.Seatconn.pageModel.PageSeatconn;

/**
 * Created by Zero on 2016/7/29.
 */
public interface SeatconnService {

    /**
     * 添加
     * @param pageSeatconn
     * @return
     */
    void addSeatconn(PageSeatconn pageSeatconn);

    /**
     * 分页获取列表
     * @param pageSeatconn
     * @return
     */
    Page<Seatconn> getSeatconnList(PageSeatconn pageSeatconn);

    /**
     * 删除Seatconn
     * @param pageSeatconn
     * @return
     */
    void deleteSeatconnById(PageSeatconn pageSeatconn);

    /**
     * 根据ID获取
     * @param pageSeatconn
     * @return
     */
    Seatconn getSeatconnById(PageSeatconn pageSeatconn);

    /**
     * 修改
     * @param pageSeatconn
     */
    void updateSeatconn(PageSeatconn pageSeatconn);

}
