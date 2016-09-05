public class Solution {
	public int majorityNumber(ArrayList<Integer> nums) {
		int count = 0;
		int major = nums.get(0);
		for (int i = 0; i < nums.size(); i++) {
			if (major == nums.get(i)) {
				count++;
			} 
			else {
				count--;
			}
			if (count == 0) {
				major = nums.get(i);
				count++;
			}
		}
		return major;
	}
	
	public static void main(String args[]) {
		Solution solution = new Solution();
		ArrayList<Integer> tmp = new ArrayList<>();
		tmp.add(1);
		tmp.add(1);
		tmp.add(1);
		tmp.add(1);
		tmp.add(2);
		tmp.add(2);
		tmp.add(2);
		System.out.println(solution.majorityNumber(tmp));
	}
}
