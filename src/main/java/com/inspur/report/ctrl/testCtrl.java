package com.inspur.report.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName testCtrl
 * @Description 测试控制器
 * @Author 周秀娟
 * @Date 2018-10-14 17:46
 * @Version 1.0
 **/

@Controller()
@RequestMapping(value="/test")  //@RequestMapping("/test"),对于RequestMapping如果只有value一个属性，可以只写value的值
public class testCtrl {
    @RequestMapping(value = "/hello",method = RequestMethod.POST)
    public @ResponseBody  String hello(){
        return "Hello World!";
    }
}
