public class Solution {
    public int maxPoints(Point[] points) {
		if (points == null)
			return 0;
		if (points.length <= 2)
			return points.length;
		HashMap<Double, Integer> ret = new HashMap<>();
		int res = 1;
		for (int i = 0; i < points.length; i++) {
			int dup = 0; // 记录重复点的个数
			ret.clear();
			for (int j = i+1; j < points.length; j++) {
				if (points[i].x == points[j].x && points[i].y == points[j].y) {
					dup++;
					continue;
				}
				// k是斜率
				double k = points[i].x == points[j].x ? Integer.MAX_VALUE : 
					(double)(points[i].y-points[j].y)/(double)(points[i].x-points[j].x); 
				if (ret.containsKey(k))
					ret.put(k, ret.get(k)+1);
				else
					ret.put(k, 2);
			}
			res = Math.max(dup+1, res); // 重复的点的个数加1是当前最大点数的初值（+1是因为要加上当前点）
			for (Integer elem : ret.values()) {
				if (elem + dup > res)
					res = elem + dup;
			}
		}
		return res;
    }
	
	
	public static void main(String args[]) {
		Solution solution = new Solution();
    // 测试用例
	}
}
