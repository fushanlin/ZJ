package com.another.Bank.service;


import com.another.base.entity.Page;
import com.another.Bank.entity.Bank;
import com.another.Bank.pageModel.PageBank;

/**
 * Created by Zero on 2016/7/29.
 */
public interface BankService {

    /**
     * 添加
     * @param pageBank
     * @return
     */
    void addBank(PageBank pageBank);

    /**
     * 分页获取列表
     * @param pageBank
     * @return
     */
    Page<Bank> getBankList(PageBank pageBank);

    /**
     * 删除Bank
     * @param pageBank
     * @return
     */
    void deleteBankById(PageBank pageBank);

    /**
     * 根据ID获取
     * @param pageBank
     * @return
     */
    Bank getBankById(PageBank pageBank);

    /**
     * 修改
     * @param pageBank
     */
    void updateBank(PageBank pageBank);

}
