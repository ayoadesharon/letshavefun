import java.util.Scanner;
public class TaskOne{
public static void main(String[]args){
Scanner input=new Scanner (System.in);
int sum = 0;
for (int count =1; count<=10 ; count++){
  System.out.print("Enter number: ");
   int number= input.nextInt();
   sum += number;

}
System.out.println("Sum is " + sum);
}
}
