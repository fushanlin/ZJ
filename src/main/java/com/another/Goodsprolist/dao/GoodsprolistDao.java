package com.another.Goodsprolist.dao;

import com.another.Goodsprolist.entity.Goodsprolist;
import com.another.Goodsprolist.pageModel.PageGoodsprolist;

import java.util.List;

/**
 * 
 */
public interface GoodsprolistDao {

    /**
     * 添加
     * @param pageGoodsprolist
     * @return
     */
    int addGoodsprolist(PageGoodsprolist pageGoodsprolist);

    /**
     * 查询列表
     * @param pageGoodsprolist
     * @return
     */
    List<Goodsprolist> getGoodsprolistList(PageGoodsprolist pageGoodsprolist);

    /**
     * 查询数量
     * @return
     */
    Long getGoodsprolistSize(PageGoodsprolist pageGoodsprolist);


    /**
     * 修改信息
     * @param pageGoodsprolist
     * @return
     */
    int updateGoodsprolist(PageGoodsprolist pageGoodsprolist);

    /**
     *
     * @param pageGoodsprolist
     * @return
     */
    int deleteGoodsprolist(PageGoodsprolist pageGoodsprolist);

    /**
     *
     * @param pageGoodsprolist
     * @return
     */
    Goodsprolist getGoodsprolistById(PageGoodsprolist pageGoodsprolist);
}
