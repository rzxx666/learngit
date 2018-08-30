package com.demo.order;
/**
 * 通用订单（所有订单的统称）
 * @author qianghj
 *
 */
public abstract class AbstractOrder implements IOrderProcess {
	
	private int orderId;//订单编号
	private int productCount;//订单中产品数量
	
	public AbstractOrder(){
		
	}
	
	public AbstractOrder(int orderId, int productCount) {
		super();
		this.orderId = orderId;
		this.productCount = productCount;
	}



	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	 
	public int getProductCount() {
		return productCount;
	}

	public void setProductCount(int productCount) {
		this.productCount = productCount;
	}

	 
	
	 
	

}
