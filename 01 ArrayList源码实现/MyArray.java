package com.demo.constructor;
/**
 * ���Զ�̬���ݵ�int���͵�����
 * @author qianghj
 *
 */
public class MyArray {
	 
	//��ʼ����������ʱ����Ĭ�ϵĳ���Ϊ10������
	
	private int[] defaultArray =null;
	// ��ʾ �Ѿ����ڵ�Ԫ�ظ���
	private int count =0;
	
	public MyArray(){
		this(10);
	}
	
	/**
	 * ���캯��
	 * @param initCapacity	��ʼ������������
	 */
	public MyArray(int initCapacity){ 
		defaultArray = new int[initCapacity];
	}
	
	 
	/**
	 * �����Ԫ��
	 * @param element	��Ԫ��
	 */
	public void add(int element){
		//����(���ƾ����飬�����Ԫ��)
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
	 * ��ü�����Ԫ�صĸ���
	 */
	public int size(){
		return count;
	}
	
	/**
	 * �����±�������
	 * @param index ָ���±�
	 * @return ����ָ���±��Ԫ��ֵ
	 */
	public  int getData(int index){
		if(index >= 0 && index <count )
			return defaultArray[index];
		else{
			System.out.println("��Ч���±꣬�±������0~ " +count  +"��Χ֮��");
			return 0;//���쳣
		}
		
	}

	/**
	 * ����Ԫ���±��Ƴ�Ԫ��
	 * @param index
	 */
	public void remove(int index){//3
		if(index >=count || index <0){
			System.out.println("��Ч���±�,�±귶Χ������0~" + (count-1));
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
	 * ���ظ�Ԫ�ص�һ�γ�����������±꣬����Ԫ�ز����ڣ��򷵻�-1 
	 * @param data
	 * @return ����Ԫ�ص�һ�γ�����������±꣬����Ԫ�ز����ڣ��򷵻�-1
	 */
	public int indexOf(int data){
		for(int i =0;i<count;i++){
		
		}	if(defaultArray[i] == data)
				return i;
		return -1;
	}
	//�������������Ԫ��
	public void getMyArray(){
		for(int i =0;i< count;i++){
			System.out.print(defaultArray[i] + ",");
		}
	}
}
