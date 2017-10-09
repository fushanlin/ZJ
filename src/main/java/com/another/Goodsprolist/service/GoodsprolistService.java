package com.another.Goodsprolist.service;


import com.another.base.entity.Page;
import com.another.Goodsprolist.entity.Goodsprolist;
import com.another.Goodsprolist.pageModel.PageGoodsprolist;

/**
 * Created by Zero on 2016/7/29.
 */
public interface GoodsprolistService {

    /**
     * 添加
     * @param pageGoodsprolist
     * @return
     */
    void addGoodsprolist(PageGoodsprolist pageGoodsprolist);

    /**
     * 分页获取列表
     * @param pageGoodsprolist
     * @return
     */
    Page<Goodsprolist> getGoodsprolistList(PageGoodsprolist pageGoodsprolist);

    /**
     * 删除Goodsprolist
     * @param pageGoodsprolist
     * @return
     */
    void deleteGoodsprolistById(PageGoodsprolist pageGoodsprolist);

    /**
     * 根据ID获取
     * @param pageGoodsprolist
     * @return
     */
    Goodsprolist getGoodsprolistById(PageGoodsprolist pageGoodsprolist);

    /**
     * 修改
     * @param pageGoodsprolist
     */
    void updateGoodsprolist(PageGoodsprolist pageGoodsprolist);

}
