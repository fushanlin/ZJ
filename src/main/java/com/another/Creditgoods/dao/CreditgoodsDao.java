package com.another.Creditgoods.dao;

import com.another.Creditgoods.entity.Creditgoods;
import com.another.Creditgoods.pageModel.PageCreditgoods;

import java.util.List;

/**
 * 
 */
public interface CreditgoodsDao {

    /**
     * 添加
     * @param pageCreditgoods
     * @return
     */
    int addCreditgoods(PageCreditgoods pageCreditgoods);

    /**
     * 查询列表
     * @param pageCreditgoods
     * @return
     */
    List<Creditgoods> getCreditgoodsList(PageCreditgoods pageCreditgoods);

    /**
     * 查询数量
     * @return
     */
    Long getCreditgoodsSize(PageCreditgoods pageCreditgoods);


    /**
     * 修改信息
     * @param pageCreditgoods
     * @return
     */
    int updateCreditgoods(PageCreditgoods pageCreditgoods);

    /**
     *
     * @param pageCreditgoods
     * @return
     */
    int deleteCreditgoods(PageCreditgoods pageCreditgoods);

    /**
     *
     * @param pageCreditgoods
     * @return
     */
    Creditgoods getCreditgoodsById(PageCreditgoods pageCreditgoods);
}
