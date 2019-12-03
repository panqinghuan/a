package com.tedu.sp04.order.service;

import com.tedu.sp01.pojo.Order;

/**
 * @version 创建时间：2019/11/27 0027 14:45
 * @Auther 作者：潘青焕
 * @Email 邮箱：2279908347@qq.com
 * @Description 描述:
 */
public interface OrderService {
    Order getOrder(String orderId);
    void addOrder (Order order);
}
