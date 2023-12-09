//Q. Find Maximum in a 2dArrays

public class MaxIn2DArrays {
    public static void main(String[] args) {
        int[][] arr = {{23, 4, 1},
                {18, 12, 3, 9},
                {77, 34, 32, 545},
                {1, 3}
        };

        int ans = maxIn2dArrays(arr);
        System.out.println(ans);
    }

    private static int maxIn2dArrays(int[][] arr) {

        int max=Integer.MIN_VALUE;

        for (int[] ints : arr) {
            {
                for (int anInt : ints) {


                    if (anInt > max) {
                        max = anInt;
                    }

                }
            }

        }
        return max;
    }


}
