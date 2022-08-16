public class randomArray {
    //int[] arr = generateRandomArray(30);

    public static int[] generateRandomArray(int numberOfDays) {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[numberOfDays];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}