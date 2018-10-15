package com.inspur.report.ctrl;

import com.google.gson.Gson;
import com.inspur.report.api.BugReportApi;
import com.inspur.report.domain.ProjectStatisticResult;
import com.inspur.report.util.GsonSingletonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @ClassName BugReportCtrl
 * @Description 测试的bug统计控制层
 * @Author 周秀娟
 * @Date 2018-10-14 19:25
 * @Version 1.0
 **/
@Controller
@RequestMapping(value = "/bugCtrl")
public class BugReportCtrl {
    @Autowired
    private  BugReportApi bugReportApi;
    private final Gson gson = GsonSingletonUtil.getInstance();
    /**
     * 统计
     * @return
     */
    @RequestMapping(value = "/getResult")
    public @ResponseBody  String getResult(){

        List<ProjectStatisticResult> list = bugReportApi.selectBug();
        System.out.println(this.gson.toJson(list));
        return  this.gson.toJson(list);
    }

}
