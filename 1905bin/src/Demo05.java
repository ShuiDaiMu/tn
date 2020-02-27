
public class Demo05 {
	public static void main(String[] args) {
		int a = 0x4fa6f23e;
		int b = a>>>1;
		int c = a>>>2;
		int d = a>>>3;
		int f = (a)&0xff;
		int f1 =(a>>>8)&0xff;
		int f2 =(a>>>16)&0xff;
		int f3 =(a>>>24)&0xff;
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toBinaryString(b));
		System.out.println(Integer.toBinaryString(c));
		System.out.println(Integer.toBinaryString(d));
		System.out.println(Integer.toBinaryString(f));
		System.out.println(Integer.toBinaryString(f1));
		System.out.println(Integer.toBinaryString(f2));
		System.out.println(Integer.toBinaryString(f3));
		
		
		
	}
}
