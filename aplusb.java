public class test {
	public int aplusb(int a, int b) {
		while (b != 0) {
			int carry = (a & b) << 1; //确定是否进1，1-进1,0-不进1 
			a = a ^ b;  //没有进位前的和
			b = carry;
		}
		return a;
	}
	//测试
	public static void main(String args[]) {
		test t = new test();
		System.out.println(t.aplusb(100, -100));
	}
}
