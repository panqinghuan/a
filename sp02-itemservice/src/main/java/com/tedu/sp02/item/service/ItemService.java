package com.tedu.sp02.item.service;

import com.tedu.sp01.pojo.Item;

import java.util.List;

public interface ItemService {
    List<Item> getItems(String orderId);

    void decreaseNumbers(List<Item> list);
}
