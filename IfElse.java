// input an age, and show "is he adult or not?"

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args){
        //input 
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        if(num>=18) {
            System.out.println("Adult");
        } else {
            System.out.println("Not Adult");
        }
    }
}
