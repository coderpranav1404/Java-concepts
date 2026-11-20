
import java.util.*;
public class fourth {
  
    
        //For void function dont call return if called then also correct only
    
    public static void printMyName(String name ){ //function created
     System.out.println(name);
    } 
                         
    ///
    public static int calSum(int a,int b){
        int Sum=a+b;
    return Sum;
    }
    
    //FACTORIAL
    public static void calFact(int n){
    if(n<0){        //optional staement just for good code
     System.out.println("Invalid no.");
    return;}
    int fact=1;
    for(int i=n;i>=1;i--){
    fact=fact*i;
    }System.out.println(fact);}
    
    //sum of odd no.
    public static  void calculatesum(int n ){
    int sum=0;
    for(int i=1;i<=n;i++){
    if(i%2!=0){
    sum=sum+i;
    }System.out.println(sum);}}
    
    
    
    
    public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    
    String name=sc.nextLine();
    printMyName(name);
    //
    int a=sc.nextInt();
    int b=sc.nextInt();
    int Sum=calSum(a,b);
    System.out.println(Sum);
    //
    int n=sc.nextInt();
     calFact(n);
    // 
    
     calculatesum(5);}}
    
     //for nested loops time=n*m
     //for simply 2 loops time=n+m
    
     //plz see diff between methods and functions
    



