package com.another.Creditgoods.service;


import com.another.base.entity.Page;
import com.another.Creditgoods.entity.Creditgoods;
import com.another.Creditgoods.pageModel.PageCreditgoods;

/**
 * Created by Zero on 2016/7/29.
 */
public interface CreditgoodsService {

    /**
     * 添加
     * @param pageCreditgoods
     * @return
     */
    void addCreditgoods(PageCreditgoods pageCreditgoods);

    /**
     * 分页获取列表
     * @param pageCreditgoods
     * @return
     */
    Page<Creditgoods> getCreditgoodsList(PageCreditgoods pageCreditgoods);

    /**
     * 删除Creditgoods
     * @param pageCreditgoods
     * @return
     */
    void deleteCreditgoodsById(PageCreditgoods pageCreditgoods);

    /**
     * 根据ID获取
     * @param pageCreditgoods
     * @return
     */
    Creditgoods getCreditgoodsById(PageCreditgoods pageCreditgoods);

    /**
     * 修改
     * @param pageCreditgoods
     */
    void updateCreditgoods(PageCreditgoods pageCreditgoods);

}
