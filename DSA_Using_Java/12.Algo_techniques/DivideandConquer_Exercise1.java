class Tester {

	public static int[] getMaxMin(int arr[], int low, int high) {
		int[] result = new int[2]; // result[0] = max, result[1] = min

		// If only one element
		if (low == high) {
			result[0] = arr[low]; // max
			result[1] = arr[low]; // min
			return result;
		}

		// If two elements
		if (high == low + 1) {
			if (arr[low] > arr[high]) {
				result[0] = arr[low];
				result[1] = arr[high];
			} else {
				result[0] = arr[high];
				result[1] = arr[low];
			}
			return result;
		}

		// More than two elements
		int mid = (low + high) / 2;
		int[] left = getMaxMin(arr, low, mid);
		int[] right = getMaxMin(arr, mid + 1, high);

		// Compare results
		result[0] = Math.max(left[0], right[0]); // max
		result[1] = Math.min(left[1], right[1]); // min

		return result;
	}

	public static void main(String args[]) {
		int arr[] = { 1000, 10, 5, 1, 2000 };

		int[] maxMin = getMaxMin(arr, 0, arr.length - 1);

		System.out.println("Minimum value is " + maxMin[1]);
		System.out.println("Maximum value is " + maxMin[0]);
	}
}
