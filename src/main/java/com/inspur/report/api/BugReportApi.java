package com.inspur.report.api;

import com.inspur.report.domain.ProjectStatisticResult;

import java.util.List;

public interface BugReportApi {

    List<ProjectStatisticResult> selectBug();
}
