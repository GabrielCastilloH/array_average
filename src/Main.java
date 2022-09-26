public class Main {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 5, 8, 1000};
        int sum = 0;
        int average;

        for (int i = 0; i < myArray.length; i++) {
            sum += myArray[i];
        }

        average = sum/myArray.length;

        System.out.println("The average of the array is: " + average);
    }

}
