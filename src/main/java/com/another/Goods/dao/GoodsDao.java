package com.another.Goods.dao;

import com.another.Goods.entity.Goods;
import com.another.Goods.pageModel.PageGoods;

import java.util.List;

/**
 * 
 */
public interface GoodsDao {

    /**
     * 添加
     * @param pageGoods
     * @return
     */
    int addGoods(PageGoods pageGoods);

    /**
     * 查询列表
     * @param pageGoods
     * @return
     */
    List<Goods> getGoodsList(PageGoods pageGoods);

    /**
     * 查询数量
     * @return
     */
    Long getGoodsSize(PageGoods pageGoods);


    /**
     * 修改信息
     * @param pageGoods
     * @return
     */
    int updateGoods(PageGoods pageGoods);

    /**
     *
     * @param pageGoods
     * @return
     */
    int deleteGoods(PageGoods pageGoods);

    /**
     *
     * @param pageGoods
     * @return
     */
    Goods getGoodsById(PageGoods pageGoods);
}
