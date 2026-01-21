public class Arrays2 {

//---------------Kadanes--------------
        public static void Kadanes(int num2[]) {
            int cs=0;
            int max=Integer.MIN_VALUE;
            for (int i=0;i<num2.length;i++){
                // cs+=num2[i];
                // if (cs<0){//Fails for all-negative arrays
                //     cs=0;
                // }

                cs=Math.max(cs+num2[i],cs);
                max=Math.max(cs, max);
            }
            System.out.println("Our max subarray sum is: "+max);
        }
            
    public static void main(String[] args) {
        int num[]={1,-2,6,-1,3};
        prefixarray(num);
        Maxsubarrsum(prefixarray(num));
        maxsum_subarr(num);

        int num2[]={-2,-3,4,-1,-2,1,5,-3};
        Kadanes(num2);

    }
}

