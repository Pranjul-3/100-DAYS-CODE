import java.util.*;

class Solution {
    int i, j;

    public int[] twoSum(int[] nums, int target) {

        for (i = 0; i < nums.length; i++) {
            for (j = (i + 1); j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };

                }
            }
        }
        return new int[] { -1, -1 };

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution solution = new Solution();
        System.out.println("Enter the size of arary :");
        int s = sc.nextInt();
        int z[] = new int[s];
        for (int i = 0; i < s; i++) {
            z[i] = sc.nextInt();
        }
        System.out.println("Enter the target no :");
        int t = sc.nextInt();
        int x[] = solution.twoSum(z, t);

        if (x[0] != -1) {
            System.out.println("Indices of the two numbers that add up to the target: " + x[0] + ", " + x[1]);
        } else {
            System.out.println("No solution found.");
        }

    }
}
