package com.qfedu.service.impl;

import com.github.pagehelper.PageHelper;
import com.qfedu.dao.CarDao;
import com.qfedu.entity.Car;
import com.qfedu.entity.City;
import com.qfedu.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * projectName: car
 *
 * @author: xr
 * time: 2020/9/17 20:21
 * description:
 */


@Service
public class CityServiceImpl  implements CityService {

    @Autowired
    private CarDao carDao;
    @Override
    public List<City> select(int pid) {

        List<City>  list = carDao.select(pid);
        return list;
    }

    @Override
    public List<Car> selectByCityId(int cid, Integer page, Integer limit) {

        PageHelper.startPage(page,limit);
        List<Car> cars = carDao.selectByCityId(cid);
        if(cars.size() == 0){
            throw new RuntimeException("所选地区暂无车辆");
        }
        return cars;
    }

    @Override
    public City selectMsg(int id) {
        City city = carDao.selectMsg(id);
        return city;
    }
}
