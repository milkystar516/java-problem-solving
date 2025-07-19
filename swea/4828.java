import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int T = sc.nextInt();
      T++;
        for (int tc=1; tc<T; tc++) {
          int N = sc.nextInt();
          int firstNum = sc.nextInt();
          int minVal = firstNum;
          int maxVal = firstNum;

          for (int i=1; i<N; i++) {
            int nowVal = sc.nextInt();
            if (nowVal > maxVal) {
              maxVal = nowVal;
            }
            if (nowVal < minVal) {
              minVal = nowVal;
            }
          }
          System.out.println(String.format("#%d %d", tc, maxVal-minVal));
        }
      sc.close();
    }
}
