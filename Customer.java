package com.Phoenixpojo;
public class Customer {

private String firstName;
private String lastName;
private String mobileNumber;
private String mobileNumberAlt;
private String emailId;
private String emailIdAlt;

public Customer() {
}

public Customer(String firstName, String lastName, String mobileNumber, String mobileNumberAlt, String emailId, String emailIdAlt) {
super();
this.firstName = firstName;
this.lastName = lastName;
this.mobileNumber = mobileNumber;
this.mobileNumberAlt = mobileNumberAlt;
this.emailId = emailId;
this.emailIdAlt = emailIdAlt;
}

public String getFirstName() {
return firstName;
}

public void setFirstName(String firstName) {
this.firstName = firstName;
}

public String getLastName() {
return lastName;
}

public void setLastName(String lastName) {
this.lastName = lastName;
}

public String getMobileNumber() {
return mobileNumber;
}

public void setMobileNumber(String mobileNumber) {
this.mobileNumber = mobileNumber;
}

public String getMobileNumberAlt() {
return mobileNumberAlt;
}

public void setMobileNumberAlt(String mobileNumberAlt) {
this.mobileNumberAlt = mobileNumberAlt;
}

public String getEmailId() {
return emailId;
}

public void setEmailId(String emailId) {
this.emailId = emailId;
}

public String getEmailIdAlt() {
return emailIdAlt;
}

public void setEmailIdAlt(String emailIdAlt) {
this.emailIdAlt = emailIdAlt;
}

}