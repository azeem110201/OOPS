import java.util.*;

class KISS{
    public static int[] sort(int[] nums){
        for(int i = 0; i < nums.length - 1; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] > nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{99,87,45,65,102,56,102,120,187,65,18};
        //nums = sort(nums);
        Arrays.sort(nums);
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }
}