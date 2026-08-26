import java.util.Arrays;

public class Solution {

    public static void moveZeroes(int[] nums) {

        int index = 0;

        // Move non-zero elements to the front
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }

        // Fill the remaining positions with zeros
        while (index < nums.length) {
            nums[index] = 0;
            index++;
        }
    }

    public static void main(String[] args) {

        int[] nums = {0, 1, 0, 3, 12};

        moveZeroes(nums);

        System.out.println(Arrays.toString(nums));
    }
}

Output:
nums = [0,1,0,3,12]
[1,3,12,0,0]
