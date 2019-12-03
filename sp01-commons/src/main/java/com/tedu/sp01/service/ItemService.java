package com.tedu.sp01.service;

/**
 * @version 创建时间：2019/11/27 0027 12:17
 * @Auther 作者：潘青焕
 * @Email 邮箱：2279908347@qq.com
 * @Description 描述:
 */

import java.util.List;

import com.tedu.sp01.pojo.Item;

public interface ItemService {
    List<Item> getItems(String orderId);

    void decreaseNumbers(List<Item> list);
}
