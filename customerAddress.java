package com.Phoenixpojo;



public class customerAddress {

private String flatNumber;
private String apartmentName;
private String streetName;
private String landmark;
private String area;
private String pincode;
private String country;
private String state;

public customerAddress(String flatNumber, String apartmentName, String streetName, String landmark, String area, String pincode, String country, String state) {
super();
this.flatNumber = flatNumber;
this.apartmentName = apartmentName;
this.streetName = streetName;
this.landmark = landmark;
this.area = area;
this.pincode = pincode;
this.country = country;
this.state = state;
}

public String getFlatNumber() {
return flatNumber;
}

public void setFlatNumber(String flatNumber) {
this.flatNumber = flatNumber;
}

public String getApartmentName() {
return apartmentName;
}

public void setApartmentName(String apartmentName) {
this.apartmentName = apartmentName;
}

public String getStreetName() {
return streetName;
}

public void setStreetName(String streetName) {
this.streetName = streetName;
}

public String getLandmark() {
return landmark;
}

public void setLandmark(String landmark) {
this.landmark = landmark;
}

public String getArea() {
return area;
}

public void setArea(String area) {
this.area = area;
}

public String getPincode() {
return pincode;
}

public void setPincode(String pincode) {
this.pincode = pincode;
}

public String getCountry() {
return country;
}

public void setCountry(String country) {
this.country = country;
}

public String getState() {
return state;
}

public void setState(String state) {
this.state = state;
}

}
