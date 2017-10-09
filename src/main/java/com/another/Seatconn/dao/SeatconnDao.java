package com.another.Seatconn.dao;

import com.another.Seatconn.entity.Seatconn;
import com.another.Seatconn.pageModel.PageSeatconn;

import java.util.List;

/**
 * 
 */
public interface SeatconnDao {

    /**
     * 添加
     * @param pageSeatconn
     * @return
     */
    int addSeatconn(PageSeatconn pageSeatconn);

    /**
     * 查询列表
     * @param pageSeatconn
     * @return
     */
    List<Seatconn> getSeatconnList(PageSeatconn pageSeatconn);

    /**
     * 查询数量
     * @return
     */
    Long getSeatconnSize(PageSeatconn pageSeatconn);


    /**
     * 修改信息
     * @param pageSeatconn
     * @return
     */
    int updateSeatconn(PageSeatconn pageSeatconn);

    /**
     *
     * @param pageSeatconn
     * @return
     */
    int deleteSeatconn(PageSeatconn pageSeatconn);

    /**
     *
     * @param pageSeatconn
     * @return
     */
    Seatconn getSeatconnById(PageSeatconn pageSeatconn);
}
