package com.another.Goods.service;


import com.another.base.entity.Page;
import com.another.Goods.entity.Goods;
import com.another.Goods.pageModel.PageGoods;

/**
 * Created by Zero on 2016/7/29.
 */
public interface GoodsService {

    /**
     * 添加
     * @param pageGoods
     * @return
     */
    void addGoods(PageGoods pageGoods);

    /**
     * 分页获取列表
     * @param pageGoods
     * @return
     */
    Page<Goods> getGoodsList(PageGoods pageGoods);

    /**
     * 删除Goods
     * @param pageGoods
     * @return
     */
    void deleteGoodsById(PageGoods pageGoods);

    /**
     * 根据ID获取
     * @param pageGoods
     * @return
     */
    Goods getGoodsById(PageGoods pageGoods);

    /**
     * 修改
     * @param pageGoods
     */
    void updateGoods(PageGoods pageGoods);

}
