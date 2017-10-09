package com.another.Storeseat.dao;

import com.another.Storeseat.entity.Storeseat;
import com.another.Storeseat.pageModel.PageStoreseat;

import java.util.List;

/**
 * 
 */
public interface StoreseatDao {

    /**
     * 添加
     * @param pageStoreseat
     * @return
     */
    int addStoreseat(PageStoreseat pageStoreseat);

    /**
     * 查询列表
     * @param pageStoreseat
     * @return
     */
    List<Storeseat> getStoreseatList(PageStoreseat pageStoreseat);

    /**
     * 查询数量
     * @return
     */
    Long getStoreseatSize(PageStoreseat pageStoreseat);


    /**
     * 修改信息
     * @param pageStoreseat
     * @return
     */
    int updateStoreseat(PageStoreseat pageStoreseat);

    /**
     *
     * @param pageStoreseat
     * @return
     */
    int deleteStoreseat(PageStoreseat pageStoreseat);

    /**
     *
     * @param pageStoreseat
     * @return
     */
    Storeseat getStoreseatById(PageStoreseat pageStoreseat);
}
