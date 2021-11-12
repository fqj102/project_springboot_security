package com.atguigu.order.controller;

import com.atguigu.utils.utils.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/admin/order/index")
public class demoController {
    /**
     * 根据token获取用户信息
     */
    @GetMapping("findAll")
    public R info(){
        System.out.println("okkkkkk");
        return R.ok().data(null);
    }
}
