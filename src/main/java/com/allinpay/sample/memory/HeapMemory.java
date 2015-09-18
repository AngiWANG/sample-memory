package com.allinpay.sample.memory;

public class HeapMemory {
	public static void main(String[] args) throws Throwable {
		
		AddressBean addressBean = new AddressBean();
		addressBean.setStreet("street");
		addressBean.setNo(10000);
		
		UserBean userBean = new UserBean();
		userBean.setAge(30);
		userBean.setName("Angi");
		userBean.setAddressBean(addressBean);

		System.in.read();
	}
}
