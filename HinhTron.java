
package HinhTron;

import java.util.Scanner;


public class HinhTron {
    public static void main(String[] args) {
        float r;
        Scanner scan = new Scanner(System.in);
        r = scan.nextFloat();
        System.out.println("Ban kinh hinh tron la");
        System.out.println(r);
        System.out.printf("Dien tich hinh tron la: " + 3.14 * r * r);
    }
}
