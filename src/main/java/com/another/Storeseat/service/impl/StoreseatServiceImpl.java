package com.another.Storeseat.service.impl;

import com.another.base.entity.Page;
import com.another.Storeseat.dao.StoreseatDao;
import com.another.Storeseat.entity.Storeseat;
import com.another.Storeseat.pageModel.PageStoreseat;
import com.another.Storeseat.service.StoreseatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 
 */
@Service
public class StoreseatServiceImpl implements StoreseatService {

    @Autowired
    StoreseatDao Storeseatdao;

    @Override
    public void addStoreseat(PageStoreseat pageStoreseat) {
        Storeseatdao.addStoreseat(pageStoreseat);
    }

    @Override
    public Page<Storeseat> getStoreseatList(PageStoreseat pageStoreseat) {
        Page<Storeseat> page = new Page<Storeseat>();

        Long size = Storeseatdao.getStoreseatSize(pageStoreseat);
        pageStoreseat.setTotal(size);

        List<Storeseat> list = Storeseatdao.getStoreseatList(pageStoreseat);
        page.setTotal(size);
        page.setTotalPages(pageStoreseat.getTotalPages());
        page.setData(list);
        return page;
    }

    @Override
    public void deleteStoreseatById(PageStoreseat pageStoreseat) {
        Storeseatdao.deleteStoreseat(pageStoreseat);
    }

    @Override
    public Storeseat getStoreseatById(PageStoreseat pageStoreseat) {
        Storeseat  rStoreseat = Storeseatdao.getStoreseatById(pageStoreseat);
        return rStoreseat;
    }

    @Override
    public void updateStoreseat(PageStoreseat pageStoreseat) {
        Storeseatdao.updateStoreseat(pageStoreseat);
    }
}
