import java.util.Scanner;
public class TaskThree{
public static void main(String[]args){
Scanner input=new Scanner (System.in);
int sum = 0;
int counter = 0;
for (int count =1; count<=10 ; count++){
  System.out.print("Enter number: ");
   int number= input.nextInt();
   sum += number;
   counter += 1;

}
int average = sum / counter;
System.out.println("Average is " + average);
System.out.println(" sum is " + sum);
}
}
