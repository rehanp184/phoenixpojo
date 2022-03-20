package com.Phoenixpojo;

public class customerProduct {

private String dop;
private String serialNumber;
private String imei1;
private String imei2;
private String popurl;
private Integer productId;
private Integer mstModelId;


public customerProduct() {
}
public customerProduct(String dop, String serialNumber, String imei1, String imei2, String popurl, Integer productId, Integer mstModelId) {
super();
this.dop = dop;
this.serialNumber = serialNumber;
this.imei1 = imei1;
this.imei2 = imei2;
this.popurl = popurl;
this.productId = productId;
this.mstModelId = mstModelId;
}

public String getDop() {
return dop;
}

public void setDop(String dop) {
this.dop = dop;
}

public String getSerialNumber() {
return serialNumber;
}

public void setSerialNumber(String serialNumber) {
this.serialNumber = serialNumber;
}

public String getImei1() {
return imei1;
}

public void setImei1(String imei1) {
this.imei1 = imei1;
}

public String getImei2() {
return imei2;
}

public void setImei2(String imei2) {
this.imei2 = imei2;
}

public String getPopurl() {
return popurl;
}

public void setPopurl(String popurl) {
this.popurl = popurl;
}

public Integer getProductId() {
return productId;
}

public void setProductId(Integer productId) {
this.productId = productId;
}

public Integer getMstModelId() {
return mstModelId;
}

public void setMstModelId(Integer mstModelId) {
this.mstModelId = mstModelId;


}
}