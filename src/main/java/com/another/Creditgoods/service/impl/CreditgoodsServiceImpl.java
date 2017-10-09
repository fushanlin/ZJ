package com.another.Creditgoods.service.impl;

import com.another.base.entity.Page;
import com.another.Creditgoods.dao.CreditgoodsDao;
import com.another.Creditgoods.entity.Creditgoods;
import com.another.Creditgoods.pageModel.PageCreditgoods;
import com.another.Creditgoods.service.CreditgoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 
 */
@Service
public class CreditgoodsServiceImpl implements CreditgoodsService {

    @Autowired
    CreditgoodsDao Creditgoodsdao;

    @Override
    public void addCreditgoods(PageCreditgoods pageCreditgoods) {
        Creditgoodsdao.addCreditgoods(pageCreditgoods);
    }

    @Override
    public Page<Creditgoods> getCreditgoodsList(PageCreditgoods pageCreditgoods) {
        Page<Creditgoods> page = new Page<Creditgoods>();

        Long size = Creditgoodsdao.getCreditgoodsSize(pageCreditgoods);
        pageCreditgoods.setTotal(size);

        List<Creditgoods> list = Creditgoodsdao.getCreditgoodsList(pageCreditgoods);
        page.setTotal(size);
        page.setTotalPages(pageCreditgoods.getTotalPages());
        page.setData(list);
        return page;
    }

    @Override
    public void deleteCreditgoodsById(PageCreditgoods pageCreditgoods) {
        Creditgoodsdao.deleteCreditgoods(pageCreditgoods);
    }

    @Override
    public Creditgoods getCreditgoodsById(PageCreditgoods pageCreditgoods) {
        Creditgoods  rCreditgoods = Creditgoodsdao.getCreditgoodsById(pageCreditgoods);
        return rCreditgoods;
    }

    @Override
    public void updateCreditgoods(PageCreditgoods pageCreditgoods) {
        Creditgoodsdao.updateCreditgoods(pageCreditgoods);
    }
}
