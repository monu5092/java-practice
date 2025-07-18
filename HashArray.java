import java.util.*;

class HashArray
{

    public int[] findMissingRepeatingNumbers(int[] nums) {
        int n = nums.length;
        int[] hash = new int[n + 1];

        for (int i = 0; i < n; i++) {
            hash[nums[i]]++;
        }

        int repeating = -1;
        int missing = -1;

        for (int i = 1; i <= n; i++) {
            if (hash[i] == 2) {
                repeating = i;
            } else if (hash[i] == 0) {
                missing = i;
            }
            if (repeating != -1 && missing != -1) {
                break;
            }
        }
        return new int[]{repeating, missing};
    }

    public static void main(String[] args) 
	{
        Solution sol = new Solution();

  
        int[] nums = {3, 1, 2, 5, 3};

        int[] result = sol.findMissingRepeatingNumbers(nums);
        System.out.println("Repeating Number: " + result[0]);
        System.out.println("Missing Number: " + result[1]);
    }
}
