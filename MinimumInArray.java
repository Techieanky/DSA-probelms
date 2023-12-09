//Q. find minimum number in array
public class MinimumInArray {

    public static void main(String[] args) {

        int[] arr = {1, 3, 4, 6, 7, -9, 5, 3, 5, -56, 98, 56, 34, 35, 45, 57, 65};
        int min = minimumNum(arr);
        System.out.println("minimum Number in array: "+min);
    }

    //assume array can not be zero
    private static int minimumNum(int[] arr) {
        int ans = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < ans) ans = arr[i];
        }
        return ans;
    }
}
