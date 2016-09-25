public class Solution {
	
	public int lengthOfLongestSubstring(String s) {
		int len = 0;
		for (int i = 0; i < s.length(); i++) {
			Set<Character> set = new HashSet<Character>();
			int j = i; //注意j定义在外面
			for (; j < s.length(); j++) {
				set.add(s.charAt(j));
				if (set.size() != j-i+1) //这里是!=或者<都可以
					break;
			}
			if (len < set.size())
				len = set.size();
		}
		return len;
	}
	
	
	public static void main(String args[]) {
		Solution solution = new Solution();
		String string = "abcabcbb";
//		System.out.println(solution.lengthOfLongestSubstring(string));
		System.out.println(solution.lengthOfLongestSubstring("an++--viaj"));
	}
}
