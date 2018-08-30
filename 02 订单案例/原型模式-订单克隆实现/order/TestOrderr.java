package com.demo.order;

public class TestOrderr {

	public static void main(String[] args) {
		
		 
		 AbstractOrder order1 =  new  PersonOrder(18932023,"王明",4500);
		 AbstractOrder order2 =  new  EnterpriceOrder(13932773,"腾讯的企业订单",3500);
		 AbstractOrder order3 =  new  GovermentOrder(1000888,"政府机构A的订单",3500);
		 
		 
		 IOrderProcess[] orderArray = OrderBussiness.processOrder(order2);
		
		
		for(int i = 0;i<orderArray.length;i++){
			System.out.println("政府机构A的订单数量：" + orderArray[i].getProductCount());
		} 
		

	}

}
