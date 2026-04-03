public testestestest {
    public static void main(String[] args) {
        Algorithm_V1 algorithm = new Algorithm_V1(new int[]{1, 2, 3, 4, 5});
        int[] sumResult = algorithm.sum(new int[]{1, 2, 3});
        int maxResult = algorithm.max(new int[]{1, 2, 3});
        int minResult = algorithm.min(new int[]{1, 2, 3});

        // Print results
        System.out.println("Sum: " + java.util.Arrays.toString(sumResult));
        System.out.println("Max: " + maxResult);
        System.out.println("Min: " + minResult);
    }
}