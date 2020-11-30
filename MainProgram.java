import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        MainProgram mainProgram = new MainProgram();
        mainProgram.printBanner();
        while (true) {
            int studentID = mainProgram.receiveStudentID();
            mainProgram.runModule(studentID);
        }
    }

    public void printBanner() {
        System.out.println("[2020-Fall Software Engineering]");
        System.out.println("Simple Software Development Project");
        System.out.println();
    }

    public int receiveStudentID() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a student ID: ");
        return input.nextInt();
    }

    public void runModule(int studentID) {
        if (studentID == 11530)
            System.out.println("No. It is the professor ID.\n");
        else if(studentID == 1814080) {
        	System.out.println("[Student ID: 1814080]");
        	System.out.println("1. Calculate pow");
        	System.out.println("2. Calculate absolute value");
        	System.out.print("Enter menu number: ");
        	Scanner sc = new Scanner(System.in);
        	int menu = sc.nextInt();
        	if(menu == 1) {
        		System.out.print("Enter base and exponent: ");
        		int base = sc.nextInt();
        		int exponent = sc.nextInt();
        		int result = pow(base, exponent);
        		System.out.println("Result: "+ result);
        	}
        	else if(menu == 2) {
        		System.out.print("Enter the number to make absolute value: ");
        		int number = sc.nextInt();
        		int result = absolute(number);
        		System.out.println("Result: "+ result);
        	}
        	else {
        		System.out.println("please choose 1 or 2");
        	}
        }
        
        else if(studentID == 1813725)
        	hw_1813725();
        
        else
        {
            System.out.println("To be developed...\n");
            if (studentID == 1814382)
            	run_1814382();
        }
    }
    public void run_1814382() {
 	   Scanner scan = new Scanner(System.in);
 	   
 	   System.out.println("[StudentID:1814382]");
 	   System.out.println("1. Calculate the rounded value at units");
 	   System.out.println("2. Calculate the value of a term in the arithmetic progression");
 	   
 	   System.out.println("Enter your numer : ");
 	   int menu = scan.nextInt();
 	   
 	   switch (menu) {
 	   case 1:
 		   System.out.println("Enter your number(type : int) : ");
 		   int x = scan.nextInt();
 		   System.out.println("result: "+round1(x));
 		   break;
 		   
 	   case 2:
 		   System.out.println("Enter the first term, common difference, and the number of terms in order. (ex, 3 5 4)");
 		   int a = scan.nextInt(); 
 		   int d = scan.nextInt();
 		   int n = scan.nextInt();
 		   System.out.println("result: "+equiSequence(a, d, n));
 	   }
 	}
    
    public void hw_1813725() {
    	Scanner sc = new Scanner(System.in);
	   
    	System.out.println("\n[StudentID:1813725]");
    	System.out.println("1. Calculate factorial");
    	System.out.println("2. Calculate sum of geometric series");
	   
	   	System.out.print("Enter the menu : ");
	   	int menu = sc.nextInt();
	   
	   	switch (menu) {
	   		case 1:
	   			while (true){
	   				System.out.print("Enter a positive integer: ");
	   				int a = sc.nextInt();
	   				if(a>0) {
	   					System.out.println("result: "+ Factorial(a)+"\n");
	   					break;
	   				}
	   				else
	   					System.out.println("Only positive integers can be entered.");
	   			}
	   			break;
		   
	   		case 2:
	   			while (true) {
	   				System.out.print("Enter two numbers : ");
	   				float a = sc.nextFloat(); 
	   				float b = sc.nextFloat();
	   				
	   				if(b>=1.0||b<=-1.0)
	   					System.out.println("The range of second argument is that absolute value of second argument is less than 1.");
	   				else {
	   					System.out.println("result: "+ SumofGS(a,b)+"\n");
	   					break;
	   				}
	   			}
	   			break;
		   
	   		default:
	   			System.out.println("Choose 1 or 2");
	   	}
    }

    public long Factorial(int a) {
		long result=1;
		int i;
		for(i=1;i<=a;i++)
			result=result*i;
		return result;
	}

	public float SumofGS(float a, float b) {
		float result;
		result=a/(1-b);
		return result;
	}
    
    public int round1(int x) {
 	   int first = x % 10;
 	   int ten = x - first;
 	   if (first < 5)
 		   return (ten);
 	   else
 		   return (ten+10);
    }
    
    public int equiSequence(int a, int d, int n) {
 	   return a + d * (n - 1);
    }
    
    public int pow(int a, int b) {
    	if(a==0) return 0;
    	else if(a==1 || b==0) return 1;
    	int res=1;
    	for(int i=0; i<b;i++) res *= a;
    	return res;
    }
    
    public int absolute(int a) {
    	if(a>=0) return a;
    	else return -a;
    	
    }
}