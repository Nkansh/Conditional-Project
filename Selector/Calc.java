//Author:Albert Nkansah 
//Conditional 
//Date: 27/01/21


import java.util.Scanner; //import the Scanner class 

class Operator{
//create the add,subtract, modulus operators with void return type
    void add(int x,int y){
        int ans = x+y;
        System.out.println("Answer "+ ans);

    }
    void sub(int x,int y){
        int ans = x-y;
        System.out.println("Answer "+ ans);

    }
    void  mod(int x,int y){
        int ans = x%y;
        System.out.println("Answer "+ ans);

    }
}






class Calc{
   
    public static void main(String[] args){

//Create an instance of the operator class 
    Operator opr = new Operator();
        
        
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
        opr.add(a,b);
    }
    else if(selector=='S'){
        opr.sub(a,b);
    }
    else if(selector == 'M'){
        opr.mod(a,b);
    }


    
   


    }
}