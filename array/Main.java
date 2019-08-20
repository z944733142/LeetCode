package algorithms.array;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int w[] = new int[n];
        int v[] = new int[n];
        for (int i = 0; i < n; i++) {
            w[i] = sc.nextInt();
        }
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            v[i] = sc.nextInt();
        }
        sc.nextLine();
        int m = sc.nextInt();
        int dp[][] = new int[n+1][m+1];
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(w[i-1] <= j){
                    if(dp[i-1][j] <dp[i-1][j-w[i-1]]+v[i-1]){
                        dp[i][j] = dp[i-1][j-w[i-1]]+v[i-1];
                    }else{
                        dp[i][j] = dp[i-1][j];
                    }

                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        System.out.println(dp[n][m]);
    }


}
