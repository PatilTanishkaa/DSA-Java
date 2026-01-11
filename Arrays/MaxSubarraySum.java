import java.util.Scanner;

// Problem: Linear Search in an Array
// Time Complexity: O(n)
// Space Complexity: O(1)

public class LinearSearch {

    // Linear Search Function
    public static int linearSearch(int nums[], int key) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key) {
                return i;
            }
        }
        return -1;
    }

    // Main Method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nums[] = new int[5];

        System.out.println("Enter 5 elements:");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter key to search: ");
        int key = sc.nextInt();

        int index = linearSearch(nums, key);

        if (index == -1) {
            System.out.println("Key not found");
        } else {
            System.out.println("Key found at index: " + index);
        }

        sc.close();
    }
}
