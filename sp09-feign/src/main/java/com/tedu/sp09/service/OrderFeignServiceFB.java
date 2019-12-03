package com.tedu.sp09.service;

import com.tedu.sp01.pojo.Order;
import com.tedu.web.util.JsonResult;
import org.springframework.stereotype.Component;

/**
 * @version 创建时间：2019/11/29 0029 11:36
 * @Auther 作者：潘青焕
 * @Email 邮箱：2279908347@qq.com
 * @Description 描述:
 */
@Component
public class OrderFeignServiceFB implements OrderFeignService {
    @Override
    public JsonResult<Order> getOrder(String orderId) {
        return JsonResult.err("无法获取商品订单！");
    }

    @Override
    public JsonResult addOrder() {
        return JsonResult.err("无法保存订单1");
    }
}
