import java.util.*;
public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 5;
        int b = 4;
        int Button = sc.nextInt();

//        1 >> +
//        2 >> -
//        3 >> *
//        4 >> /
//        5 >> %

        switch(Button) {

            case 1: System.out.println(a+b);
            break;

            case 2:
                System.out.println(a-b);
                break;

            case 3:
                System.out.println(a*b);
                break;

            case 4:
                if(b == 0) {
                    System.out.println("Division is Invalid");
                }else{
                    System.out.println(a/b);
                }break;

            case 5:
                if(b == 0) {
                    System.out.println("Invalid Division");
                }else{
                    System.out.println(a%b);
                }break;

            default:
                System.out.println("Invalid Button");
        }


    }
}
