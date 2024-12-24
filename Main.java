/* 1.	Even or Odd Check
o	Input: An integer.
o	Logic: Check if the number is divisible by 2.
 */
import java.util.Scanner;

// flow control.
class Main {

    public static void main(String[] args) {
        System.out.println("Enter an integer :");
        Scanner userInput = new Scanner(System.in);
        int a = userInput.nextInt();
        if (a % 2 == 0) {
            System.out.println(a + " is an even number ");
        } else {
            System.out.println(a + " is an odd number ");
        }
    }
}

/*
2.	Number Positive, Negative, or Zero
o	Input: An integer.
o	Logic: Determine if the number is positive, negative, or zero.
 */
class Sign {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int a = userInput.nextInt();
        if (a == 0) {
            System.out.println(a + " is zero");
        } else if (a > 0) {
            System.out.println(a + " is positive");
        } else {
            System.out.println(a + " is negative");
        }
    }
}


/*
3.	Leap Year Check
o	Input: A year.
o	Logic: Check if the year is divisible by 4 and not divisible by 
 */
class LeapYear {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a Year :");
        int a = userInput.nextInt();
        int length = (int) Math.log10(a) + 1;
        if (length == 4) {
            if (a % 4 == 0) {
                System.out.println(a + " is a leap year");
            } else {
                System.out.println(a + " is not a leap year");
            }
        } else {
            System.out.println("Enter valid Year!");
        }

    }
}


/* 
4.	Simple Grade Calculation
o	Input: Marks in percentage.
o	Logic: Assign grades based on marks using conditions (Greater than 90 A, 80 B, 70 C, 60 D , 50 E, remaining U).
 */
class Grade {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the mark percentage in number: ");
        int a = userInput.nextInt();
        if (a < 50) {
            System.err.println("U is your grade");
        } else if (a >= 50 && a < 60) {
            System.err.println("E is your grade");
        } else if (a >= 60 && a < 70) {
            System.err.println("D is your grade");
        } else if (a >= 70 && a < 80) {
            System.err.println("C is your grade");
        } else if (a >= 80 && a < 90) {
            System.err.println("B is your grade");
        } else if (a >= 90 && a <= 100) {
            System.err.println("A is your grade");
            System.err.println("You scored the best mark!!!");
        }
    }
}

/*
5.	Largest of Two Numbers
o	Input: Two integers.
o	Logic: Compare the two numbers and print the larger one.
 */
class Larger {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int a = userInput.nextInt();
        System.out.print("Enter the second number: ");
        int b = userInput.nextInt();
        if (a > b) {
            System.out.println(a + " is gerater than " + b);
        } else {
            System.out.println(b + " is gerater than " + a);
        }
    }
}

/*6.	Eligibility for Voting
o	Input: Age.
o	Logic: Check if age is greater than or equal to 18.
 */
class Vote {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int a = userInput.nextInt();
        if (a >= 18) {
            System.out.println("You are eligable to Vote!!!");
        } else {
            System.out.println("You are not eligable to Vote...Sorry...");
        }
    }
}

/*
7.	Find Roots of a Quadratic Equation
o	Input: Coefficients of a quadratic equation (a, b, c).
o	Logic: Calculate the discriminant and check if roots are real, equal, or imaginary.
 */
class Quad{
    public static void main(String[] args) {
        Scanner userInput=new Scanner(System.in);
        System.out.print("Enter the first number : ");
        double a=userInput.nextInt();
        System.out.print("Enter the second number : ");
        double b=userInput.nextInt();
        System.out.print("Enter the third number : ");
        double c=userInput.nextInt();
        double discriminant= b*2-4*a*c;
        if(discriminant>0){                       
           double root1= (-b + Math.sqrt(discriminant))/(2*a);    
           double root2= (-b + Math.sqrt(discriminant))/(2*a);
           System.out.println(root1+" "+ root2);
        }else if(discriminant==0){
            double root=-b/(a*2);
            System.out.println(root);
        }else{
            double real=-b /(2*a);
        double imaginary=Math.sqrt(-discriminant)/(2*a);
        System.out.format("root1 =%.2f + %.2fi",real,imaginary);
        System.out.format("\n root1 =%.2f - %.2fi",real,imaginary);
        }
    }
}


 /* 
8.	Simple Calculator
o	Input: Two numbers and an operator (+, -, *, /).
o	Logic: Perform operations based on the operator using conditions.
 */
class Calculator {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the First number : ");
        int a = userInput.nextInt();
        System.out.print("Enter the second number : ");
        int b = userInput.nextInt();
        System.out.print("Enter the method of caluclation + or - or * or / : ");
        char c = userInput.next().charAt(0);
        if (c == '+') {
            System.out.println("the Addition of "+a + " and " + b + " is : " + (a + b));
        }else if (c == '-') {
            System.out.println("the Subraction of "+a + " and " + b + " is : " + (a - b));
        }else if (c == '*') {
            System.out.println("the Multiplication of "+a + " and " + b + " is : " + (a * b));
        }else if (c == '/') {
            System.out.println("the Divition of "+a + " and " + b + " is : " + (a / b));
        }
    }
}

/* 
9.	Categorize a Character
o	Input: A single character.
o	Logic: Check if the character is a vowel, consonant, digit, or special character.

*/

class Vowel{
    public static void main(String[] args) {
       Scanner userInput=new Scanner(System.in);
       System.out.print("enter a charecter : ");
       char a=userInput.next().charAt(0);
       if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u' || a=='A' || a=='E' || a=='I' || a=='O' || a=='U'){
        System.out.println(a+ " is a vowel");
       }else if(Character.isDigit(a)){
            System.out.println(a+ " is a number");
       }else if (Character.isLetter(a)) {
            System.out.println(a+ " is an alphabet");
       }else{
            System.out.println(a+ " is a special charecter");
       }
       }
    }


/* 
Triangle Type Based on Sides
o	Types Check if it’s an equilateral, isosceles, or scalene triangle using if statements.
*/

class Triangle{
    public static void main(String[] args) {
        Scanner userInput= new Scanner(System.in);
        int a=userInput.nextInt();
        int b=userInput.nextInt();
        int c=userInput.nextInt();
        if(a==b && b==c){
            System.out.println("It is a equilateral triangle");
        }else if(a==b || b==c || c==a){
            System.out.println("It is a isosceles triangle");
        }else if (a!=b && b!=c && c!=a) {
            System.err.println("It is a scalene triangle");
        }
    }
}

