class Tester {
    
    public static int searchEmployeeId(int[] employeeIds, int employeeIdToBeSearched) {
        int iterations = 0;
        for (int i = 0; i < employeeIds.length; i++) {
            iterations++;
            if (employeeIds[i] == employeeIdToBeSearched) {
                return iterations;
            }
        }
        return -1;
    }

    public static void main(String a[]) {
        int[] employeeIds = { 8011, 8012, 8015, 8016, 8020, 8022, 8025 };
        int employeeIdToBeSearched = 8022;

        int numberOfIterations = searchEmployeeId(employeeIds, employeeIdToBeSearched);

        if (numberOfIterations == -1)
            System.out.println("Employee Id " + employeeIdToBeSearched + " is not found!");
        else
            System.out.println("Employee Id " + employeeIdToBeSearched + " is found! Number of iterations : " + numberOfIterations);
    }
}
