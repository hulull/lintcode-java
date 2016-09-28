public class Solution {
    public String longestPalindrome(String s) {
    	StringBuilder tmp = new StringBuilder();
      int len = s.length();
      for (int i = len-1; i > -1; i--)
        tmp.append(s.charAt(i));
      String t = tmp.toString();
      int lenMax = 0;
      int ind = 0;
      int[][] lens = new int[len+1][len+1];
      for (int i = 1; i <= len; i++) {
        for (int j = 1; j <= len; j++) {
          char a = s.charAt(i-1);
          char b = t.charAt(j-1);
          if (a == b) {
            lens[i][j] = lens[i-1][j-1] + 1;
            if (lenMax < lens[i][j]) {
              lenMax = lens[i][j];
              ind = i-1;
            }
          }
          else
            lens[i][j] = 0;
        }
      }
      StringBuilder rst = new StringBuilder();
      for (int i = ind; i > ind-lenMax; i--) //ind是回文串最后一个元素的下标，回文串长度是lenMax
        rst.append(s.charAt(i));
      return rst.toString();
    }

	public static void main(String[] args) {
		String s = "abcdzdcab";
		new Solution().longestPalindrome(s);
	}
}
