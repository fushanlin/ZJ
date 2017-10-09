package com.another.Creditask.dao;

import com.another.Creditask.entity.Creditask;
import com.another.Creditask.pageModel.PageCreditask;

import java.util.List;

/**
 * 
 */
public interface CreditaskDao {

    /**
     * 添加
     * @param pageCreditask
     * @return
     */
    int addCreditask(PageCreditask pageCreditask);

    /**
     * 查询列表
     * @param pageCreditask
     * @return
     */
    List<Creditask> getCreditaskList(PageCreditask pageCreditask);

    /**
     * 查询数量
     * @return
     */
    Long getCreditaskSize(PageCreditask pageCreditask);


    /**
     * 修改信息
     * @param pageCreditask
     * @return
     */
    int updateCreditask(PageCreditask pageCreditask);

    /**
     *
     * @param pageCreditask
     * @return
     */
    int deleteCreditask(PageCreditask pageCreditask);

    /**
     *
     * @param pageCreditask
     * @return
     */
    Creditask getCreditaskById(PageCreditask pageCreditask);
}
