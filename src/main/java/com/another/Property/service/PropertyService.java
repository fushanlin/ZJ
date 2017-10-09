package com.another.Property.service;


import com.another.base.entity.Page;
import com.another.Property.entity.Property;
import com.another.Property.pageModel.PageProperty;

/**
 * Created by Zero on 2016/7/29.
 */
public interface PropertyService {

    /**
     * 添加
     * @param pageProperty
     * @return
     */
    void addProperty(PageProperty pageProperty);

    /**
     * 分页获取列表
     * @param pageProperty
     * @return
     */
    Page<Property> getPropertyList(PageProperty pageProperty);

    /**
     * 删除Property
     * @param pageProperty
     * @return
     */
    void deletePropertyById(PageProperty pageProperty);

    /**
     * 根据ID获取
     * @param pageProperty
     * @return
     */
    Property getPropertyById(PageProperty pageProperty);

    /**
     * 修改
     * @param pageProperty
     */
    void updateProperty(PageProperty pageProperty);

}
