package com.another.Creditask.service;


import com.another.base.entity.Page;
import com.another.Creditask.entity.Creditask;
import com.another.Creditask.pageModel.PageCreditask;

/**
 * Created by Zero on 2016/7/29.
 */
public interface CreditaskService {

    /**
     * 添加
     * @param pageCreditask
     * @return
     */
    void addCreditask(PageCreditask pageCreditask);

    /**
     * 分页获取列表
     * @param pageCreditask
     * @return
     */
    Page<Creditask> getCreditaskList(PageCreditask pageCreditask);

    /**
     * 删除Creditask
     * @param pageCreditask
     * @return
     */
    void deleteCreditaskById(PageCreditask pageCreditask);

    /**
     * 根据ID获取
     * @param pageCreditask
     * @return
     */
    Creditask getCreditaskById(PageCreditask pageCreditask);

    /**
     * 修改
     * @param pageCreditask
     */
    void updateCreditask(PageCreditask pageCreditask);

}
