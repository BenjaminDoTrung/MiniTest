public class TongphanTuTrongMnag {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        System.out.println("Tổng giá trị mảng các số nguyên là: " + sum);
        int max = arr[0];
        for (int i = 1; i < arr.length; i++)
            if (max < arr[i]) {
                max = arr[i];
            }
        System.out.println("Giá trị lớn nhất trong mảng số nguyên là: " + max);
    }
}
