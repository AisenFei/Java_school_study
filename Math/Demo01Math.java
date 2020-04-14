/*
 * java.util.Math类是数学相关的工具类，里面提供了大力量的静态方法，完成与数学运算相关的操作
 * 
 * public static double abs(double num):获取绝对值
 * public static double ceil(double num):向上取整
 * public static double floor(double num):向下取整
 * public static long round(double num):四舍五入
 * Math.PI代表近似的圆周率常量
 */
public class Demo01Math {
	
	public static void main(String[] args){
		//获取绝对值
		System.out.println(Math.abs(3.14));//3.14
		System.out.println(Math.abs(0));//0
		System.out.println(Math.abs(-1.2));//1.2
		System.out.println("=========");
		
		//向上取整
		System.out.println(Math.ceil(3.14));//4.0
		System.out.println(Math.ceil(3.9));//4.0
		System.out.println(Math.ceil(3.0));//3.0
		System.out.println("=========");
		
		//向下取整.抹零
		System.out.println(Math.floor(3.14));//3.0
		System.out.println(Math.floor(30.1));//30.0
		System.out.println(Math.floor(31.21));//31.0
		System.out.println(Math.floor(31.9));//31.0
		System.out.println("=========");
		
		System.out.println(Math.round(20.4));//20
		System.out.println(Math.round(11.6));//12
	}
}
