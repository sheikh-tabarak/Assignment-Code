import java.util.Scanner;


//Question 26
class Circle {

    private int radius;
    private double PI = 3.14;

    void set_radius(int r) {
        radius = r;
    }

    double get_circum() {
        double circum = 2 * PI * radius;
        return circum;
    }

    double get_area() {
        double area = PI * radius * radius;
        return area;
    }

};

// Question 27

class Book {
    private String BookID;
    private int Pages;
    private double Price;
    Book() {
        this.BookID = "";
        this.Pages = 0;
        this.Price = 0;}

    void show() {
        System.out.println(this.BookID);
        System.out.println(this.Pages);
        System.out.println(this.Price); }

    void set(String BookID, int Pages, double Price) {
        this.BookID = BookID;
        this.Pages = Pages;
        this.Price = Price;}

    double getPrice() {
        double price = 0;
        price = this.Price;
        return price;
    }

}

// Question 28

class Array {

    int StoredIntegers[] = new int[5];

    Array() {
        StoredIntegers[0] = 0;
        StoredIntegers[1] = 0;
        StoredIntegers[2] = 0;
        StoredIntegers[3] = 0;
        StoredIntegers[4] = 0;
    }

    void fill(int a, int b, int c, int d, int e) {
        StoredIntegers[0] = a;
        StoredIntegers[1] = b;
        StoredIntegers[2] = c;
        StoredIntegers[3] = d;
        StoredIntegers[4] = e;
    }

    void Display() {
        for (int i = 0; i < 5; i++) {
            System.out.println(StoredIntegers[i]);
        }
    }

    int Max() {
        int i;

        int max = StoredIntegers[0];

        for (i = 1; i < StoredIntegers.length; i++)
            if (StoredIntegers[i] > max)
                max = StoredIntegers[i];

        return max;
    }

    int Min() {

        int min = StoredIntegers[0];

        for (int i = 0; i < StoredIntegers.length; i++) {

            if (StoredIntegers[i] < min)
                min = StoredIntegers[i];
        }

        return min;
    }

}

// Question 28
public class Java_Basic_Programs {
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        // ============================================//
        // Question 01
        System.out.println("\n\n==========================");
        System.out.println("Question 01:");
        System.out.println("Write a program in Java to swap two numbers.");

        int a = 20;
        int b = 10;
        System.out.println("Before Swapping :\nValue of a = " + a + "\nValue of b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swapping :\nValue of a = " + a + "\nValue of b = " + b);

        // ============================================//
        // Question 02
        System.out.println("\n\n==========================");
        System.out.println("Question 02:");
        System.out.println("Write a program in Java to find the area and circumference of a circle.\n");

        int radius = 3;
        // formula to calculate area of circle
        double area = Math.PI * (radius * radius);
        System.out.printf("Area is: %.2f", area);

        // formula to calculate circumference of circle
        double circumference = Math.PI * 2 * radius;
        System.out.printf("\nCircumference is: %.2f", circumference);

        // ============================================//
        // Question 03
        System.out.println("\n\n==========================");
        System.out.println("Question 03:");
        System.out.println("Write a program in Java to convert temperature in Celsius to Fahrenheit.\n");

        float Fahrenheit, Celsius;
        Celsius = 223;
        Fahrenheit = ((Celsius * 9) / 5) + 32;
        System.out.println("Temperature in Fahrenheit is: " + Fahrenheit);

        // ============================================//
        // Question 04
        System.out.println("\n\n==========================");
        System.out.println("Question 04:");
        System.out.println("Write a program in Java that converts kilometers per hour to miles per hour.\n");

        double kilometers;

        System.out.println("Please enter kilometers per hours:");

//    Scanner scanner = new Scanner(System.in);
        kilometers = scanner.nextDouble();

        double miles = kilometers / 1.6;

        System.out.println(miles + " Miles/hr");

        // ============================================//
        // Question 05
        System.out.println("\n\n==========================");
        System.out.println("Question 05:");
        System.out.println(
                "Write a program that inputs the distance traveled and speed of vehicle. It calculates the time taken to reach its destination and print it.\n");

        int S = 0;
        int v = 0;
        int t = 0;
        // S= v*t
      //  Scanner newS = new Scanner(System.in);
        S = scanner.nextInt();
        v = scanner.nextInt();

        t = S / v;

        System.out.println("Time taken to reach: " + t);

        // ============================================//
        // Question 06
        System.out.println("\n\n==========================");
        System.out.println("Question 06:\n");
        System.out.println(
                "Write a program that takes a 3-digit number from user and display the reverse of that number. For example if user enters 123, then the program should display 321.\n");
        int ThreeDigitNumber;
        //Scanner S10 = new Scanner(System.in);
        ThreeDigitNumber = scanner.nextInt();

        System.out.println(Integer.toString(ThreeDigitNumber).length());

        if (Integer.toString(ThreeDigitNumber).length() == 3) {
            char[] ca = { Integer.toString(ThreeDigitNumber).charAt(2), Integer.toString(ThreeDigitNumber).charAt(1),
                    Integer.toString(ThreeDigitNumber).charAt(0)
            };
            String newNumber = new String(ca);

            System.out.println(newNumber);
        } else {
            System.out.println("Entered Number is not a three Digit Number");
        }

        // ============================================//
        // Question 07
        System.out.println("\n\n==========================");
        System.out.println("Question 07:\n");
        System.out.println(
                ". Write a program that will prompt the user to enter number of hours. Your program should display the number of weeks, days and hours within the input number of hours.\n");

        int hrs, W, d;

        System.out.println("Enter number of hours: ");
       // Scanner S11 = new Scanner(System.in);
        hrs = scanner.nextInt();

        W = hrs / 168;
        hrs = hrs - (W * 168);

        d = hrs / 24;
        hrs = hrs - (d * 24);

        System.out.println("Weeks: " + W + "\nDays: " + d + "\nHours: " + hrs);

        // ============================================//
        // Question 08
        System.out.println("\n\n==========================");
        System.out.println("Question 08:\n");
        System.out.println("Write a program in Java to check whether a number is positive, negative or zero.\n");

        int number;
        System.out.println("Enter number to check: ");
    //    Scanner scanner112 = new Scanner(System.in);
        number = scanner.nextInt();

        if (number > 0) {
            System.out.println(number + "is a Positive Number");
        } else if (number < 0) {
            System.out.println(number + "is a Negative Number");
        } else {
            System.out.println("Number is 0");
        }

        // ============================================//
        // Question 09
        System.out.println("\n\n==========================");
        System.out.println("Question 09:\n");
        System.out.println("Write a program that takes 3 numbers from user and find maximum from these numbers.");

        int a9 = 0, b9 = 0, c9 = 0;
       // Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        a9 = scanner.nextInt();
        System.out.println("Enter Second Number: ");
        b9 = scanner.nextInt();
        System.out.println("Enter Third Number: ");
        c9 = scanner.nextInt();

        int ArrayQuestion9[] = { a9, b9, c9 };
        int maximum9 = 0;
        for (int count6 = 0; count6 < ArrayQuestion9.length; count6++) {
            maximum9 = ArrayQuestion9[count6];
            for (int count4 = 1; count4 < ArrayQuestion9.length; count4++)
                if (ArrayQuestion9[count4] > maximum9) {
                    maximum9 = ArrayQuestion9[count4];
                }
            System.out.println("Maximum from all three is : " + maximum9);
        }

        // ============================================//
        // Question 10
        System.out.println("\n\n==========================");
        System.out.println("Question 10:\n");
        System.out.println("Write a program that takes a number from user and find whether it is even or odd.");
       // Scanner scaaning1 = new Scanner(System.in);
       
          int evenoddcheck;
         
          Scanner input = new Scanner(System.in);
          System.out.println("Please enter an integer:");
         
          evenoddcheck = input.nextInt();
         
          if(evenoddcheck % 2 == 0)
            System.out.println("The number is even.");
          else
            System.out.println("The number is odd.");
        
    

        // ============================================//
        // Question 11
        System.out.println("\n\n==========================");
        System.out.println("Question 11:\n");
        System.out.println(
                "Write a program that inputs salary and grade. It adds 50% bonus if the grade is greater than 15. It adds 25% bonus if the grade is 15 or less and then display the total salary");

        double salary=0;
        int grade=0;
      //  Scanner scaaning = new Scanner(System.in);
        System.out.println("Enter Salary:");
        salary = scanner.nextDouble();
        System.out.println("Enter Grade: ");
        grade = scanner.nextInt();

        if(grade<=15){
        salary=salary*(1.25);
        System.out.println("Here is updated salary in terms of grade: "+salary);
        }else{
        salary=salary*(1.5);
        System.out.println("Here is updated salary in terms of grade: "+salary);
        }

        // ============================================//
        // Question 12
        System.out.println("\n\n==========================");
        System.out.println("Question 12:\n");
        System.out.println(
                "Write a program that displays the squares of the numbers from 0 to 14.\nHere’s the output:\n0 1 4 9 16 25 36 49 64 81 100 121 144 169 196");

                for (int i = 0; i <= 14; i++) {
                    System.out.print(i*i + " ");
                }

        // ============================================//
        // Question 13
        System.out.println("\n\n==========================");
        System.out.println("Question 13:\n");
        System.out.println(
                "Write a program in Java to display n terms of natural number and their sum.\n => Sample Output:\nInput a number of terms: 7\nThe natural numbers upto 7th terms are:\n1 2 3 4 5 6 7\nThe sum of the natural numbers is: 28");

                Scanner sc = new Scanner(System.in);
                System.out.print("Input a number of terms: ");
                int naturalno = sc.nextInt();
                int SumofN = 0;
                System.out.print("The natural numbers upto " + naturalno +"th terms are: ");
                for (int i = 1; i <= naturalno; i++) {
                    System.out.print(i + " ");
                    SumofN += i;
                }
                System.out.println();
                System.out.println("The sum of the natural numbers is: " + SumofN);

        // ============================================//
        // Question 14
        System.out.println("\n\n==========================");
        System.out.println("Question 14:\n");
        System.out.println("Write a program in Java to check whether a number is prime or not.");
        int num = 35;
        boolean flag = false;
        for(int i = 2; i <= num/2; ++i)
        {
            if(num % i == 0)
            {
                flag = true;
                break;}}
        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");

        // ============================================//
        // Question 15
        System.out.println("\n\n==========================");
        System.out.println("Question 15:\n");
        System.out.println(
                "Write a program in Java to find prime number within a range.\nInput number for starting range: 1\nInput number for ending range: 100\nThe prime numbers between 1 and 100 are:\n2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97\nThe total number of prime numbers between 1 to 100 is: 25");
                int start = 1;
                int end = 100;
                System.out.print("The prime numbers between " + start + " and " + end + " are: ");
                int countforprime = 0;
                for (int i = start; i <= end; i++) {
                    boolean isPrime = true;
                    for (int j = 2; j < i; j++) {
                        if (i % j == 0) {
                            isPrime = false;
                            break;}}
                    if (isPrime) {
                        System.out.print(i + " ");
                        countforprime++;
                    }
                }
                System.out.println();
                System.out.println("The total number of prime numbers between " + start + " to " + end + " is: " + countforprime);

    
        // ============================================//
        // Question 16
        System.out.println("\n\n==========================");
        System.out.println("Question 16:\n");
        System.out.println(
                "Write a program in Java to find the factorial of a number.\n => Sample output:\n\tInput a number to find the factorial: 5\n\tThe factorial of the given number is: 120");
                int inputNumber, factorial = 1;
                Scanner SCNR = new Scanner(System.in);
        
                System.out.print("Input a number to find the factorial: ");
                inputNumber = SCNR.nextInt();
        
                for (int i = 1; i <= inputNumber; i++) {
                    factorial *= i;
                }
        
                System.out.println("The factorial of the given number is: " + factorial);



        // ============================================//
        // Question 17
        System.out.println("\n\n==========================");
        System.out.println("Question 17:\n");
        System.out.println(
                "Write a program in Java to find the sum of digits of a given number.\n => Sample Output:\n\tInput a number: 1234\n\tThe sum of digits of 1234 is: 10");

                int numforsum = 1234;
                int sumofnum = 0;
        
                while (numforsum != 0) {
                    sumofnum += numforsum % 10;
                    numforsum /= 10;
                }
        
                System.out.println("The sum of digits of 1234 is: " + sumofnum);


        // ============================================//
        // Question 18
        System.out.println("\n\n==========================");
        System.out.println("Question 18:\n");
        System.out.println(
                "Write a program in Java to find the number and sum of all integer between 100 and 200 which are divisible by 9.\n => Sample Output:\n\tNumbers between 100 and 200, divisible by 9:\n\t108 117 126 135 144 153 162 171 180 189 198\n\tThe sum : 1683");


                int intnum = 100;
                int sumofint = 0;
                System.out.println("Numbers between 100 and 200, divisible by 9:");
                while(intnum <= 200){
                  if(intnum % 9 == 0){
                    System.out.print(intnum + " ");
                    sumofint += intnum;
                  }
                  intnum++;
                }
                System.out.println("\nThe sum : " + sumofint);




        // ============================================//
        // Question 19
        System.out.println("\n\n==========================");
        System.out.println("Question 19:\n");
        System.out.println(
                "Write a program in Java to display any number in reverse order.\n => Sample Output:\n\tInput a number: 12345\n\tThe number in reverse order is : 54321");

       // Scanner sss = new Scanner(System.in);

        int number1 = 12345, reverse = 0;

        number1 = scanner.nextInt();

        while (number1 != 0) {
            int remainder = number1 % 10;
            reverse = reverse * 10 + remainder;
            number1 = number1 / 10;
        }
        System.out.println("Input a number: " + number1);
        System.out.println("The number in reverse order is : " + reverse);

        // ============================================//
        // Question 20
        System.out.println("\n\n==========================");
        System.out.println("Question 20:\n");
        System.out.println(
                "Write a program in Java to find power of any number using for loop.\n => Sample Output:\n\tInput the base: 2\n\tInput the exponent: 5\n\t2 ^ 5 = 32");

        //Scanner sc1 = new Scanner(System.in);
        System.out.println("Input the base: ");
        int base = scanner.nextInt();
        System.out.println("Input the exponent: ");
        int exponent = scanner.nextInt();
        int power = 1;
        for (int i = 1; i <= exponent; i++) {
            power = power * base;
        }
        System.out.println("Input the base: " + base + "\nInput the exponent: " + exponent + "\n" + base + " ^ "
                + exponent + " = " + power);

        // ============================================//
        // Question 21
        System.out.println("\n\n==========================");
        System.out.println("Question 21:\n");
        System.out.println(
                "Write a program that inputs 10 elements in a 1D array. The program should then print the sum, max and min value in the array");
        int ArraytoAnalyse[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int maximum = 0, minimum = 0, sum = 0;
        for (int count6 = 0; count6 < ArraytoAnalyse.length; count6++) {
            maximum = ArraytoAnalyse[count6];
            for (int count4 = 1; count4 < ArraytoAnalyse.length; count4++)
                if (ArraytoAnalyse[count4] > maximum) {
                    maximum = ArraytoAnalyse[count4];}}

        for (int count6 = 0; count6 < ArraytoAnalyse.length; count6++) {
            minimum = ArraytoAnalyse[count6];
            for (int count4 = 0; count4 < ArraytoAnalyse.length; count4++)
                if (ArraytoAnalyse[count4] < minimum) {
                    minimum = ArraytoAnalyse[count4];}}

        for (int count6 = 0; count6 < ArraytoAnalyse.length; count6++) {
            sum = sum + ArraytoAnalyse[count6];}
        System.out.println("Maximum Number: " + maximum);
        System.out.println("Minimum Number: " + minimum);
        System.out.println("Sum: " + sum);

        // ============================================//
        // Question 22
        System.out.println("\n\n==========================");
        System.out.println("Question 22:\n");
        System.out.println("");
        int ArraytoFindMax[] = { 1, 2, 3, 4, 5, 6, 7 };
        int max = 0;
        for (int count6 = 0; count6 < ArraytoFindMax.length; count6++) {
            max = ArraytoFindMax[count6];
            for (int count4 = 1; count4 < ArraytoFindMax.length; count4++)
                if (ArraytoFindMax[count4] > max) {
                    max = ArraytoFindMax[count4];} }
        int m, flag3 = 0;
        boolean isPrime = false;
        int n = max;
        m = n / 2;
        if (n == 0 || n == 1) {
            isPrime = false;
        } else {
            for (int count7 = 2; count7 <= m; count7++) {
    if (n % count7 == 0) { isPrime = false; flag3 = 1; break; }}
            if (flag3 == 0) { isPrime = true;}}
        System.out.println(isPrime);

        // ============================================//
        // Question 23
        System.out.println("\n\n==========================");
        System.out.println("Question 23:\n");
        System.out.println(
                "Write a program that inputs 10 elements in an array. The program should print the number of primenumbers in the array.");

        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        for (int co = 0; co < arr.length; co++) {
            int i, m1 = 0, flag1 = 0;
            int n1 = arr[co];
            // it is the number to be checked
            m1 = n1 / 2;
            if (n1 == 0 || n == 1) {
                System.out.println(n1 + " is not prime number");
            } else {
                for (i = 2; i <= m1; i++) {
                    if (n1 % i == 0) {
                        System.out.println(n1 + " is not prime number");
                        flag1 = 1;  break; }}
                if (flag1 == 0) {
                    System.out.println(n1 + " is prime number"); }} // end of else

        }

        // ============================================//
        // Question 24
        System.out.println("\n\n==========================");
        System.out.println("Question 24:\n");
        System.out.println(
                "Write a program that inputs 10 elements in an array. The program should print factorial of each number stored in the array.");
        int BeforeFic[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int AfterFic[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        for (int l = 0; l < BeforeFic.length; l++) {
            System.out.println(BeforeFic[l]);
        }
        for (int count2 = 0; count2 < BeforeFic.length; count2++) {
            int fictorial = 1;
            for (int j = BeforeFic[count2]; j >= 1; j--) {
                fictorial = (fictorial * j);
            }
            AfterFic[count2] = fictorial;}

        for (int k = 0; k < AfterFic.length; k++) {
            System.out.println("Fictorial of " + BeforeFic[k] + " :" + AfterFic[k]);
        }

        // ============================================//
        // Question 25
        System.out.println("\n\n==========================");
        System.out.println("Question 25:\n");
        System.out.println(
                ". Write a program that inputs 10 elements in an array. You are required to reverse the elements of array and then print them. (Element at 0 index should be exchanged with the element at 9 index and vice versa)");

        int[] ReversingArray = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        System.out.println("Original array: ");
        for (int count = 0; count < ReversingArray.length; count++) {
            System.out.print(ReversingArray[count] + " ");
        }

        System.out.println();

        System.out.println("Array in reverse order: ");
        // Loop through the array in reverse order
        for (int count1 = ReversingArray.length - 1; count1 >= 0; count1--) {
            System.out.print(ReversingArray[count1] + " ");
        }

        // ============================================//
        // Question 26
        System.out.println("\n\n==========================");
        System.out.println("Question 26:\n");
        System.out.println(
                "Write a class “Circle” with one data member radius. Write following member functions:\n- A constructor that assigns the data members with any initial value. (mostly zero)\n- set_radius() that accepts a value in parameter and assigns to radius\n- get_area() that calculate and return area\n- get_circum() that calculate and return circumference");

        Circle cx = new Circle();
        Circle cy = new Circle();

        cx.set_radius(10);
        cy.set_radius(20);
        System.out.println("Circle 1 Area: " + cx.get_area());
        System.out.println("Circle 2 Circumference: " + cy.get_circum());

        // ============================================//
        // Question 27
        System.out.println("\n\n==========================");
        System.out.println("Question 27:\n");
        System.out.println(
                "Write a class “Book” with three data members BookID, Pages and Price. It also contains following member functions:\n- A constructor that assigns the data members with any initial value. (mostly zero) \n- The get() is used to input values \n- [] The show() is used to display values \n- The set() is used to set values of data members using parameters\n- The getPrice() is used to return value of pric");

        Book B = new Book();
        B.set("0001", 100, 2000);
        B.show();
        System.out.println(B.getPrice());

        // ============================================//
        // Question 28
        System.out.println("\n\n==========================");
        System.out.println("Question 28:\n");
        System.out.println(
                "Write a class “Array” that contains an array of integers to store five values. It also contains following member functions.\n\t A constructor that assigns all the elements of array with zero value.\n\t - The Fill() function is used to fill the array with values from user \n\t - The Display() function is used to display the values of array \n\t - The Max() function shows the maximum value in the array\n\t - The Min() function shows the minimum value in the array\nAll member functions should be defined outside the class. Create an object in main function and make use of all member functions.\n");
        Array A = new Array();
        int a1, b1, c1, d1, e1;

    //  Scanner scanner = new Scanner(System.in); // System.in is a standard input stream.
        System.out.print("Enter a string: ");
        a1 = scanner.nextInt();
        b1 = scanner.nextInt();
        c1 = scanner.nextInt();
        d1 = scanner.nextInt();
        e1 = scanner.nextInt();
         
        // reads string.
        A.fill(a1, b1, c1, d1, e1);
        System.out.println("\nDisplay Values:\n");
        A.Display();
        System.out.println("\nMin: " + A.Min());
        System.out.println("\nMax: " + A.Max());

        // ============================================//
        // End
        System.out.println("\n==========================");
        System.out.print("End\n");
        System.out.println("==========================");

    }

}