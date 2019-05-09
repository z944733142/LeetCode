package algorithms;

import java.util.Random;

public class ARandom {
    public static void main(String[] args) {
        Random random = new Random();
        for(int j = 0; true; j++){
            int c = random.nextInt(17000000);
            for (int i = 0; i < 5; i++) {
                if(i == c) {
                    System.out.println(j*10 + "i=" + i + "c=" + c);
                    break;
                }
            }
        }
    }
}
