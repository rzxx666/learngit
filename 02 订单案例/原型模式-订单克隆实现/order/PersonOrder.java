package com.demo.order;
/**
 * 个人订单
 * @author qianghj
 *
 */
public class PersonOrder extends AbstractOrder{
	private String personOrderOwner;//订单拥有的个人姓名
	public PersonOrder(){
		
	}

	public PersonOrder(int orderId,String personOrderOwner,int proCount){
		super(orderId,proCount);
		this.personOrderOwner= personOrderOwner;
	}
	
	
	public String getPersonOrderOwner() {
		return personOrderOwner;
	}

	public void setPersonOrderOwner(String personOrderOwner) {
		this.personOrderOwner = personOrderOwner;
	}

	@Override
	public String toString() {
		return "PersonOrder [personOrderOwner=" + personOrderOwner + "]";
	}

	 
	/**
	 *个人订单的克隆
	 * @return 克隆出来的个人订单
	 */
	@Override
	public AbstractOrder cloneOrder() {    
		PersonOrder sub =  new PersonOrder();
		sub.setOrderId(this.getOrderId());
		sub.setPersonOrderOwner(this.personOrderOwner);
		return sub;
	}
	
	
}
