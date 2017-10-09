package com.another.Property.dao;

import com.another.Property.entity.Property;
import com.another.Property.pageModel.PageProperty;

import java.util.List;

/**
 * 
 */
public interface PropertyDao {

    /**
     * 添加
     * @param pageProperty
     * @return
     */
    int addProperty(PageProperty pageProperty);

    /**
     * 查询列表
     * @param pageProperty
     * @return
     */
    List<Property> getPropertyList(PageProperty pageProperty);

    /**
     * 查询数量
     * @return
     */
    Long getPropertySize(PageProperty pageProperty);


    /**
     * 修改信息
     * @param pageProperty
     * @return
     */
    int updateProperty(PageProperty pageProperty);

    /**
     *
     * @param pageProperty
     * @return
     */
    int deleteProperty(PageProperty pageProperty);

    /**
     *
     * @param pageProperty
     * @return
     */
    Property getPropertyById(PageProperty pageProperty);
}
