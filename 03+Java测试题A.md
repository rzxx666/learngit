###Java测试题
#### 单选题
(1) 有以下程序片段，下列哪个选项不能插入到行 1 。（ c  ）

	1.		
	2.public  class  A{		
	3.//do sth		
	4. }
		
	A. public class MainClass{}
	B. package mine;
	C. class ANotherClass
	D. import java.util.*;
（2）列表(List)和集合(Set)下面说法正确的是？  ( B  )  

	A. Set中至多只能有一个空元素
	B. List中至多只能有一个空元素
	C. List和Set都可以包含重复元素的有序集合
	D. List和Set都是有序集合
（3）定义类中成员变量时不可能用到的修饰是(B)  
  
	A. final  
	B. void  
	C. protected  
	D. static  
(4)java7后关键字 switch 支不支持字符串作为条件：(A )  

	A.支持
	B. 不支持

(5) 设三个整型变量 x = 1 , y = 2 , z = 3，则表达式 y＋＝z－－/＋＋x 的值是(B）。  

	A. 3
	B. 3.5
	C. 4
	D. 5

(6)abstract和final可以同时作为一个类的修饰符。（B）
   
	A. 正确  
	B. 错误  

(7)以下关于java封装的描述中，正确的是：  A  

	A. 封装的主要作用在于对外隐藏内部实现细节，增强程序的安全性  
	B. 封装的意义不大，因此在编码中尽量不要使用  
	C. 如果子类继承父类，对于父类中进行封装的方法，子类仍然可以直接调用  
	D. 只能对一个类中的方法进行封装，不能对属性进行封装  
(8) 阅读以下 foo 函数，请问它的时间复杂度是：      

	int foo(intarray[], int n, int key){
		int n1=0,n2=n-1,m;
		while(n1<=n2){
			m=(n1+n2)/2;
			if(array[m]==key)
				return m;
			if(array[m]>key)
				n2=m-1;
			else
				n1=m+1;
		}
		return -1;
	}
	A. O(n2)
	B. O(n)
	C. O(log(n))
	D. O(n)
(9)Java中的集合类包括ArrayList、LinkedList、HashMap等类，下列关于集合类描述错误的是   

	A. ArrayList和LinkedList均实现了List接口
	B. ArrayList访问速度比LinkedList快
	C. 添加和删除元素时，ArrayList的表现更佳
	D. HashMap实现Map接口，它允许任何的键和值对象，并允许null用作键或值

(10)下面对JVM叙述不正确的是： 

	A. JVM的全称是Java Virtual Machine
	B. JVM是一种计算机硬件技术，它是Java程序的运行平台
	C. JVM是在计算机硬件系统上用软件实现的一台假象机
	D. Java程序在执行时，JVM把Java字节码解释成机器码

（11）下列哪些针对代码运行结果的描述是正确的？   

	class Car extends Vehicle{
	    public static void main (String[] args) {
	        new  Car(). run();
	    }
	    private final void run() {
	        System. out. println ("Car");
	    }
	}
	class Vehicle{
	    private final void run(){
	        System. out. println("Vehicle");
	    }
	}

	A. Car  
	B. Vehicle  
	C. Compiler error at line 3  
	D. Complier error at line 5  
	E. Exception thrown at runtime  

(12) 以下代码的输出结果是？  
  
	public class B{
	    public static B t1 = new B();
	    public static B t2 = new B();
		{
	        System.out.println("构造块");
	    }
	    static
	    {
	        System.out.println("静态块");
	    }
	    public static void main(String[] args){
	        B t = new B();
	    }
	}

	A. 静态块 构造块 构造块 构造块
	B. 构造块 静态块 构造块 构造块
	C. 构造块 构造块 静态块 构造块
	D. 构造块 构造块 构造块 静态块

(13) void waitForSignal()   

	{
	    Object obj = new Object();
	    synchronized(Thread.currentThread()){
	        obj.wait();
	        obj.notify();
	    }
	}
	Which statement is true?
	A. This code may throw an InterruptedException
	B. This code may throw an IllegalStateException
	C. This code may throw a TimeOutException after ten minutes
	D. This code will not compile unless "obj.wait()" is replaced with "(Thread)obj).wait()"
	E. Reversiong the order of obj.wait() and obj.notify() my cause this method to complete normally.

(14)已知 boolean result  = false，则下面哪个选项是合法的： 
  
	A. result = 1
	B. result = true;
	C. if(result != 0) {// do something...}
	D. if(result){//do something...}