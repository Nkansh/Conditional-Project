//Author:Albert Nkansah 
//Conditional 
//Date: 27/01/21


import java.util.Scanner; //import the Scanner class 

class Operator{
//create the add,subtract, modulus operators with void return type
    public static void add(int x,int y){
        int ans = x+y;
        System.out.println("Answer "+ ans);

    }
    public static void sub(int x,int y){
        int ans = x-y;
        System.out.println("Answer "+ ans);

    }
    public static void  mod(int x,int y){
        int ans = x%y;
        System.out.println("Answer "+ ans);

    }
}






class Calc2 extends Operator{
   
    public static void main(String[] args){

//Create an instance of the operator class 
   
        
        
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter Value of x: ");
    int a = sc.nextInt();

    System.out.println("Enter Value of y: ");
    int b = sc.nextInt();


    System.out.println("Please select A for Addition");
    System.out.println("Please select S for Subtraction");
    System.out.println("Please select M for Modulus");

    char selector = sc.next().charAt(0);
     

    if(selector == 'A'){
        add(a,b);
    }
    else if(selector=='S'){
        sub(a,b);
    }
    else if(selector == 'M'){
        mod(a,b);
    }


    
   


    }
}