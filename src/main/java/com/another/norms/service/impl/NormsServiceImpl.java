package com.another.norms.service.impl;

import com.another.norms.entity.Norms;
import com.another.norms.service.NormsService;
import com.another.norms.dao.NormsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 30590 on 2017-03-02 0002.
 */
@Service
public class NormsServiceImpl implements NormsService {

    @Autowired
    private NormsDao normsDao;

    public Norms addnorms(Norms norms) {
        normsDao.addnorms(norms);
        return norms;
    }
    public Norms update(Norms norms) {
        normsDao.update(norms);
        return norms;
    }
}
