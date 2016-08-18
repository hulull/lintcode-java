public class test {
	//时间复杂度是O(n)
	public long trailingZeros(long n) {
		long count = 0;
		long pow = 25;
		for (long i = 5; i <= n; i+=5) {
			count++;
			pow = 25;
			while (i % pow == 0) { //是5的几次幂就多产生几个0
				count++;
				pow *= 5;
			}
		}
		return count;
	}
	//时间负责度是O(logn)
	public long trailingZeros2(long n) {
		long count = 0;
		long step = 5;
		while (n / step > 0) {
			count += n / step;
			step *= 5;
		}
		return count;
	}
	public static void main(String args[]) {
		test t = new test();
		System.out.println(t.trailingZeros2(105));
	}
}
