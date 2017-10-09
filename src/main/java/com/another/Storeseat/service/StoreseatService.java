package com.another.Storeseat.service;


import com.another.base.entity.Page;
import com.another.Storeseat.entity.Storeseat;
import com.another.Storeseat.pageModel.PageStoreseat;

/**
 * Created by Zero on 2016/7/29.
 */
public interface StoreseatService {

    /**
     * 添加
     * @param pageStoreseat
     * @return
     */
    void addStoreseat(PageStoreseat pageStoreseat);

    /**
     * 分页获取列表
     * @param pageStoreseat
     * @return
     */
    Page<Storeseat> getStoreseatList(PageStoreseat pageStoreseat);

    /**
     * 删除Storeseat
     * @param pageStoreseat
     * @return
     */
    void deleteStoreseatById(PageStoreseat pageStoreseat);

    /**
     * 根据ID获取
     * @param pageStoreseat
     * @return
     */
    Storeseat getStoreseatById(PageStoreseat pageStoreseat);

    /**
     * 修改
     * @param pageStoreseat
     */
    void updateStoreseat(PageStoreseat pageStoreseat);

}
