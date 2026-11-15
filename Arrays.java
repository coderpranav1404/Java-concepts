
    import java.util.*;

 class Arrays {
      //Arrays are called zero indexed as they start count from zero
        // Arrays denotion is []in java
        public static void main(String[] args){
            System.out.println("Array"); //timepass
        int[] marks=new int[3];     //type[] array name=new type[size];     //see you can put open brack after marks then also correct
     marks[0]=97;                   
     marks[1]=98;
     marks[2]=99;
     for(int i=0;i<3;i++){
        System.out.println(marks[i]);
     }
     //another best way to write array
    
    int Marks[]={97,98,99};
    for(int i=0;i<3;i++){
        System.out.println(Marks[i]);}
    } }
