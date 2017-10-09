package com.another.Seatconn.service.impl;

import com.another.base.entity.Page;
import com.another.Seatconn.dao.SeatconnDao;
import com.another.Seatconn.entity.Seatconn;
import com.another.Seatconn.pageModel.PageSeatconn;
import com.another.Seatconn.service.SeatconnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 
 */
@Service
public class SeatconnServiceImpl implements SeatconnService {

    @Autowired
    SeatconnDao Seatconndao;

    @Override
    public void addSeatconn(PageSeatconn pageSeatconn) {
        Seatconndao.addSeatconn(pageSeatconn);
    }

    @Override
    public Page<Seatconn> getSeatconnList(PageSeatconn pageSeatconn) {
        Page<Seatconn> page = new Page<Seatconn>();

        Long size = Seatconndao.getSeatconnSize(pageSeatconn);
        pageSeatconn.setTotal(size);

        List<Seatconn> list = Seatconndao.getSeatconnList(pageSeatconn);
        page.setTotal(size);
        page.setTotalPages(pageSeatconn.getTotalPages());
        page.setData(list);
        return page;
    }

    @Override
    public void deleteSeatconnById(PageSeatconn pageSeatconn) {
        Seatconndao.deleteSeatconn(pageSeatconn);
    }

    @Override
    public Seatconn getSeatconnById(PageSeatconn pageSeatconn) {
        Seatconn  rSeatconn = Seatconndao.getSeatconnById(pageSeatconn);
        return rSeatconn;
    }

    @Override
    public void updateSeatconn(PageSeatconn pageSeatconn) {
        Seatconndao.updateSeatconn(pageSeatconn);
    }
}
