package Algorithms;
/*
给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。

设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。

注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。

示例 1:

输入: [7,1,5,3,6,4]
输出: 7
解释: 在第 2 天（股票价格 = 1）的时候买入，在第 3 天（股票价格 = 5）的时候卖出, 这笔交易所能获得利润 = 5-1 = 4 。
     随后，在第 4 天（股票价格 = 3）的时候买入，在第 5 天（股票价格 = 6）的时候卖出, 这笔交易所能获得利润 = 6-3 = 3
 */
public class BestTimetoBuyandSellStockII {
    public static void main(String[] args) {
        maxProfit(new int[]{7,1,5,3,6,4});
    }
    public static int maxProfit(int[] prices) {
        int money = 0;
        int gain = 0;
        int k = 1;
        for (int i = 0, j; i < prices.length; i++) {
            if( (i - 1 < 0 || prices[i] <= prices[i - 1] ) && (i + 1 >= prices.length || prices[i] <= prices[i + 1]))
            {
                    if(money == 0)
                    {
                        k = 1;
                    }
                    else {
                        k = money / prices[i];
                        money = money - k * prices[i];
                    }
                for (j = i; j < prices.length; j++) {
                    if( (j - 1 >= 0 || prices[j] >= prices[j - 1] ) && (j + 1 >= prices.length || prices[j] >= prices[j + 1]))
                    {
                        money += prices[j] * k;
                        gain += (prices[j] - prices[i]) * k;
                        break;
                    }
                }
                i = j;
            }
        }
        return gain;
    }
}
