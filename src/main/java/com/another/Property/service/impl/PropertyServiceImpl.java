package com.another.Property.service.impl;

import com.another.base.entity.Page;
import com.another.Property.dao.PropertyDao;
import com.another.Property.entity.Property;
import com.another.Property.pageModel.PageProperty;
import com.another.Property.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 
 */
@Service
public class PropertyServiceImpl implements PropertyService {

    @Autowired
    PropertyDao Propertydao;

    @Override
    public void addProperty(PageProperty pageProperty) {
        Propertydao.addProperty(pageProperty);
    }

    @Override
    public Page<Property> getPropertyList(PageProperty pageProperty) {
        Page<Property> page = new Page<Property>();

        Long size = Propertydao.getPropertySize(pageProperty);
        pageProperty.setTotal(size);

        List<Property> list = Propertydao.getPropertyList(pageProperty);
        page.setTotal(size);
        page.setTotalPages(pageProperty.getTotalPages());
        page.setData(list);
        return page;
    }

    @Override
    public void deletePropertyById(PageProperty pageProperty) {
        Propertydao.deleteProperty(pageProperty);
    }

    @Override
    public Property getPropertyById(PageProperty pageProperty) {
        Property  rProperty = Propertydao.getPropertyById(pageProperty);
        return rProperty;
    }

    @Override
    public void updateProperty(PageProperty pageProperty) {
        Propertydao.updateProperty(pageProperty);
    }
}
