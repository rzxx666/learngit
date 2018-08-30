package com.demo.order;
/**
 * 企业订单
 * @author qianghj
 *
 */
public class EnterpriceOrder extends AbstractOrder{
	private String enterpriceOrderOwner;
	public EnterpriceOrder(){}
	public EnterpriceOrder(int orderId,String enterpriceOrderOwner,int proCount){
		super(orderId,proCount);
		this.enterpriceOrderOwner= enterpriceOrderOwner;
	}
	
	
	public String getEnterpriceOrderOwner() {
		return enterpriceOrderOwner;
	}

	public void setEnterpriceOrderOwner(String enterpriceOrderOwner) {
		this.enterpriceOrderOwner = enterpriceOrderOwner;
	}

	/**
	 * 企业订单的克隆
	 * @param order 原始订单
	 * @return 克隆出来的企业订单
	 */
	@Override
	public AbstractOrder cloneOrder() { 
		
		EnterpriceOrder sub =  new EnterpriceOrder();
		sub.setOrderId(this.getOrderId());
		sub.setEnterpriceOrderOwner(this.enterpriceOrderOwner);
		
		return sub;
	}
	@Override
	public void setProductCount(int productCount) {
		 
		
	}
	@Override
	public int getProductCount() {
		 
		return 0;
	}
	
	
}
