package CodeSoft;
import java.util.Scanner;
// Student grade calculator

public class Task2{
public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter marks in Python : ");
    int py = sc.nextInt();
    System.out.print("Enter marks in Java : ");
    int java = sc.nextInt();
    System.out.print("Enter marks in C : ");
    int c = sc.nextInt();
    System.out.print("Enter marks in C++ : ");
    int C = sc.nextInt();
    System.out.print("Enter marks in JavaScript : ");
    int js = sc.nextInt();

    int sum = py + java + c + C +js;
    int percentage = sum / 5;
    
    if(percentage<30){
        System.out.println("fail");
    }
    else if(percentage>=30 && percentage < 50){
        System.out.println("D grade");
    }
    else if(percentage >= 50 && percentage < 65){
        System.out.println("C grade");
    }
    else if(percentage >= 65 && percentage < 80){
        System.out.println("B grade");
    }
    else if(percentage >= 80 && percentage < 100){
        System.out.println("A grade");
    }
    
    System.out.println("Marks Obtained : " + sum);
    System.out.println("Percentage : " + percentage + "%");

    sc.close();
    
}
}