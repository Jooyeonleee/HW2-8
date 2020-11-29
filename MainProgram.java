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
        {
            System.out.println("To be developed...\n");
            if (studentID == 1814382)
            	run_1814382();
        }
    }
    public void run_1814382() {
 	   Scanner scan = new Scanner(System.in);
 	   
 	   System.out.println("[StudentID:1814382]");
 	   System.out.println("1. Calcualte 일의 자리에서 반올림하기");
 	   System.out.println("2. Calcualte 등차수열의 항의 값 구하기");
 	   
 	   System.out.println("Enter your numer : ");
 	   int menu = scan.nextInt();
 	   
 	   switch (menu) {
 	   case 1:
 		   System.out.println("Enter your number(type : int) : ");
 		   int x = scan.nextInt();
 		   System.out.println("result: "+round1(x));
 		   break;
 		   
 	   case 2:
 		   System.out.println("순서대로 초항, 등차, 항의 개수를 입력하세요(예시: 3 5 4) : ");
 		   int a = scan.nextInt(); 
 		   int d = scan.nextInt();
 		   int n = scan.nextInt();
 		   System.out.println("초항이 "+a+"이고 등차가 "+d+"인 수열의 "+n+"번째 항의 값은 : "+equiSequence(a, d, n));
 	   }
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
