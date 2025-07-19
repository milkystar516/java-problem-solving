import java.util.Scanner;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String res = "";
        
        for(int i=1; i<=n; i++) {
            String number = Integer.toString(i);
            int cnt = 0;

            for(int j=0; j<number.length(); j++) {
                if (number.charAt(j) == "3" || number.charAt(j) == "6" || number.charAt(j) == "9") {
                    cnt = cnt + 1;
                }
            }

            if (cnt == 0) {
                res = res + "number" + " ";
            } else {
                res = res + String.join("", Collections.nCopies(number.length(), "-"))
            }
        }

        System.out.println(res);
    }
}
