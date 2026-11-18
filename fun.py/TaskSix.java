import java.util.Scanner;
public class TaskOne{
public static void main(String[]args){
Scanner input=new Scanner (System.in);
int sum = 0;
int counter = 0;
for (int count =1; count<=10 ; count++){
  System.out.println("Enter number: ");
   int number= input.nextInt();
   if (count%2==0);
   sum += number;
   counter += 1;

}
int average = sum / counter;
System.out.println(" average is " + average;
}
}
