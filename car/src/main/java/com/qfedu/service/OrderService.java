package com.qfedu.service;

import com.qfedu.entity.Car;
import com.qfedu.entity.Order;
import com.qfedu.entity.OrderTwo;

import java.util.List;

/**
 * projectName: car
 *
 * @author: xr
 * time: 2020/9/17 19:34
 * description:
 */

public interface OrderService {
    public Car findCar(int id);
    public void addCar(Order order);
    public List<OrderTwo> orderSelect(int id ,int page,int limit);
    public void orderDelete(int id);

}
