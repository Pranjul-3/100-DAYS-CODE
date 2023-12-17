import java.util.Arrays;

public class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;

        int[] a = new int[n * n];
        int[] b = new int[2];
        int k = 0;

        // Flatten the 2D grid into a 1D array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[k++] = grid[i][j];
            }
        }

        Arrays.sort(a);

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] == a[i + 1]) {
                b[0] = a[i];
            }
        }

        // Find the missing number
        for (int i = 1; i <= n * n; i++) {
            if (Arrays.binarySearch(a, i) < 0) {
                b[1] = i;
                break;
            }
        }

        return b;
    }
}
