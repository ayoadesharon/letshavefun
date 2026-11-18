import java.util.Scanner;
public class TaskFour{
public static void main(String[]args){
Scanner input=new Scanner (System.in);
int sum = 0;
int counter = 0;
for (int count =1; count<=10 ; count++){
  System.out.print("Enter number: ");
   int number= input.nextInt();
  if (count%2==0){
  sum += number;}
   counter += 1;

}

System.out.println("sum:" + sum);
}
}
