import java.util.Scanner;
import java.util.Arrays;
 
public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int T = sc.nextInt();
        for (int tc=1; tc<=T; tc++) {
          int N = sc.nextInt();
          int M = sc.nextInt();
          sc.nextLine();
          String line = sc.nextLine();
          int[] numbers = Arrays.stream(line.split(" ")).mapToInt(Integer::parseInt).toArray();
 
          int maxSum = 0;
 
          for (int i=0; i<M; i++) {
            maxSum += numbers[i];
          }
 
          int minSum = maxSum;
          int currentSum = maxSum;
 
          for (int j=1; j<=N-M; j++) {
            currentSum = currentSum-numbers[j-1]+numbers[j+M-1];
            maxSum = Math.max(maxSum, currentSum);
            minSum = Math.min(minSum, currentSum);
          }
          System.out.printf("#%d %d\n", tc, maxSum-minSum);
        }
      sc.close();
    }
}
