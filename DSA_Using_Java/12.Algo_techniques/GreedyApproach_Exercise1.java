class Tester {

	public static int findMaxActivities(int start[], int finish[]) { 
        int n = start.length;
        if (n == 0) return 0;

        int count = 1; // Select the first activity
        int lastFinish = finish[0];

        for (int i = 1; i < n; i++) {
            if (start[i] >= lastFinish) {
                count++;
                lastFinish = finish[i];
            }
        }

        return count;
	} 
	       
	public static void main(String[] args) { 
        int start[] =  {1, 3, 0, 5, 8, 5}; 
    	int finish[] =  {2, 4, 6, 7, 9, 9};
    	    
    	System.out.println("Maximum number of activities: " + findMaxActivities(start, finish)); 
    }
}
