
import  java.util.Scanner;

public class UserInput {
    public static void main(String[] args){
        //input 
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        //nextLine() for input next word, if we use next() it's input single word
        //nextInt() for input multiple integer value
        //nextFloat() for input multiple float value

        System.out.println(name);
    }
}
