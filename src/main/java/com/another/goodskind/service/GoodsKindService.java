package com.another.goodskind.service;

import com.another.goodskind.entity.GoodsKind;

import java.util.List;

/**
 * Created by Administrator on 2017/2/27 0027.
 */
public interface GoodsKindService {
    /**
     * 添加
     * @param goodsKind
     * @return
     */
    boolean addGoodsKind(GoodsKind goodsKind);


    /**
     * 修改
     *
     * @param goodsKind
     * @return
     */
    boolean updateGoodsKind(GoodsKind goodsKind);

    /**
     * 删除
     *
     * @param goodsKind
     * @return
     */
    boolean deleteGoodsKind(GoodsKind goodsKind);

    /**
     * 查询
     *
     * @return
     */
    List<GoodsKind> getGoodsKinds();
}
