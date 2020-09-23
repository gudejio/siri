package com.qfedu.dao;

import com.qfedu.entity.Car;
import com.qfedu.entity.City;

import java.util.List;

/**
 * projectName: car
 *
 * @author: xr
 * time: 2020/9/17 19:29
 * description:
 */

public interface CarDao {
    public List<City> select(int pid );
    public List<Car> selectByCityId(int cid);
    public City selectMsg(int id);
}
