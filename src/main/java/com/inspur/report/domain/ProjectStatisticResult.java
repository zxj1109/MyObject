package com.inspur.report.domain;

import java.util.Date;

/**
 * @ClassName ProjectStatisticResult
 * @Description ProjectStatisticResult实体类
 * @Author 周秀娟
 * @Date 2018-10-14 19:37
 * @Version 1.0
 **/
public class ProjectStatisticResult extends BaseDomain{
    private Long id;
    private String projectDept;
    private String projectManager;
    private String projectUuid;
    private String projectEName;
    private String projectName;
    private Integer totalLines;
    private double perAllThousand;
    private double perLeftThousand;
    private Integer allQuestions;
    private Integer leftQuestions;
    private Date statisticDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProjectDept() {
        return projectDept;
    }

    public void setProjectDept(String projectDept) {
        this.projectDept = projectDept;
    }

    public String getProjectManager() {
        return projectManager;
    }

    public void setProjectManager(String projectManager) {
        this.projectManager = projectManager;
    }

    public String getProjectUuid() {
        return projectUuid;
    }

    public void setProjectUuid(String projectUuid) {
        this.projectUuid = projectUuid;
    }

    public String getProjectEName() {
        return projectEName;
    }

    public void setProjectEName(String projectEName) {
        this.projectEName = projectEName;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Integer getTotalLines() {
        return totalLines;
    }

    public void setTotalLines(Integer totalLines) {
        this.totalLines = totalLines;
    }

    public double getPerAllThousand() {
        return perAllThousand;
    }

    public void setPerAllThousand(double perAllThousand) {
        this.perAllThousand = perAllThousand;
    }

    public double getPerLeftThousand() {
        return perLeftThousand;
    }

    public void setPerLeftThousand(double perLeftThousand) {
        this.perLeftThousand = perLeftThousand;
    }

    public Integer getAllQuestions() {
        return allQuestions;
    }

    public void setAllQuestions(Integer allQuestions) {
        this.allQuestions = allQuestions;
    }

    public Integer getLeftQuestions() {
        return leftQuestions;
    }

    public void setLeftQuestions(Integer leftQuestions) {
        this.leftQuestions = leftQuestions;
    }

    public Date getStatisticDate() {
        return statisticDate;
    }

    public void setStatisticDate(Date statisticDate) {
        this.statisticDate = statisticDate;
    }
}
