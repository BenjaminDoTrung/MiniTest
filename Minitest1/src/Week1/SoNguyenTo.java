package Week1;

import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số nguyên N");
        int n = scanner.nextInt();
            int number = 2;
            while (number < n) {
                boolean check = false;
                for (int i = 2; i < number ; i++) {
                    if (number % i == 0){
                        check = true;
                    }

                }
                if (!check) {
                    System.out.println(number);
                }
                number++;
            }
    }
}
