package com.demo.order;
/**
 * 订单处理类
 * @author qianghj
 *
 */
public class OrderBussiness {
	/**
	 * 订单核心处理功能
	 * @param order	原始订单
	 * @return	返回拆分后的所有订单
	 */
	public static IOrderProcess[] processOrder(IOrderProcess order){//个人订单： 132892，王明，500
		//子订单的总个数
		 int sunOrdercount =(int) Math.ceil((order.getProductCount() / 1000.0f )) ;
		 IOrderProcess[] orderArray = new  IOrderProcess[sunOrdercount];
		 int index = 0;//已产生的子订单的个数
		 
		while(order.getProductCount() >1000){//4500
				//克隆个人订单（产品数量不复制）
				AbstractOrder sub =  order.cloneOrder();
				sub.setProductCount(1000);
				orderArray[index++] =  sub;
				order.setProductCount(order.getProductCount() - 1000);
			 
		}
		orderArray[index++] =  order;
		
		return orderArray;
	}
	
	
	
	
	
	
	
	
	
	
}
