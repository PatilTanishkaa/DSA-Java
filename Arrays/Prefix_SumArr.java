public class Arrays2 {
//OWN
//------------prefix array---------------
    public static int[] prefixarray(int num[]) {
        int psum=0;
        int pre_arr[]=new int[num.length];//prefix array 
        for (int i=0;i<num.length;i++){ //traverse in num array //i=index
            psum+=num[i];           //storing sum upto i^th elem of num in var psum
            pre_arr[i]=psum;            //storing sum upto i^th to prearry i
        }

        //Display Prefix Sum array
        System.out.println("Prefix Sum Array :");
        for(int i=0;i<num.length;i++){
                 System.out.print(pre_arr[i]+" ");}

                 return pre_arr;
    }
 public static void main(String[] args) {
        int num[]={1,-2,6,-1,3};
        prefixarray(num);
}}
