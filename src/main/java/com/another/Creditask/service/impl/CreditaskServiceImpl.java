package com.another.Creditask.service.impl;

import com.another.base.entity.Page;
import com.another.Creditask.dao.CreditaskDao;
import com.another.Creditask.entity.Creditask;
import com.another.Creditask.pageModel.PageCreditask;
import com.another.Creditask.service.CreditaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 
 */
@Service
public class CreditaskServiceImpl implements CreditaskService {

    @Autowired
    CreditaskDao Creditaskdao;

    @Override
    public void addCreditask(PageCreditask pageCreditask) {
        Creditaskdao.addCreditask(pageCreditask);
    }

    @Override
    public Page<Creditask> getCreditaskList(PageCreditask pageCreditask) {
        Page<Creditask> page = new Page<Creditask>();

        Long size = Creditaskdao.getCreditaskSize(pageCreditask);
        pageCreditask.setTotal(size);

        List<Creditask> list = Creditaskdao.getCreditaskList(pageCreditask);
        page.setTotal(size);
        page.setTotalPages(pageCreditask.getTotalPages());
        page.setData(list);
        return page;
    }

    @Override
    public void deleteCreditaskById(PageCreditask pageCreditask) {
        Creditaskdao.deleteCreditask(pageCreditask);
    }

    @Override
    public Creditask getCreditaskById(PageCreditask pageCreditask) {
        Creditask  rCreditask = Creditaskdao.getCreditaskById(pageCreditask);
        return rCreditask;
    }

    @Override
    public void updateCreditask(PageCreditask pageCreditask) {
        Creditaskdao.updateCreditask(pageCreditask);
    }
}
