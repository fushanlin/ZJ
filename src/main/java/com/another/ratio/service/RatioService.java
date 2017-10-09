package com.another.ratio.service;

import com.another.ratio.entity.Ratio;

import java.util.List;

/**
 * Created by 30590 on 2017-02-28 0028.
 */
public interface RatioService {
    public int addratio(Ratio ratio);
    public List<Ratio> getratio(Ratio ratio);
}
