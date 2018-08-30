package com.demo.order;

public class GovermentOrder extends AbstractOrder{
	private String govermentDeptName;
	public GovermentOrder(){}
	public GovermentOrder(int orderId,String govermentDeptName,int proCount){
		super(orderId,proCount);
		this.govermentDeptName= govermentDeptName;
	}
	
	
	public String getGovermentDeptName() {
		return govermentDeptName;
	}

	public void setGovermentDeptName(String govermentDeptName) {
		this.govermentDeptName = govermentDeptName;
		 
	}


	@Override
	public AbstractOrder cloneOrder() {
		GovermentOrder sub =  new GovermentOrder();
		sub.setOrderId(this.getOrderId());
		sub.setGovermentDeptName(this.govermentDeptName);
		return sub;
	}
	
}
