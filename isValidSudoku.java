public class Solution {
	public boolean isValidSudoku(char[][] board) {
		if (board.length != 9 || board[0].length != 9)
			return false;
		// 判断行元素是否重复
		for (int i = 0; i < 9; i++) {
			ArrayList<Character> sudoku = new ArrayList<Character>();
			for (int j = 0; j < 9; j++) {
				if (board[i][j] > 48 && board[i][j] < 58) {
					if (!sudoku.contains(board[i][j]))
						sudoku.add(board[i][j]);
					else
						return false;
				}
			}
		}
		// 判断列元素是否重复
		for (int i = 0; i < 9; i++) {
			ArrayList<Character> sudoku = new ArrayList<Character>();
			for (int j = 0; j < 9; j++) {
				if (board[j][i] > 48 && board[j][i] < 58) {
					if (!sudoku.contains(board[j][i]))
						sudoku.add(board[j][i]);
					else
						return false;
				}
			}
		}
		// 判断小九宫格是否重复
		for (int row = 0; row <= 6; row+=3) { // 这里是+3
			for (int col = 0; col <= 6; col+=3) { // 这里是+3
				ArrayList<Character> sudoku = new ArrayList<Character>();
				for (int i = row; i <= row+2; i++) {
					for (int j = col; j <= col+2; j++) {
						if (board[i][j] > 48 && board[i][j] < 58) {
							if (!sudoku.contains(board[i][j]))
								sudoku.add(board[i][j]);
							else {
								return false;
							}
						}
					}
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		char[][] test = {
				{'.', '.', '5', '.', '.', '.', '.', '.', '6'},
				{'.', '.', '.', '.', '1', '4', '.', '.', '.'},
				{'.', '.', '.', '.', '.', '.', '.', '.', '.'},
				{'.', '.', '.', '.', '.', '9', '2', '.', '.'},
				{'5', '.', '.', '.', '.', '2', '.', '.', '.'},
				{'.', '.', '.', '.', '.', '.', '.', '3', '.'},
				{'.', '.', '.', '5', '4', '.', '.', '.', '.'},
				{'3', '.', '.', '.', '.', '.', '4', '2', '.'},
				{'.', '.', '.', '2', '7', '.', '6', '.', '.'},
		};
		s.isValidSudoku(test);
	}
}
