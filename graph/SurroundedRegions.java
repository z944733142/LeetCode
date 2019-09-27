package algorithms.graph;

/**
 * 给定一个二维的矩阵，包含 'X' 和 'O'（字母 O）。
 *
 * 找到所有被 'X' 围绕的区域，并将这些区域里所有的 'O' 用 'X' 填充。
 *
 * 示例:
 *
 * X X X X
 * X O O X
 * X X O X
 * X O X X
 * 运行你的函数后，矩阵变为：
 *
 * X X X X
 * X X X X
 * X X X X
 * X O X X
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/surrounded-regions
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author: shuo
 * @date: 2019/09/27
 */
public class SurroundedRegions {

    private char[][] board;
    public void solve(char[][] board) {
        this.board = board;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if(i == 0 || i == board.length - 1 || j == 0 || j == board[0].length - 1)
                {
                    DFS(i, j);
                }
            }
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {

            if(board[i][j] == 'O')
            {
                board[i][j] = 'X';
            }else if(board[i][j] == '#' )
            {
                board[i][j] = 'O';
            }
            }
        }
    }

    private void DFS(int x, int y)
    {
        if(x >= board.length || x < 0 || y < 0 || y >= board[0].length || board[x][y] != 'O')
        {
            return;
        }
        board[x][y] = '#';
        DFS(x + 1, y);
        DFS(x, y + 1);
        DFS(x - 1, y);
        DFS(x, y - 1);
    }
}
