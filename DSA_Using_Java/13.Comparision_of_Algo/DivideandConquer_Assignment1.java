class Tester {

    public static int findMaxSum(int arr[], int low, int high) {
        if (low == high) {
            return arr[low];
        }

        int mid = (low + high) / 2;

        int leftSum = findMaxSum(arr, low, mid);
        int rightSum = findMaxSum(arr, mid + 1, high);
        int crossSum = findMaxCrossingSubarraySum(arr, low, mid, high);

        return Math.max(Math.max(leftSum, rightSum), crossSum);
    }

    public static int findMaxCrossingSubarraySum(int arr[], int low, int mid, int high) {
        int leftSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = mid; i >= low; i--) {
            sum += arr[i];
            if (sum > leftSum)
                leftSum = sum;
        }

        int rightSum = Integer.MIN_VALUE;
        sum = 0;
        for (int i = mid + 1; i <= high; i++) {
            sum += arr[i];
            if (sum > rightSum)
                rightSum = sum;
        }

        return leftSum + rightSum;
    }

    public static void main(String[] args) {
        int arr[] = { -2, -5, 6, -2, -3, 1, 5, -6 };
        System.out.println("Maximum sum: " + findMaxSum(arr, 0, arr.length - 1));
    }
}
