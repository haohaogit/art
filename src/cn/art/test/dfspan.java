package cn.art.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class dfspan {
	static boolean Result = false;
	static int n;
	static int p;
	static int pos[][] = null;

	public static void solveNQueens(int pos[][], int p) {
		solve(pos, 0, p);
	}

	public static void solve(int pos[][], int row, int p) {
		int n = pos[0].length;
		if (row == n) {
			if (p == n) {
				System.out.println("OK");
				Result = true;
				for (int i = 0; i < pos[0].length; i++) {

					System.out.println();
					for (int j = 0; j < pos[0].length; j++)
						System.out.print(pos[i][j]);

				}
			} else {
				solve_rest(pos, n - 1, p - n);
			}

		} else {
			for (int j = 0; j < n; j++) {
				if (IsOK(pos, row, j)) {
					pos[row][j] = 1;
					solve(pos, row + 1, p);
					pos[row][j] = 0;
				}
			}
		}
	}

	public static void solve_rest(int pos[][], int row, int count) {
		int n = pos.length;
		if (count-- == 0) {
			System.out.println("OK");
			Result = true;
			for (int i = 0; i < pos[0].length; i++) {
				System.out.println();
				for (int j = 0; j < pos[i].length; j++)
					System.out.print(pos[i][j]);

			}

		} else {
			for (int i = row; i >= 0; i--) {
				for (int j = n - 1; j >= 0; j--) {
					if (IsOK(pos, i, j)) {
						pos[i][j] = 1;
						solve_rest(pos, i - 1, count);
						pos[i][j] = 0;
					}
				}
			}
		}
	}

	public static boolean IsOK(int pos[][], int row, int col) {
		int n = pos.length;
		if (pos[row][col] == 2 || pos[row][col] == 1)
			return false;

		int flag = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < n; j++) {
				if (pos[i][j] == 1) {

					if (j == col) {
						for (int k = i + 1; k < row; k++) {
							if (pos[k][j] == 2) {
								flag = 1;
								break;
							}
						}
						if (flag == 1) {
							flag = 0;
							break;
						}
						return false;
					}
					if (Math.abs(i - row) == Math.abs(j - col)) {
						if (j > col) {
							for (int k = j - 1; k > col; k--) {
								if (pos[k][j] == 2) {
									flag = 1;
									break;
								}
							}
							if (flag == 1) {
								flag = 0;
								break;
							}
						} else {
							for (int k = j + 1; k < col; k++) {
								if (pos[k][j] == 2) {
									flag = 1;
									break;
								}
							}
							if (flag == 1) {
								flag = 0;
								break;
							}
						}
						return false;
					}
				}

			}
		}
		return true;

	}

	public static void main(String[] args) {
		try {

			File f = new File("C:\\Users\\Administrator\\Desktop\\input.txt");
			FileReader fileReader = new FileReader(f);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			StringBuffer stringBuffer = new StringBuffer();
			String line;
			int line_num = 0;

			while ((line = bufferedReader.readLine()) != null) {
				if (line_num == 0) {
					n = Integer.parseInt(line);
					pos = new int[n][n];

				}
				if (line_num == 1) {
					p = Integer.parseInt(line);
				}
				if (line_num > 1) {
					stringBuffer.append(line);
					// System.out.println(line);
				}
				line_num++;
			}

			// char[][] board = new char[n][n];
			int index = 0;
			while (index < stringBuffer.length()) {
				for (int i = 0; i < n; i++)
					for (int j = 0; j < n; j++) {
						pos[i][j] = Character.getNumericValue(stringBuffer.charAt(index));
						index++;
					}
			}

			fileReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		solveNQueens(pos, p);
		if (!Result)
			System.out.println("FALL");
	}

}
