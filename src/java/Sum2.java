//¹®Á¦ 11022
package java;

import java.util.Scanner;

public class Sum2 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = Integer.parseInt(sc.nextLine());
        int i = 1;
        while (limit-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.printf("Case #%d: %d + %d = %d\n", i++ ,a,b, a + b);
        }
    }
}

