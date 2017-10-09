package com.another.goodskind.service.impl;

import com.another.goodskind.dao.GoodsKindDao;
import com.another.goodskind.entity.GoodsKind;
import com.another.goodskind.service.GoodsKindService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 30590 on 2017-02-23 0023.
 */

@Service
public class GoodsKindServiceImpl implements GoodsKindService {

    @Autowired
    GoodsKindDao goodsKindDao;

    public boolean addGoodsKind(GoodsKind goodsKind) {
        if (goodsKindDao.addGoodsKind(goodsKind) > 0)
            return true;
        else
            return false;
    }

    public boolean updateGoodsKind(GoodsKind goodsKind) {
        if (goodsKindDao.updateGoodsKind(goodsKind) > 0)
            return true;
        else
            return false;
    }

    public boolean deleteGoodsKind(GoodsKind goodsKind) {
        if (goodsKindDao.deleteGoodsKind(goodsKind) > 0)
            return true;
        else
            return false;
    }

    public List<GoodsKind> getGoodsKinds() {
        List<GoodsKind> goodsKinds = goodsKindDao.getGoodsKinds();
        if (goodsKinds != null && goodsKinds.size() > 0)
            return goodsKinds;
        else
            return null;
    }
}
