package com.qfedu.dao;

import com.qfedu.entity.Car;
import com.qfedu.entity.Order;
import com.qfedu.entity.OrderTwo;

import java.util.List;

public interface OrderDao {
    public Car findCar(int id);
    public void addCar(Order order);
    public List<OrderTwo> orderSelect(int id);
    public void  orderDelete(Integer id);
}
