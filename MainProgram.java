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
        else
            System.out.println("To be developed...\n");
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
