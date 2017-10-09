package com.another.Bank.dao;

import com.another.Bank.entity.Bank;
import com.another.Bank.pageModel.PageBank;

import java.util.List;

/**
 * 
 */
public interface BankDao {

    /**
     * 添加
     * @param pageBank
     * @return
     */
    int addBank(PageBank pageBank);

    /**
     * 查询列表
     * @param pageBank
     * @return
     */
    List<Bank> getBankList(PageBank pageBank);

    /**
     * 查询数量
     * @return
     */
    Long getBankSize(PageBank pageBank);


    /**
     * 修改信息
     * @param pageBank
     * @return
     */
    int updateBank(PageBank pageBank);

    /**
     *
     * @param pageBank
     * @return
     */
    int deleteBank(PageBank pageBank);

    /**
     *
     * @param pageBank
     * @return
     */
    Bank getBankById(PageBank pageBank);
}
