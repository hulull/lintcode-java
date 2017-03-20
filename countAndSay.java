public class Solution {

	public String countAndSay(int n) {
		String seq = "1";
		while (--n > 0) {
			seq = say(seq);
		}
		return seq;
	}
	
	public String say(String preSeq) {
		String nextSeq = "";
		int i = 0;
		int count = 1;
		while (i < preSeq.length()) {
			if (i+1 < preSeq.length()) {
				if (preSeq.charAt(i) == preSeq.charAt(i+1)) {
					count++;
				} 
				else {
					if (count != 1) {
						nextSeq = nextSeq + String.valueOf(count) + preSeq.charAt(i);
						count = 1; //重置count
					}
					else 
						nextSeq = nextSeq + "1" + preSeq.charAt(i);
				}
				i++;
			} 
			else {
				if (count != 1) {
					nextSeq = nextSeq + String.valueOf(count) + preSeq.charAt(i);
					count = 1; //重置count
				}
				else 
					nextSeq = nextSeq + "1" + preSeq.charAt(i);
				i++;
			}
		}
		return nextSeq;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.countAndSay(6));
//		s.say("111221");
	}
}
