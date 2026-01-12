import java.util.Scanner;

public class Arrays {

    public static void MinMax(int nums[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largest) {
                largest = nums[i];
            }
            if (nums[i] < smallest) {
                smallest = nums[i];
            }
        }

        System.out.println("Largest in Array = " + largest);
        System.out.println("Smallest in Array = " + smallest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nums[] = new int[5];
        System.out.println("Enter 5 elements:");

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        MinMax(nums);
    }
}
