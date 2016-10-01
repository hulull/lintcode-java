public class Solution {

	public int atoi(String str) {
		str = str.trim();  //去掉空格
		int ix = str.indexOf('.'); //截取小数点前面的部分
		if (ix >= 0) {
			str = str.substring(0, ix);
			ix = -1; //这里需要重置
		}
		ix = str.indexOf('-');
		if (ix >= 0) {
			if (ix > 0 && str.charAt(ix-1) == '+')
				return 0;
			str = str.substring(ix+1);
		}
		long ret = 0;  //存储计算结果
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (ret == 0 && (str.charAt(i) > '9' || str.charAt(i) < '0')) //前面无意义字符跳过
				continue;
			if ((str.charAt(i) > '9' || str.charAt(i) < '0') && ret != 0) //第一个有意义的数字有效
				break;
			ret = ret * 10 + (str.charAt(i)-'0');
			if (++count > 10) //int转换成10进制最多有10位数
				break;
		}
		if (ix >= 0) //当ix >= 0时，ret是负数
			ret = -ret;
		if (ret > Integer.MAX_VALUE)
			return Integer.MAX_VALUE;
		if (ret < Integer.MIN_VALUE)
			return Integer.MIN_VALUE;
		int res = (int) ret;
		return res;
	}


	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.atoi("1000"));
		System.out.println(s.atoi("-1"));
		System.out.println(s.atoi("123123123123123123"));
		System.out.println(s.atoi("1.0"));
		System.out.println(s.atoi("10100"));
		System.out.println(s.atoi("1234"));
		System.out.println(s.atoi("   fe"));
		System.out.println(s.atoi("   +-1111"));
		System.out.println(s.atoi("  --342hkjhk"));
		System.out.println(s.atoi("  -+234gewg"));
		System.out.println(s.atoi("+-fewgf234"));
		System.out.println(s.atoi("1234567890123456789012345678901234567890"));
	}
}
