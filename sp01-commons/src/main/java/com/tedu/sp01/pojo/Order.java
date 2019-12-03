package com.tedu.sp01.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @version 创建时间：2019/11/27 0027 12:17
 * @Auther 作者：潘青焕
 * @Email 邮箱：2279908347@qq.com
 * @Description 描述:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    private String id;
    private User user;
    private List<Item> items;
}
