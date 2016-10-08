public class Solution {
	
	public String longestCommonPrefix(String[] strs) {
		if (strs == null || strs.length == 0)
			return "";
		if (strs.length == 1)
			return strs[0];
		StringBuilder ret = new StringBuilder();
		int ix = 0;
		while (true) {
			boolean flag = true;   //标记是否是公共前缀
			boolean oob = false; //标记下标是否越界
			for (int i = 0; i < strs.length-1; i++) {
				if (ix >= strs[i].length() || ix >= strs[i+1].length()) {
					oob = true;
					break;
				}
				if (strs[i].charAt(ix) != strs[i+1].charAt(ix)) {
					flag = false;
					break;
				}
			}
			if (oob || !flag)
				break;
			ret.append(strs[0].charAt(ix));
			ix++;
		}
		return ret.toString();
	}
	
	
	public static void main(String args[]) {
		Solution solution = new Solution();
		String[] strings = {"ABCDEFG", "ABCEGF", "ABCEFA"};
		String[] strings2 = {"A", "A"};
		System.out.println(solution.longestCommonPrefix(strings));
//		System.out.println(solution.longestCommonPrefix(strings2));
	}
}
