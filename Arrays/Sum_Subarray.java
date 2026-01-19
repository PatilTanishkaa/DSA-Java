public class Sum_Subarray {

    public static void sum_subarr(int num2[]) {

        int maxsum = Integer.MIN_VALUE;

        for (int i = 0; i < num2.length; i++) {
            for (int j = i; j < num2.length; j++) {
                int sum = 0;

                for (int k = i; k <= j; k++) {
                    System.out.print(num2[k] + " ");
                    sum += num2[k];
                }

                System.out.println("\tSum of subarray: " + sum);

                if (sum > maxsum) {
                    maxsum = sum;
                }

                System.out.println("---------------------------");
            }
        }

        System.out.println("Max Sum of a subarray: " + maxsum);
    }

    public static void main(String[] args) {
        int num2[] = {2, 4, 6, 8, 10};
        sum_subarr(num2);
    }
}
