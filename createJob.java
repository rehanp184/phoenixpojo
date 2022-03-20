package com.Phoenixpojo;
import java.util.List;
public class createJob {
private Integer mstServiceLocationId;
private Integer mstPlatformId;
private Integer mstWarrentyStatusId;
private Integer mstOemId;
private Customer customer;
private customerAddress customerAddress;
private customerProduct customerProduct;
private List<Problem> problems = null;

public createJob() {
}
public createJob(Integer mstServiceLocationId, Integer mstPlatformId,
		Integer mstWarrentyStatusId, Integer mstOemId, Customer customer, customerAddress customerAddress, 
		customerProduct customerProduct, List<Problem> problems) {
super();
this.mstServiceLocationId = mstServiceLocationId;
this.mstPlatformId = mstPlatformId;
this.mstWarrentyStatusId = mstWarrentyStatusId;
this.mstOemId = mstOemId;
this.customer = customer;
this.customerAddress = customerAddress;
this.customerProduct = customerProduct;
this.problems = problems;
}

public Integer getMstServiceLocationId() {
return mstServiceLocationId;
}

public void setMstServiceLocationId(Integer mstServiceLocationId) {
this.mstServiceLocationId = mstServiceLocationId;
}

public Integer getMstPlatformId() {
return mstPlatformId;
}

public void setMstPlatformId(Integer mstPlatformId) {
this.mstPlatformId = mstPlatformId;
}

public Integer getMstWarrentyStatusId() {
return mstWarrentyStatusId;
}

public void setMstWarrentyStatusId(Integer mstWarrentyStatusId) {
this.mstWarrentyStatusId = mstWarrentyStatusId;
}

public Integer getMstOemId() {
return mstOemId;
}

public void setMstOemId(Integer mstOemId) {
this.mstOemId = mstOemId;
}

public Customer getCustomer() {
return customer;
}

public void setCustomer(Customer customer) {
this.customer = customer;
}

public customerAddress getCustomerAddress() {
return customerAddress;
}

public void setCustomerAddress(customerAddress customerAddress) {
this.customerAddress = customerAddress;
}

public customerProduct getCustomerProduct() {
return customerProduct;
}

public void setCustomerProduct(customerProduct customerProduct) {
this.customerProduct = customerProduct;
}

public List<Problem> getProblems() {
return problems;
}

public void setProblems(List<Problem> problems) {
this.problems = problems;
}


@Override
public String toString() {
	return "createJob [mstServiceLocationId=" + mstServiceLocationId + ", mstPlatformId=" + mstPlatformId
			+ ", mstWarrentyStatusId=" + mstWarrentyStatusId + ", mstOemId=" + mstOemId + ", customer=" + customer
			+ ", customerAddress=" + customerAddress + ", customerProduct=" + customerProduct + ", problems=" + problems
			+ ", getMstServiceLocationId()=" + getMstServiceLocationId() + ", getMstPlatformId()=" + getMstPlatformId()
			+ ", getMstWarrentyStatusId()=" + getMstWarrentyStatusId() + ", getMstOemId()=" + getMstOemId()
			+ ", getCustomer()=" + getCustomer() + ", getCustomerAddress()=" + getCustomerAddress()
			+ ", getCustomerProduct()=" + getCustomerProduct() + ", getProblems()=" + getProblems() + "]";
}

}
