import java.net.StandardSocketOptions;

/*
 * 负数的编码
 */
public class Demo04 {
	public static void main(String[] args) {
//		int n = -1;
//		System.out.println(Integer.toBinaryString(n));
//		long m = -1;
//		System.out.println(Long.toBinaryString(m));
//		for(int i=-150;i<0;i++) {
//			System.out.println(Integer.toBinaryString(i));
//		}
//		int a = 	0b11111111111111111111111111100100;
//		System.out.println(Integer.toString(a));
//		
		int p = 23123;
		System.out.println(~p);
		int m = ~p+1;
//		System.out.println(m);
		System.out.println(m);
//		System.out.println(Integer.toBinaryString(~p));
//		System.out.println(Integer.toBinaryString(~p));
//		System.out.println(Integer.toBinaryString(~p+1));
		/*
		 * 74:                      1001010
		 * 11111111111111111111111110110101
		 * 
		 * 
		 * 
		 */
//		int g = 0b11111111111111111111111111100100;
//		System.out.println(Integer.toString(g));
		
	}
}
