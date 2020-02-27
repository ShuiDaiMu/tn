
public class Demo01 {
	public static void main(String[] args) {
		/**
		 * java数据底层都是二进制
		 * 
		 * Integer.parseInt()//将10进制字符串转换为2进制整数int
		 * 
		 * Integer.toString()//将2进制数字int转换为10进制字符串给人看
		 * 
		 * java能够处理10进制全部依赖于Intreger类
		 * 
		 */
		int n = 19;
		System.out.println(n);
		/*
		 * toBinaryString(n)将n实际的二进制，转换为字符串，用于输出数字的2进制。
		 */
		System.out.println(Integer.toBinaryString(n));
		System.out.println(Integer.toBinaryString(100));
		
		
		
		for(int i = 0 ;i<150;i++) {
			System.out.println(Integer.toBinaryString(i));
		}
		System.out.println(Integer.toBinaryString(129));//10000001
	}
}
