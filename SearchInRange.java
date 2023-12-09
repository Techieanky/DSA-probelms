//Q. Find the elements if present in  range
public class SearchInRange {

    public static void main(String[] args) {

        int start = 4;
        int end = 10;
        int target = 14;
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 14, 23, 34, 45, 46, 48, 67, 56, 78, 88, 90};
        boolean ans = RangeSearch(arr, target, start, end);
        System.out.println(ans);
    }

    static boolean RangeSearch(int[] arr, int target, int start, int end) {
        if (arr.length == 0) return false;

        for (int i = start; i < end; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;

    }
}
