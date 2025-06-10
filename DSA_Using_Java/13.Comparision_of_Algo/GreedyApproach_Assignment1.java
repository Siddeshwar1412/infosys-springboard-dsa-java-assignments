class Tester {

    public static int findSwapCount(String inputString) {
        int leftCount = 0;   // count of '('
        int rightCount = 0;  // count of ')'
        int swap = 0;        // total swaps needed
        int imbalance = 0;   // number of unmatched ')'

        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);

            if (ch == '(') {
                leftCount++;
                if (imbalance > 0) {
                    swap += imbalance;
                    imbalance--;
                }
            } else { // ch == ')'
                rightCount++;
                imbalance = rightCount - leftCount;
            }
        }

        return swap;
    }

    public static void main(String args[]) {
        String inputString = "())()("; 
        System.out.println("Number of swaps: " + findSwapCount(inputString));
    }
}
