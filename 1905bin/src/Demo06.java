
public class Demo06 {
	public static void main(String[] args) {
		int n = 0xdd;
		int m = 0xff00;
		int k = n|m;
		System.err.println(Integer.toBinaryString(k));
		int b1 = 0xf4;
		int b2 = 0xe3;
		int b3 = 0xd3;
		int b4 = 0xd1;
		int b = (b1<<24)|(b2<<16)|(b3<<8)|(b4);
		System.out.println(Integer.toBinaryString(b1));
		System.out.println(Integer.toBinaryString(b2));
		System.out.println(Integer.toBinaryString(b3));
		System.out.println(Integer.toBinaryString(b4));
		System.out.println(Integer.toBinaryString(b));
	}
}
