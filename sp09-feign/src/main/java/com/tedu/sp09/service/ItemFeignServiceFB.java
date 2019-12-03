package com.tedu.sp09.service;

import com.tedu.sp01.pojo.Item;
import com.tedu.web.util.JsonResult;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @version 创建时间：2019/11/29 0029 11:33
 * @Auther 作者：潘青焕
 * @Email 邮箱：2279908347@qq.com
 * @Description 描述:
 */

@Component
public class ItemFeignServiceFB implements ItemFeignService {
    @Override
    public JsonResult<List<Item>> getItems(String orderId) {
        return JsonResult.err("无法获取订单商品列表！");
    }

    @Override
    public JsonResult decreaseNumber(List<Item> items) {
        return JsonResult.err("无法修改商品库存");
    }
}
