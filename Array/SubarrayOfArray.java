package Array;

public class SubarrayOfArray {
    public static void subarrays(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                for(int k = i;k<=j;k++){
                    System.out.print(nums[k]+" ");
                }
                System.out.println();
            }
        }
        
    }
    public static void main(String[] args) {
        int[] nums = {4,5,0,-2,-3,1};
        int k = 5;
        subarrays(nums);

    }
}
