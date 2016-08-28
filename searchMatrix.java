 public boolean searchMatrix(int[][] matrix, int target) {
        // 二维数组求各维长度
    	if (matrix == null || matrix.length == 0)
    		return false;
    	int m = matrix.length;
    	int n = matrix[0].length;
    	
    	int x = 0;
    	int y = n-1;
    	while (x <= m-1 && y >=0) {
    		if (matrix[x][y] > target) {
    			y--;
    		} else if (matrix[x][y] < target) {
    			x++;
    		} else {
    			return true;
    		}
    	}
    	return false;
    }
