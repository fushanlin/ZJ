package com.another.Goods.service.impl;

import com.another.base.entity.Page;
import com.another.Goods.dao.GoodsDao;
import com.another.Goods.entity.Goods;
import com.another.Goods.pageModel.PageGoods;
import com.another.Goods.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 
 */
@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    GoodsDao Goodsdao;

    @Override
    public void addGoods(PageGoods pageGoods) {
        Goodsdao.addGoods(pageGoods);
    }

    @Override
    public Page<Goods> getGoodsList(PageGoods pageGoods) {
        Page<Goods> page = new Page<Goods>();

        Long size = Goodsdao.getGoodsSize(pageGoods);
        pageGoods.setTotal(size);

        List<Goods> list = Goodsdao.getGoodsList(pageGoods);
        page.setTotal(size);
        page.setTotalPages(pageGoods.getTotalPages());
        page.setData(list);
        return page;
    }

    @Override
    public void deleteGoodsById(PageGoods pageGoods) {
        Goodsdao.deleteGoods(pageGoods);
    }

    @Override
    public Goods getGoodsById(PageGoods pageGoods) {
        Goods  rGoods = Goodsdao.getGoodsById(pageGoods);
        return rGoods;
    }

    @Override
    public void updateGoods(PageGoods pageGoods) {
        Goodsdao.updateGoods(pageGoods);
    }
}
