public class Arr_Search {

public static void subarrays(int num2[]) {
            int ts=0;
            for (int i=0;i<num2.length;i++){
                int start=i;
                for(int j=i;j<num2.length;j++){
                    int end=j;
                    for(int k=start;k<=end ;k++){
                        System.out.print(num2[k]+" ");  
                    }
                    ts++;
                    System.out.println();
                }System.out.println();
            }
            System.out.println("TOTAL SUB ARRAY : "+ts);
            
        }

public static void main(String[] args) {

        int num2[]={2,4,6,8,10};
        subarrays(num2);
    }
    


}
