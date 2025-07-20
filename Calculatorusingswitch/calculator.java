import java.util.Scanner;
public class conditial {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number a");
        int a=sc.nextInt();
        sc.nextLine();
        System.out.println("enter number b");
        int b=sc.nextInt();
        sc.nextLine();
        System.out.println("Choose an operation:");
        System.out.println("1 : Addition (+)");
        System.out.println("2 : Subtraction (-)");
        System.out.println("3 : Multiplication (*)");
        System.out.println("4 : Division (/)");
        System.out.println("5 : Modulo (%)");

        int choice= sc.nextInt();
        double result;
        switch (choice){
            case 1:
                result = a+b;
                System.out.println("result is "+result);
                break;

            case 2:
                result = a-b;
                System.out.println("result is "+result);
break;
            case 3:
                result = a*b;
                System.out.println("result is "+result);
                break;

            case 4:
                result = a/b;
                System.out.println("result is "+result);
                break;

            case 5:
                result = a%b;
                System.out.println("result is "+result);
                break;
            default:
                System.out.println("invalid operation");
                break;
        }
        sc.close();
    }
}
