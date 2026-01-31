//input two numbers, and show which one is greater
//using if else condition in if else condition


import java.util.Scanner;

public class GreterSmaller {
    public static void main(String[] args){
        //input 
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
    
        if(a == b) {
            System.out.println("Equal");
        } else {
            if(a > b){
                System.out.println("a is greater");
            }
            else{
                System.out.println("b is greater");
            }
            
        }
    }
}
