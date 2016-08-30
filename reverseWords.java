public class Solution {
	//方法一：利用lastIndexOf和substring函数解决
	//substring(ind+1)，是从ind到末尾的子串
	//substring(0,ind)，是从0到ind-1的子串[0,ind)
	//注意用trim()去除子串前后的多余空格
	public String reverseWords(String s) {
		String rst = "";
		String tmp = s.trim();
		int ind = tmp.lastIndexOf(" ");
		while (ind > 0) {
			String sub = tmp.substring(ind+1);
			rst += sub + " ";
			tmp = tmp.substring(0, ind).trim();
			ind = tmp.lastIndexOf(" ");
		}
		rst += tmp;
		return rst;
	}
	//方法二：利用split函数解决，注意切割的时候，可能会产生空串""，注意判断
	public String reverseWords2(String s) {
		String rst = "";
		String[] tmp = s.split(" ");
		if (tmp.length == 0)
			return "";
		for (int i = tmp.length-1; i > 0; i--) {
			if (!"".equals(tmp[i]))
				rst += tmp[i].trim() + " ";
		}
		rst += tmp[0];
		return rst;
	}
	
	public static void main(String args[]) {
		Solution solution = new Solution();
		String s = "How are   you?   ";
		String s1 = " ";
		System.out.println(solution.reverseWords(s1));
//		System.out.println("abc");
	}
}
