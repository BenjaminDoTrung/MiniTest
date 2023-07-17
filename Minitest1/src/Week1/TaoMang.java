package Week1;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class TaoMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập giá trị cho mảng:");
        int x = scanner.nextInt();;
        int[] arr = new int [x];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập giá trị thứ: " + (i + 1));
            arr[i] = scanner.nextInt();
        }
        System.out.println("arr = " + Arrays.toString(arr));
    }
}
