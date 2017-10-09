package com.another.Bank.service.impl;

import com.another.base.entity.Page;
import com.another.Bank.dao.BankDao;
import com.another.Bank.entity.Bank;
import com.another.Bank.pageModel.PageBank;
import com.another.Bank.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 
 */
@Service
public class BankServiceImpl implements BankService {

    @Autowired
    BankDao Bankdao;

    @Override
    public void addBank(PageBank pageBank) {
        Bankdao.addBank(pageBank);
    }

    @Override
    public Page<Bank> getBankList(PageBank pageBank) {
        Page<Bank> page = new Page<Bank>();

        Long size = Bankdao.getBankSize(pageBank);
        pageBank.setTotal(size);

        List<Bank> list = Bankdao.getBankList(pageBank);
        page.setTotal(size);
        page.setTotalPages(pageBank.getTotalPages());
        page.setData(list);
        return page;
    }

    @Override
    public void deleteBankById(PageBank pageBank) {
        Bankdao.deleteBank(pageBank);
    }

    @Override
    public Bank getBankById(PageBank pageBank) {
        Bank  rBank = Bankdao.getBankById(pageBank);
        return rBank;
    }

    @Override
    public void updateBank(PageBank pageBank) {
        Bankdao.updateBank(pageBank);
    }
}
