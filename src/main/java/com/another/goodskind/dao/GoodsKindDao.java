package com.another.goodskind.dao;

import com.another.goodskind.entity.GoodsKind;

import java.util.List;

/**
 * Created by Administrator on 2017/2/27 0027.
 */
public interface GoodsKindDao {
    /**
     * 添加
     *
     * @param goodsKind
     * @return
     */
    int addGoodsKind(GoodsKind goodsKind);

    /**
     * 修改
     *
     * @param goodsKind
     * @return
     */
    int updateGoodsKind(GoodsKind goodsKind);

    /**
     * 删除
     *
     * @param goodsKind
     * @return
     */
    int deleteGoodsKind(GoodsKind goodsKind);

    /**
     * 查询
     *
     * @return
     */
    List<GoodsKind> getGoodsKinds();
}
