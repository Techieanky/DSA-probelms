public class FindNumberswithEven {

    public static void main(String[] args) {

        int[] nums = {12, 345, 2, 6, 7896};

        int ans = findNumbers(nums);
        System.out.println("Number Of Even :"+ans);
    }


        static int findNumbers ( int[] nums){
            int count = 0;
            String digit = "";
            int len = 0;
            for (int i = 0; i < nums.length; i++) {

                digit = String.valueOf(nums[i]);
                len = digit.length();
                if (len % 2 == 0) {
                    count++;
                }
            }
            return count;
        }
    }

