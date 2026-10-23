import java.util.Scanner;

public class Class {
     public static void main(String[] args){  //allow us to type
Scanner sc=new Scanner(System.in);      //accept and proceed

String name=sc.nextLine();       // take value from us
System.out.println(name);

//If else 
int age=sc.nextInt();
if(age>=18){
System.out.println("you are eligible");//println takes us to nextline
}
else{
System.out.println("not elegible");
}
}}
