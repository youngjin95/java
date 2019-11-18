//백준 알고리즘 10809
package java;

import java.util.Scanner;

public class Alpha {
       public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);
             String input = sc.next();
             
             for (char c = 'a' ; c <= 'z' ; c++)
                    System.out.print(input.indexOf(c) + " ");
       }
}