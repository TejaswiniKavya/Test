package com.teju.com.SpringCoreCollection;

import java.util.*;

public class JavaCollection {
	
	List addressList;
	Set addressSet;
	Map addressMap;
	Properties addressProp;
	public List getAddressList() {
		System.out.println("Inside List:"+addressList);
		return addressList;
	}
	public void setAddressList(List addressList) {
		this.addressList = addressList;
	}
	
	
	
	public Set getAddressSet() {
		System.out.println("Inside Set:"+addressSet);
		return addressSet;
	}
	public void setAddressSet(Set addressSet) {
		this.addressSet = addressSet;
	}
	
	
	
	public Map getAddressMap() {
		System.out.println("Inside Map:"+addressMap);
		return addressMap;
	}
	public void setAddressMap(Map addressMap) {
		this.addressMap = addressMap;
	}
	
	
	
	public Properties getAddressProp() {
		System.out.println("Inside Properties:"+addressProp);
		return addressProp;
	}
	public void setAddressProp(Properties addressprop) {
		this.addressProp = addressprop;
	}
	
	
	
	

}
