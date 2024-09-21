//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите первое число:");
        float a=sc.nextFloat();
        System.out.println("Введите второе число:");
        float b=sc.nextFloat();
        System.out.println("Введите операцию(+,-,*,/)");
        char operation=sc.next().charAt(0);
        if(operation=='+'){
            float result=a+b;
            System.out.println("Result is "+result);
        }else if(operation=='-'){
            float result=a-b;
            System.out.println("Result is "+result);
        }else if(operation=='*'){
            float result=a*b;
            System.out.println("Result is "+result);
        }else if(operation=='/'){
            float result=a/b;
            System.out.println("Result is "+result);
        }
    }
}