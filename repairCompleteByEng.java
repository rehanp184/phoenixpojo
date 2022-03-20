package com.Phoenixpojo;

import java.util.List;

public class repairCompleteByEng {

private Integer jobId;
private List<Problem> problems = null;


public repairCompleteByEng(Integer jobId, List<Problem> problems) {
super();
this.jobId = jobId;
this.problems = problems;
}

public Integer getJobId() {
return jobId;
}

public void setJobId(Integer jobId) {
this.jobId = jobId;
}

public List<Problem> getProblems() {
return problems;
}

public void setProblems(List<Problem> problems) {
this.problems = problems;
}

}