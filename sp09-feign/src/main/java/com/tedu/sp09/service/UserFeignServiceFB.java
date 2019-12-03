package com.tedu.sp09.service;

import com.tedu.sp01.pojo.User;
import com.tedu.web.util.JsonResult;
import org.springframework.stereotype.Component;

/**
 * @version 创建时间：2019/11/29 0029 11:36
 * @Auther 作者：潘青焕
 * @Email 邮箱：2279908347@qq.com
 * @Description 描述:
 */
@Component
public class UserFeignServiceFB implements UserFeignService {
    @Override
    public JsonResult<User> getUser(Integer userId) {
        return JsonResult.err("无法获取用户信息!");
    }

    @Override
    public JsonResult addScore(Integer userId, Integer score) {
        return JsonResult.err("无法增加用户积分！");
    }
}
