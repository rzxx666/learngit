package com.demo.constructor;
/**
 * 可以动态扩容的int类型的容器
 * @author qianghj
 *
 */
public class MyArray {
	 
	//初始化该容器的时候，有默认的长度为10的数组
	
	private int[] defaultArray =null;
	// 表示 已经存在的元素个数
	private int count =0;
	
	public MyArray(){
		this(10);
	}
	
	/**
	 * 构造函数
	 * @param initCapacity	初始化容器的容量
	 */
	public MyArray(int initCapacity){ 
		defaultArray = new int[initCapacity];
	}
	
	 
	/**
	 * 添加新元素
	 * @param element	新元素
	 */
	public void add(int element){
		//扩容(复制旧数组，添加新元素)
		if(count >= defaultArray.length){
			int[] newArray = 	new int[2 * defaultArray.length + 1];
			for(int i =0;i< defaultArray.length;i++){
				newArray[i] = defaultArray[i];
			}
			defaultArray = newArray;
		}
		defaultArray[count++] = element;
	}
	
	
	/**
	 * 获得集合中元素的个数
	 */
	public int size(){
		return count;
	}
	
	/**
	 * 根据下标获得数据
	 * @param index 指定下标
	 * @return 返回指定下标的元素值
	 */
	public  int getData(int index){
		if(index >= 0 && index <count )
			return defaultArray[index];
		else{
			System.out.println("无效的下标，下标必须在0~ " +count  +"范围之内");
			return 0;//抛异常
		}
		
	}

	/**
	 * 根据元素下标移除元素
	 * @param index
	 */
	public void remove(int index){//3
		if(index >=count || index <0){
			System.out.println("无效的下标,下标范围必须在0~" + (count-1));
			return;
		}
			
		int[] newArr = new int[--count];
		for(int i =0;i<count-1;i++){
			if(i < index)
				newArr[i] = defaultArray[i];
			else //i>=index
				newArr[i]= defaultArray[i+1];
		}
		 
		defaultArray = newArr;
	}
	 
	
	/**
	 * 返回该元素第一次出现在数组的下标，若该元素不存在，则返回-1 
	 * @param data
	 * @return 返回元素第一次出现在数组的下标，若该元素不存在，则返回-1
	 */
	public int indexOf(int data){
		for(int i =0;i<count;i++){
		
		}	if(defaultArray[i] == data)
				return i;
		return -1;
	}
	//输出该容器所有元素
	public void getMyArray(){
		for(int i =0;i< count;i++){
			System.out.print(defaultArray[i] + ",");
		}
	}
}
