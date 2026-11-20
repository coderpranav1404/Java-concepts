import java.util.*; //package
public class  rd {
    
    public static void main(String[] args){  
    // solid reactangle.
    int n=4;int m=5;
    for(int i=1;i<=n;i++){
     for(int j=1;j<=m;j++){
    System.out.print("*");
     }System.out.println();
    }
    
    //Hollow Pattern

    for(int i=1;i<=n;i++){
        for(int j=1;j<=m;j++){
        //(i,j)
        if(i==1||j==1||i==n||j==m){
            System.out.print("*");
        }else{
            System.out.print(" ");
        }
        }System.out.println();}
        
    

    //inverted half pyramid
    for(int i=n;i>=1;i--){   //if you  want only half pyramid thenoly bring changes in outer loop i.e(i=1;i<=n;i++) baki as it is
        for(int j=1;j<=n;j++){
        System.out.print("*");
        }System.out.println();
        }
        //
        for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
        System.out.print(j);
        }
        }}}
        