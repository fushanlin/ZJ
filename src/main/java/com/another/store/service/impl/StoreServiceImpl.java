package com.another.store.service.impl;


import com.another.store.dao.StoreDao;
import com.another.store.entity.Seat;
import com.another.store.entity.Store;
import com.another.store.service.StoreService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by 30590 on 2017-03-08 0008.
 */
@Service
public class StoreServiceImpl implements StoreService{

    @Autowired
    private StoreDao storeDao;



    public Store addstore(Store store){
        storeDao.addstore(store);
        return(store);
    }

    public Store updatestore(Store store){
        storeDao.updatestore(store);
        return(store);
    }


    public Seat addseat(Seat seat){
        storeDao.addseat(seat);
        return(seat);
    }

    public Seat updateseat(Seat seat){
        storeDao.updateseat(seat);
        return(seat);
    }


}
