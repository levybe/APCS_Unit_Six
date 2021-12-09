import java.util.Scanner;

public class Search {
    public static int search(int[] arr, int num) {
        int min = 0;
        int max = arr.length - 1;

        while (min <= max) {
            int mid = (min + max) / 2;
            if (arr[mid] == num) {
                return mid;
            }
            else if (arr[mid] > num) {
                max = mid - 1;
            }
            else {
                min = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many values would you like in your array?");
        int arrayLength = scan.nextInt();
        int[] arr = new int[arrayLength];

        for (int valuesIn = 0; valuesIn <= arrayLength; valuesIn++) {
            System.out.println("Enter a number you would like to add in your array. (" + valuesIn + " out of " + arrayLength + " values entered)");
            arr[valuesIn] = scan.nextInt();
            System.out.println("");

        }

        // I want to let the user create their own array, but I guess I could only let them create an array with a set
        // number of values right now...
        System.out.println("Enter the number you would like to try to find in the array.");
        int num = scan.nextInt();
        int result = search(arr, num);
        if (result == -1) {
            System.out.println("The number you searched for does not exist in the array.");
        }
        else {
            System.out.println("The index in the array of the number you searched for is " + result + ".");
        }
    }
}
