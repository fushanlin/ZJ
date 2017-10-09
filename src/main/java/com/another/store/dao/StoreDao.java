package com.another.store.dao;
import com.another.store.entity.Seat;
import com.another.store.entity.Store;
import com.another.base.MyBatisRepository;
import org.apache.ibatis.annotations.Param;
/**
 * Created by 30590 on 2017-03-07 0007.
 */
public interface StoreDao {
    void addstore(Store store);
    void updatestore(Store store);
    void addseat(Seat seat);
    void updateseat(Seat seat);

}
