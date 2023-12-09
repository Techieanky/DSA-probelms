//Q.Search in 2D Array.

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {{23, 4, 1},
                {18, 12, 3, 9},
                {77, 34, 32, 45},
                {1, 3}
        };
        int target = 32;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {

            for (int col = 0; col < arr[row].length; col++) {

                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }

        }
        return new int[]{-1, -1};
    } //Time Complexity: O (row * col)
    //Auxiliary Space: O(1)
}
