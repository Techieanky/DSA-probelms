// Linear search or sequential search is a method for finding an element within a list.
// It sequentially checks each element of the list until a match is found or the whole list has been searched.
//Time complexity O(n)
//space O(1)
public class LinearSearch {
    public static void main(String[] args) {
               int[] arr = {1,2,3,4,55,6,7,5,15,-11,45,34,33};
                int target=150;
                 boolean ans = LinearSearchAlgo(arr,target);
                 System.out.println(ans);
    }

    static  Boolean LinearSearchAlgo(int[] arr, int target){
// if array size is zero its simply not element in array.
        if(arr.length==0)
        {
            return false;
        }
// Iterating over array and print true if found target
        for (int element : arr) {

            if (element == target) {
                return true;
            }
        }
        return false;
    }


}
