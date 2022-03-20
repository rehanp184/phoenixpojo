package com.Phoenixpojo;

public class Problem {

private Integer id;
private String remark;

public Problem() {
}

public Problem(Integer id, String remark) {
super();
this.id = id;
this.remark = remark;
}

public Integer getId() {
return id;
}

public void setId(Integer id) {
this.id = id;
}

public String getRemark() {
return remark;
}

public void setRemark(String remark) {
this.remark = remark;
}

}
