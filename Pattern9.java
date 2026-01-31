// print the pattern
/* 
    1
    0 1
    1 0 1
    0 1 0 1
    1 0 1 0 1
*/

public class Pattern9 {
    public static void main(String[] args) {
        int n = 5;

        //outer loop
        for(int i=1; i<=n; i++){
            // inner loop
            for(int j=1; j<=i; j++){
                int sum = i+j;
                // condition
                if(sum % 2 == 0){
                    System.out.print("1 ");
                }else{ 
                    System.out.print("0 ");
                }
            }
            //new line after each row
            System.out.println();
        }
    }
}
