public class Problem_27 {
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;

        Solution solution = new Solution();
        int k = solution.removeElement(nums, val);

        System.out.println("Length of array after removal: " + k);
        System.out.print("Array after removing elements: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}

// Your Solution class
class Solution {
    public int removeElement(int[] nums, int val) {
        
        

        return 0;
    }
}
