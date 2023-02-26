package OtherQues;//Given an array of even numbers sorted in ascending order and an integer k,
//Find the k^th missing even number from provided array
//Input a[] ={0, 2, 6, 18, 22} k=6
//Output: 16 examples:
//Explanation: Missing even numbers on the list are 4, 8, 10, 12, 14, 16, 20
//and so on and kth missing number is on 6th place of the list i.e. 16

public class Que8b {
    // Method to find the kth missing even number
    public static int findKthMissingEvenNumber(int[] a, int k) {
        // Initializing two variables
        int currentMissingNumber = a[0]; // first missing even number to consider
        int countMissing = 0; // number of missing even numbers found so far

        // Loop through the elements of the input array
        for (int i = 1; i < a.length; i++) {
            // While loop to check for missing even numbers between the current element and the next element
            while (currentMissingNumber + 2 < a[i]) {
                currentMissingNumber += 2; // update current missing number
                countMissing++; // increment number of missing even numbers found
                if (countMissing == k) { // return current missing number if it's the kth missing even number
                    return currentMissingNumber;
                }
            }
            currentMissingNumber = a[i]; // update current missing number to the current array element
        }

        // To find remaining missing even numbers after the end of the input array
        while (countMissing < k) {
            currentMissingNumber += 2; // update current missing number
            countMissing++; // increment number of missing even numbers found
            if (countMissing == k) { // return current missing number if it's the kth missing even number
                return currentMissingNumber;
            }
        }

        // Return -1 if there are not enough missing even numbers
        return -1;
    }

    // OtherQues.Main method to print the kth missing even number
    public static void main(String[] args) {
        int[] a = {0, 2, 6, 18, 22};
        int k = 6;
        int result = findKthMissingEvenNumber(a, k);
        System.out.println("The " + k + "th missing even number is: " + result);
    }
}

