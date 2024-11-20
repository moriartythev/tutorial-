import java.util.*;
public class tut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n1");
        int n1 = sc.nextInt();
        System.out.println("enter n2");
        int n2 = sc.nextInt();
        System.out.println("enter operator");
        char operator= sc.next().charAt(0);
        double result=01;
switch (operator){
    case '+':
        result = n1+n2;
    break;
    case '-':
        result= n1-n2;
    break;
    case '*':
        result=n1*n2;
    break;
    case '/':
        result =n1/n2;
    break;
    default:   System.out.println("eroor");


}
        System.out.println(result);

    }
}