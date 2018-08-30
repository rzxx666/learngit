package com.demo.order;

public interface IOrderProcess {
		//订单克隆---
		public AbstractOrder cloneOrder();
		//重置订单中产品数量
		public void setProductCount( int productCount);
		public int getProductCount();
}
