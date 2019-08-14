package algorithms.graph;

/**
 * 给定一个二维网格和一个单词，找出该单词是否存在于网格中。
 * <p>
 * 单词必须按照字母顺序，通过相邻的单元格内的字母构成，其中“相邻”单元格是那些水平相邻或垂直相邻的单元格。同一个单元格内的字母不允许被重复使用。
 *
 * @author: shuo
 * @date: 2019/08/05
 */
public class WordSearch {
    public static void main(String[] args) {
        exist(new char[][]{
                {'A', 'A'},
        }, "AAA");
    }

    public static boolean exist(char[][] board, String word) {
        boolean[][] key = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (DFS(board, key, word, 0, i, j)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean DFS(char[][] board, boolean[][] key, String word, int index, int x, int y) {
        if (index == word.length()) {
            return true;
        }
        if (x < 0 || y < 0 || x >= board.length || y >= board[0].length || key[x][y] || board[x][y] != word.charAt(index)) {
            return false;
        }
        key[x][y] = true;
        System.out.println(" " + x + " " + y);
        if (DFS(board, key, word, index + 1, x + 1, y)
                || DFS(board, key, word, index + 1, x, y+ 1)
                    || DFS(board, key, word, index + 1, x, y)
                        || DFS(board, key, word, index + 1, x, y - 1) ) {
            return true;
        }
        key[x][y] = false;
        return false;
    }
}
