package com.inspur.report.apiImpl;

import com.inspur.report.api.BugReportApi;
import com.inspur.report.domain.ProjectStatisticResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.inspur.report.mapper.BugReportMapper;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @ClassName BugReportApiImpl
 * @Description bug统计接口实现
 * @Author 周秀娟
 * @Date 2018-10-14 19:11
 * @Version 1.0
 **/
@Transactional
@Service
public class BugReportApiImpl implements BugReportApi {
    @Autowired
    private BugReportMapper bugReportMapper;

    @Override
    public List<ProjectStatisticResult> selectBug(){
        System.out.println("-------------");
        List<ProjectStatisticResult> list = bugReportMapper.selectBug();
        System.out.println("----333---------");
        return list;
    }
}
