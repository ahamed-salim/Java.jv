import java.util.Scanner;

public class switchCase {
    public static void main(String[] args){
        //input 
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        switch (button) {
            case 1 : System.out.println("Hi");
            break;
            case 2 : System.out.println("Hello");
            break;
            case 3 : System.out.println("How r u?");
            break;
            default : System.out.println("Invalid");
        }
    }
}
