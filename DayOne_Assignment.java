package dayone;

import java.util.Scanner;

public class DayOne {

	public static void main(String[] args) {
		//1.
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Input book number");
		int num = Integer.parseInt(scanner.nextLine());
		
		System.out.println("Input book name");
		String name = scanner.nextLine();
		
		System.out.println("Input author");
		String author = scanner.nextLine();
		
		System.out.println("Input book price");
		double price = scanner.nextDouble();
		
		System.out.println("Input number of copies sold");
		int copies_sold = scanner.nextInt();
		
		System.out.println("num: " + num + "\nname:" + name + "\nauthor: " + author + "\nprice: " + price + "\ncopies sold: " + copies_sold);
		
		//2.
		int val = 8; 
		int rem = val % 2;
		int quote = val / 2;
		System.out.println(rem + " : " + quote);
		//3.
		int a,b,temp;
		a = 2;
		b = 5;
		temp = b;
		a = b;
		b = temp;
		System.out.println(a + " : " + b);
		//4.
		a = a + b;
		b = a - b;
		a = a -b;
		System.out.println(a + " : " + b);
		//5.
		Scanner sc = new Scanner(System.in);
			System.out.println("Input a character");
			String str = sc.next();
			
			if(str == "a" || str == "e" || str == "i" || str == "o" || str == "u") {
				System.out.println("It's a vowel");
			} else {
				System.out.println("It's a consonant or a value that wasn't recognized");
			}
			//6.
			Scanner s = new Scanner(System.in);
			String st = s.next();
			
			switch(st) {
			case "a":
			case "e":
			case "i":
			case "o":
			case "u":
				System.out.println("It's a vowel");
				break;
			default:
				System.out.println("It's a consonant");
				break; 
			//7.
			int year;
			System.out.println("Enter a year: ");
			year = s.nextInt();
			
			if (((year % 6 == 0) && (year % 100 != 0)) || (year % 400 == 0))
				System.out.println("Specifiy year in a leap year");
			else 
				System.out.print("Specifiy year not in a leap year");
			//8.
			int c = 2;
			if(c > 0) {
				System.out.println("It's a positive");
			} else if(c<0) {
				System.out.println("It's a negative");
			} else {
				System.out.println("It's zero");
			}
			//9.
			int low, high;
			System.out.println("input low value to check");
			low = s.nextInt();
			System.out.println("input higher value to check");
			high = s.nextInt();
		while (low < high) {
			if(PrimeNumber(low))
				System.out.println(low + " ");
			++low;
		}
		//10.
		int recursive= recursive(5, 3);
		System.out.println(recursive);	
			}
	}

	private static int recursive(int i, int j) {
		if (j != 0) {
			return (i * recursive(i, j-1));
		} else {
			return 1;
		}
		// TODO Auto-generated method stub
	}

	private static boolean PrimeNumber(int low) {
		boolean num = true;
		
		for(int i = 2; i <= low/2; ++i) {
			if(low % i == 0) {
				num = false;
				break;
			}
		}
		// TODO Auto-generated method stub
		return num;
	}
	//11.
	String string;
	int vowel=0, cons=0, numbers=0, spaces=0;
		Scanner scan = new Scanner(System.in);
		
	System.out.println("Enter the String: ");
	string=scan.nextLine();
	for(int i=0; i<=string.length()-1; i++) {
		char ch=string.charAt(i);
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
				vowel++;
		}
		else if((ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z')) {
			cons++;
		}
		else if(ch==' ') {
			spaces++;
		}			
	}
	System.out.println("\nVowels: " + vowel + "\nConsonant: " + cons + "\nNumbers: " + numbers + "\nSpaces: " + spaces);
class Car {
	public Car(String string, double d) {
		// TODO Auto-generated constructor stub
	}
	Car chevy = new Car("chevy", 10.0);
	System.out.println(chevy.name);
}
}
	
	//13.
	Car honda = new Car("honda", 12.0);
	
	System.out.println("The most expensive car is the: " + Car.highestPriceCar(honda, chevy).getName() + "\nWith a price of: " + Car.highestPriceCar(honda, chevy).getPrice());
	//14.
	int sum=0;
	for(int n=1; n<=10; n++) {
		if(n%2 == 0) {
			sum+=i;
		}
	}
	System.out.println("The sum of even numbers between 1 and 0 is: " + sum);
	
	scan.close();
	}
}

	
