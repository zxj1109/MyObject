package com.inspur.report.mapper;


import com.inspur.report.domain.ProjectStatisticResult;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 * @ClassName BugReportMapper
 * @Description
 * @Author 周秀娟
 * @Date 2018-10-14 19:12
 * @Version 1.0
 **/
@Mapper
//@Repository
public interface BugReportMapper {

    List<ProjectStatisticResult> selectBug();
}
