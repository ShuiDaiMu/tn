
public class Demo02 {
	/*
	 * 2进制与16进制
	 * 
	 * java 7支持直接书写2进制字面量，以0b开头
	 */
	public static void main(String[] args) {
		int n = 0XACB8;
		System.out.println(Integer.toBinaryString(n));
		n = 0Xabe3f2;
		System.out.println(Integer.toBinaryString(n));
	}
}
