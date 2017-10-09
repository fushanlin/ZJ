package com.another.store.service;

import com.another.store.entity.Seat;
import com.another.store.entity.Store;

/**
 * Created by 30590 on 2017-03-08 0008.
 */
public interface StoreService {
    public Store addstore(Store store);
    public Store updatestore(Store store);
    public Seat addseat(Seat seat);
    public Seat updateseat(Seat seat);
}
