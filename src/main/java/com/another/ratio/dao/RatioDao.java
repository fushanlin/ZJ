package com.another.ratio.dao;
import com.another.ratio.entity.Ratio;

import java.util.List;

/**
 * Created by 30590 on 2017-02-28 0028.
 */
public interface RatioDao {
    public int addratio(Ratio user);
    public List<Ratio> getratio(Ratio ratio);

}
