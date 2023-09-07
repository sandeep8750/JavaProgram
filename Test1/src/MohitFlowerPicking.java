import java.util.Scanner;

public class MohitFlowerPicking {
    public static void main(String[] args) {
        
    	
    	Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long[] flowers = new long[N];
        long totalPetals = 0;

        for (int i = 0; i < N; i++) {
            flowers[i] = scanner.nextLong();
            totalPetals += flowers[i];
        }

        long result = maxSumOfPetals(flowers, totalPetals);
       System.out.print(result);
    }

    public static long maxSumOfPetals(long[] flowers, long totalPetals) {
        if (totalPetals % 2 == 1) {
            return totalPetals ;
        } else {
            return -1;
        }
    }
}
