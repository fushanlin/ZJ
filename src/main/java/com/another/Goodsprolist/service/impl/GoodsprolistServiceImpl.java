package com.another.Goodsprolist.service.impl;

import com.another.base.entity.Page;
import com.another.Goodsprolist.dao.GoodsprolistDao;
import com.another.Goodsprolist.entity.Goodsprolist;
import com.another.Goodsprolist.pageModel.PageGoodsprolist;
import com.another.Goodsprolist.service.GoodsprolistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 
 */
@Service
public class GoodsprolistServiceImpl implements GoodsprolistService {

    @Autowired
    GoodsprolistDao Goodsprolistdao;

    @Override
    public void addGoodsprolist(PageGoodsprolist pageGoodsprolist) {
        Goodsprolistdao.addGoodsprolist(pageGoodsprolist);
    }

    @Override
    public Page<Goodsprolist> getGoodsprolistList(PageGoodsprolist pageGoodsprolist) {
        Page<Goodsprolist> page = new Page<Goodsprolist>();

        Long size = Goodsprolistdao.getGoodsprolistSize(pageGoodsprolist);
        pageGoodsprolist.setTotal(size);

        List<Goodsprolist> list = Goodsprolistdao.getGoodsprolistList(pageGoodsprolist);
        page.setTotal(size);
        page.setTotalPages(pageGoodsprolist.getTotalPages());
        page.setData(list);
        return page;
    }

    @Override
    public void deleteGoodsprolistById(PageGoodsprolist pageGoodsprolist) {
        Goodsprolistdao.deleteGoodsprolist(pageGoodsprolist);
    }

    @Override
    public Goodsprolist getGoodsprolistById(PageGoodsprolist pageGoodsprolist) {
        Goodsprolist  rGoodsprolist = Goodsprolistdao.getGoodsprolistById(pageGoodsprolist);
        return rGoodsprolist;
    }

    @Override
    public void updateGoodsprolist(PageGoodsprolist pageGoodsprolist) {
        Goodsprolistdao.updateGoodsprolist(pageGoodsprolist);
    }
}
