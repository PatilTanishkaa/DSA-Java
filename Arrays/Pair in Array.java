public class Araay_Pairs{
public static void pairs(int num2[]) {
            int tp=0;
            for(int i=0;i<num2.length;i++){
                int curr=num2[i];
                for(int j=i+1;j<num2.length;j++){
                    System.out.print("("+curr+","+num2[j]+")");
                    tp++;
                }System.out.println();
            }
            System.out.println("Total pairs="+tp);
            
        }
    public static void main(String[] args) {
        int num2[]={2,4,6,8,10};
        pairs(num2);   
    }
}
