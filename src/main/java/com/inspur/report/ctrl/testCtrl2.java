package com.inspur.report.ctrl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName testCtrl2
 * @Description 测试注解@RestController
 * @Author 周秀娟
 * @Date 2018-10-14 17:59
 * @Version 1.0
 **/
@RestController
@RequestMapping(value="/test2")
public class testCtrl2 {
    @RequestMapping(value = "/helloWorld",method = RequestMethod.POST)
    public String hello(){
        return "Hello World!";
    }
}
