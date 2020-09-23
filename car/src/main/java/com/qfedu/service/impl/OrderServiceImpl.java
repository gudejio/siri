package com.qfedu.service.impl;

import com.github.pagehelper.PageHelper;
import com.qfedu.dao.OrderDao;
import com.qfedu.entity.Car;
import com.qfedu.entity.Order;
import com.qfedu.entity.OrderTwo;
import com.qfedu.service.OrderService;
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
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderDao orderDao;


    @Override
    public Car findCar(int id) {
        Car car = orderDao.findCar(id);
        return car;
    }

    @Override
    public void addCar(Order order) {
        if (order == null) {
            throw new RuntimeException("订单信息错误");

        }
        orderDao.addCar(order);
    }

    @Override
    public List<OrderTwo> orderSelect(int id, int page, int limit) {

        PageHelper.startPage(page,limit);
        List<OrderTwo> orders = orderDao.orderSelect(id);
        return orders;
    }

    @Override
    public void orderDelete(int id) {

        orderDao.orderDelete(id);
    }
}
