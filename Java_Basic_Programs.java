import java.util.Scanner;



//Question 26
class Circle{
    
    private  int radius;
    private double PI = 3.14;
    
        void set_radius(int r){
            radius = r;
        }
        double get_circum(){
            double circum = 2*PI*radius;
            return circum;
        }
        double get_area(){
            double area = PI*radius*radius;
            return area;
        }
        
};



//Question 27

class Book{
    private String BookID;
    private int Pages;
    private double Price;

    Book(){
        this.BookID="";
        this.Pages=0;
        this.Price=0;
    }


    void get(String BookID,int Pages,double Price){
        this.BookID=BookID;
        this.Pages=Pages;
        this.Price=Price;
    }

    void show(){
        System.out.println(this.BookID);
        System.out.println(this.Pages);
        System.out.println(this.Price);
    }

    void set(String BookID,int Pages,double Price){
        this.BookID=BookID;
        this.Pages=Pages;
        this.Price=Price;
    }

    double getPrice(){
        double price=0;
        price=this.Price;
        return price;
    }




}



// Question 28

class Array {

    int StoredIntegers[]= new int[5];

    Array(){
        StoredIntegers[0]=0;
        StoredIntegers[1]=0;
        StoredIntegers[2]=0;
        StoredIntegers[3]=0;
        StoredIntegers[4]=0;
    }

    void fill(int a,int b ,int c,int d,int e){
        StoredIntegers[0]=a;
        StoredIntegers[1]=b;
        StoredIntegers[2]=c;
        StoredIntegers[3]=d;
        StoredIntegers[4]=e;
    }

    void Display(){
        for(int i=0;i<5;i++){
           System.out.println(StoredIntegers[i]);
        }
    }

    int Max(){      
        int i;
     
        int max = StoredIntegers[0];

        for (i = 1; i < StoredIntegers.length; i++)
            if (StoredIntegers[i] > max)
                max = StoredIntegers[i];
         
        return max;
    }

    int Min(){
    
        int min = StoredIntegers[0];  
       
        for (int i = 0; i < StoredIntegers.length; i++) {  
         
           if(StoredIntegers[i] <min)  
               min = StoredIntegers[i];  
        }  
    
        return min;
    }
    

    
}




// Question 28
public class Java_Basic_Programs {

   
public static void main(String[] args) 
{

//============================================//
//  Question 01
System.out.println("\n\n==========================");
System.out.println("Question 01:");
System.out.println("Write a program in Java to swap two numbers.\n");

int a=20;
int b=10;
System.out.println("Before Swapping :\nValue of a = "+a+"\nValue of b = "+b);
a = a + b;
b = a - b;
a = a - b;
System.out.println("After Swapping :\nValue of a = "+a+"\nValue of b = "+b);


//============================================//
//  Question 02
System.out.println("\n\n==========================");
System.out.println("Question 02:");
System.out.println("Write a program in Java to find the area and circumference of a circle.\n");


int radius = 3;
    //formula to calculate area of circle
    double area = Math.PI * (radius * radius);
    System.out.printf("Area is: %.2f", area);

    //formula to calculate circumference of circle
    double circumference= Math.PI * 2*radius;
    System.out.printf( "\nCircumference is: %.2f",circumference) ;


//============================================//
//  Question 03
System.out.println("\n\n==========================");
System.out.println("Question 03:");
System.out.println("Write a program in Java to convert temperature in Celsius to Fahrenheit.\n");

float Fahrenheit, Celsius;  
Celsius=223;
Fahrenheit =((Celsius*9)/5)+32;  
System.out.println("Temperature in Fahrenheit is: "+Fahrenheit); 


//============================================//
//  Question 04
System.out.println("\n\n==========================");
System.out.println("Question 04:");
System.out.println("Write a program in Java that converts kilometers per hour to miles per hour.\n");

double kilometers;

		System.out.println("Please enter kilometers per hours:");

		Scanner in1 = new Scanner(System.in);
		kilometers = in1.nextDouble();

		double miles = kilometers / 1.6;

		System.out.println(miles + " Miles/hr");


//============================================//
//  Question 05
System.out.println("\n\n==========================");
System.out.println("Question 05:");
System.out.println("Write a program that inputs the distance traveled and speed of vehicle. It calculates the time taken to reach its destination and print it\n");

System.out.print("Question 05");


//============================================//
//  Question 06
System.out.println("\n\n==========================");
System.out.println("Question 06:\n");
System.out.println("Write a program that inputs the distance traveled and speed of vehicle. It calculates the time taken to reach its destination and print it\n");


System.out.print("Question 06");


//============================================//
//  Question 07
System.out.println("\n\n==========================");
System.out.println("Question 07:\n");
System.out.println("Write a program that inputs the distance traveled and speed of vehicle. It calculates the time taken to reach its destination and print it\n");


System.out.print("Question 07");


//============================================//
//  Question 08
System.out.println("\n\n==========================");
System.out.println("Question 08:\n");
System.out.println("Write a program that inputs the distance traveled and speed of vehicle. It calculates the time taken to reach its destination and print it\n");

System.out.print("Question 08");


//============================================//
//  Question 19
System.out.println("\n\n==========================");
System.out.println("Question 19:\n");
System.out.println("Write a program in Java to display any number in reverse order.\n => Sample Output:\n\tInput a number: 12345\n\tThe number in reverse order is : 54321");







//============================================//
//  Question 20
System.out.println("\n\n==========================");
System.out.println("Question 20:\n");
System.out.println("Write a program in Java to find power of any number using for loop.\n => Sample Output:\n\tInput the base: 2\n\tInput the exponent: 5\n\t2 ^ 5 = 32");

Scanner sc1 = new Scanner(System.in);
System.out.println("Input the base: ");
int base= sc1.nextInt();
System.out.println("Input the exponent: ");
int exponent = sc1.nextInt();
int power = 1;  
for (int i = 1; i <= exponent; i++)   {
power = power * base;}  
System.out.println("Input the base: "+base+"\nInput the exponent: "+exponent+"\n"+base+" ^ "+exponent+" = " +power);


//============================================//
//  Question 21
System.out.println("\n\n==========================");
System.out.println("Question 21:\n");
System.out.println("Write a program that inputs 10 elements in a 1D array. The program should then print the sum, max and min value in the array");

int ArraytoAnalyse[]={1,2,3,4,5,6,7,8,9,10};
int maximum=0;
int minimum=0;
int sum=0;

for (int count6 = 0; count6 < ArraytoAnalyse.length; count6++) {
    maximum = ArraytoAnalyse[count6];

        for (int count4 = 1; count4 < ArraytoAnalyse.length; count4++)
            if (ArraytoAnalyse[count4] > maximum){
                maximum = ArraytoAnalyse[count4];
            }
}

for (int count6 = 0; count6 < ArraytoAnalyse.length; count6++) {
    minimum = ArraytoAnalyse[count6];

        for (int count4 = 0; count4 < ArraytoAnalyse.length; count4++)
            if (ArraytoAnalyse[count4] < minimum){
                minimum = ArraytoAnalyse[count4];
            }
}

for (int count6 = 0; count6 < ArraytoAnalyse.length; count6++) {
    sum=sum+ArraytoAnalyse[count6];
}


System.out.println("Maximum Number: "+maximum);
System.out.println("Minimum Number: "+minimum);
System.out.println("Sum: "+sum);



//============================================//
//  Question 22
System.out.println("\n\n==========================");
System.out.println("Question 22:\n");
System.out.println("");

int ArraytoFindMax[]={1,2,3,4,5,6,7};
int max=0;

for (int count6 = 0; count6 < ArraytoFindMax.length; count6++) {
    max = ArraytoFindMax[count6];

        for (int count4 = 1; count4 < ArraytoFindMax.length; count4++)
            if (ArraytoFindMax[count4] > max){
                max = ArraytoFindMax[count4];
            }
}

int m,flag3=0;
boolean isPrime=false;
int n=max;
//it is the number to be checked  
   m=n/2;    
  if(n==0||n==1){
   isPrime=false;    
  }else{
   for(int count7=2;count7<=m;count7++){    
    if(n%count7==0){    
        isPrime=false;   
        flag3=1;    
     break;    
    }    
   }    
   if(flag3==0)  { 
    isPrime=true; 
}
  }

System.out.println(isPrime);







//============================================//
//  Question 23
System.out.println("\n\n==========================");
System.out.println("Question 23:\n");
System.out.println("Write a program that inputs 10 elements in an array. The program should print the number of primenumbers in the array.");

int arr[]={1,2,3,4,5,6,7,8,9,10};

for(int co=0;co<arr.length;co++){
     int i,m1=0,flag1=0; 
  int n1=arr[co];
//it is the number to be checked  
  m1=n1/2;    
  if(n1==0||n==1){
   System.out.println(n1+" is not prime number");    
  }else{
   for(i=2;i<=m1;i++){    
    if(n1%i==0){    
     System.out.println(n1+" is not prime number");    
     flag1=1;    
     break;    
    }    
   }    
   if(flag1==0)  { System.out.println(n1+" is prime number"); }
  }//end of else

}


//============================================//
//  Question 24
System.out.println("\n\n==========================");
System.out.println("Question 24:\n");
System.out.println("Write a program that inputs 10 elements in an array. The program should print factorial of each number stored in the array.");

int BeforeFic[] = {1,2,3,4,5,6,7,8,9,10};
int AfterFic[] = {0,0,0,0,0,0,0,0,0,0};

for (int l = 0; l < BeforeFic.length; l++) {
    System.out.println(BeforeFic[l]);
}


for (int count2 = 0; count2 < BeforeFic.length; count2++) {
int fictorial=1;
    for (int j = BeforeFic[count2]; j>=1; j--) {
    fictorial=(fictorial*j);
    }
  AfterFic[count2]=fictorial;
}
    

    for (int k = 0; k < AfterFic.length; k++) {
        System.out.println("Fictorial of "+BeforeFic[k]+" :"+AfterFic[k]);
    }


//============================================//
//  Question 25
System.out.println("\n\n==========================");
System.out.println("Question 25:\n");
System.out.println(". Write a program that inputs 10 elements in an array. You are required to reverse the elements of array and then print them. (Element at 0 index should be exchanged with the element at 9 index and vice versa)");

   
int [] ReversingArray = new int [] {1, 2, 3, 4, 5,6,7,8,9,10};   
          
        System.out.println("Original array: ");  
        for (int count = 0; count < ReversingArray.length; count++) {   
            System.out.print(ReversingArray[count] + " ");   
        }    
          
        System.out.println();  
          
        System.out.println("Array in reverse order: ");  
        //Loop through the array in reverse order  
        for (int count1 = ReversingArray.length-1; count1 >= 0; count1--) {   
            System.out.print(ReversingArray[count1] + " ");   
        }       



//============================================//
//  Question 26
System.out.println("\n\n==========================");
System.out.println("Question 26:\n");
System.out.println("Write a class “Circle” with one data member radius. Write following member functions:\n- A constructor that assigns the data members with any initial value. (mostly zero)\n- set_radius() that accepts a value in parameter and assigns to radius\n- get_area() that calculate and return area\n- get_circum() that calculate and return circumference");

Circle cx = new Circle();
Circle cy = new Circle();

    cx.set_radius(10);
    cy.set_radius(20);
    System.out.println("Circle 1 Area: "+cx.get_area());
    System.out.println("Circle 2 Circumference: "+ cy.get_circum());    


//============================================//
//  Question 27
System.out.println("\n\n==========================");
System.out.println("Question 27:\n");
System.out.println("Write a class “Book” with three data members BookID, Pages and Price. It also contains following member functions:\n- A constructor that assigns the data members with any initial value. (mostly zero) \n- The get() is used to input values \n- [] The show() is used to display values \n- The set() is used to set values of data members using parameters\n- The getPrice() is used to return value of pric");

Book B = new Book();
B.set("0001", 100, 2000);
B.show();
System.out.println(B.getPrice());

//============================================//
//Question 28

System.out.println("\n\n==========================");
System.out.println("Question 28:\n");
System.out.println("Write a program that inputs the distance traveled and speed of vehicle. It calculates the time taken to reach its destination and print it\n");

Array A= new Array();
int a1,b1,c1,d1,e1;

Scanner scanner= new Scanner(System.in); //System.in is a standard input stream.
System.out.print("Enter a string: ");
a1= scanner.nextInt(); 
b1= scanner.nextInt(); 
c1= scanner.nextInt(); 
d1= scanner.nextInt(); 
e1= scanner.nextInt(); //reads string.

A.fill(a1, b1, c1, d1, e1);

System.out.println("\nDisplay Values:\n");
A.Display();

System.out.println("\nMin: " + A.Min());

System.out.println("\nMax: " +A.Max());


//============================================//
//  End
System.out.println("\n==========================");
System.out.print("End\n");
System.out.println("==========================");


}

}