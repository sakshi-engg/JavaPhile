import java.util.Arrays;
public class SubArrays {
    public static void subArray(int arr[]) {
        int totalSubArrays = 0;
        int sum = 0;
        int minSum = Integer.MAX_VALUE;
        int maxSum = Integer.MIN_VALUE;
        int[] minSubArray = null;
        int[] maxSubArray = null;

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                System.out.print("   [");
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.print("]");
                sum += arr[j];
                System.out.print(" Sum: " + sum);

                // Check for minimum subarray
                if (sum < minSum) {
                    minSum = sum;
                    minSubArray = Arrays.copyOfRange(arr, start, end + 1);
                }

                // Check for maximum subarray
                if (sum > maxSum) {
                    maxSum = sum;
                    maxSubArray = Arrays.copyOfRange(arr, start, end + 1);
                }

                totalSubArrays++;
                System.out.println();
            }
            sum = 0;
            
        }
            System.out.print("Min Sum: " + minSum + " Max Sum: " + maxSum);
            System.out.print("   Min Subarray: " + Arrays.toString(minSubArray));
            System.out.print("     Max Subarray: " + Arrays.toString(maxSubArray));
            System.out.println();
            System.out.println("Total Sub Arrays: " + totalSubArrays);
    }

    public static void main(String[] args) {
        int array[] = {2, 4, 6, 8, 10};
        subArray(array);
    }
}
