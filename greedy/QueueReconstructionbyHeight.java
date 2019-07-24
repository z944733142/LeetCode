package algorithms.greedy;

import java.util.*;

/**
 * 假设有打乱顺序的一群人站成一个队列。 每个人由一个整数对(h, k)表示，其中h是这个人的身高，k是排在这个人前面且身高大于或等于h的人数。 编写一个算法来重建这个队列。
 * <p>
 * 注意：
 * 总人数少于1100人。
 *
 * @author: shuo
 * @date: 2019/07/24
 */
public class QueueReconstructionbyHeight {
    public static void main(String[] args) {
        reconstructQueue(new int[][]{
                {7, 0},
                {4, 4},
                {7, 1},
                {5, 0},
                {6, 1},
                {5, 2},
        });
    }
    public static int[][] reconstructQueue(int[][] people) {
        Arrays.sort(
                people, new Comparator<int[]>() {
                    @Override
                    public int compare(int[] o1, int[] o2) {
                        return o1[0] == o2[0]? o1[1] - o2[1] : o1[0] - o2[0];
                    }
                }
        );
        List<int[]> list = new ArrayList(100);
        System.out.println(Arrays.toString(people));
        for (int[] person : people) {
            list.add(person[1], person);
        }

        return list.toArray(new int[people.length][]);
        }
    }
