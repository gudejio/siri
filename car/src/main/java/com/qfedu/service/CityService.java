package com.qfedu.service;

import com.qfedu.entity.Car;
import com.qfedu.entity.City;

import java.util.List;

/**
 * projectName: car
 *
 * @author: xr
 * time: 2020/9/17 20:17
 * description:
 */

public interface CityService {
    public List<City> select(int pid);
    public List<Car> selectByCityId(int cid,Integer page,Integer limit);
    public City selectMsg(int id);

}
