package algorithms.map;

import java.util.HashMap;
import java.util.Map;

/*
判断一个 9x9 的数独是否有效。只需要根据以下规则，验证已经填入的数字是否有效即可。

数字 1-9 在每一行只能出现一次。
数字 1-9 在每一列只能出现一次。
数字 1-9 在每一个以粗实线分隔的 3x3 宫内只能出现一次。
示例 1:

输入:
[
  ["5","3",".",".","7",".",".",".","."],
  ["6",".",".","1","9","5",".",".","."],
  [".","9","8",".",".",".",".","6","."],
  ["8",".",".",".","6",".",".",".","3"],
  ["4",".",".","8",".","3",".",".","1"],
  ["7",".",".",".","2",".",".",".","6"],
  [".","6",".",".",".",".","2","8","."],
  [".",".",".","4","1","9",".",".","5"],
  [".",".",".",".","8",".",".","7","9"]
]
输出: true
 */
public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Integer> rows[] = new HashMap[9];
        Map<Integer, Integer> columns[] = new HashMap[9];
        Map<Integer, Integer> box[] = new HashMap[9];
        for (int i = 0; i < 9; i++) {
            rows[i] = new HashMap<>();
            columns[i] = new HashMap<>();
            box[i] = new HashMap<>();
        }
        for(int i = 0; i < 9; i++)
        {
            for (int j = 0; j < 9; j++) {
                int boxIndex = (i / 3) * 3 + (j / 3);
                char c = board[i][j];
                if(c == '.')
                {
                    continue;
                }
                Integer num = new Integer(c);
                rows[i].put(num, rows[i].getOrDefault(num, 0) + 1);
                columns[j].put(num, columns[j].getOrDefault(num, 0) + 1);
                box[boxIndex].put(num, box[boxIndex].getOrDefault(num, 0) + 1);

                if(rows[i].get(num) > 1 || columns[j].get(num) > 1 || box[boxIndex].get(num) > 1)
                {
                    return false;
                }
            }
        }
        return true;
    }
}
