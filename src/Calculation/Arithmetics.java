package Calculation;

import java.util.Scanner;

public class Arithmetics {
	double s, a, b;
	public void Scan() {
		
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		System.out.println("Введите первое число:");
		a=scn.nextInt();
		System.out.println("Введите второе число: ");
		b=scn.nextInt();
	}
	
	public double add(double a, double b) {
		s=a+b;
		System.out.println("Cумма чисел:"+s);
		return s;
		
	}
	
	public double deduct(double a, double b) {
		s=a-b;
		System.out.println("Разность чисел:"+s);
		return s;
	}
	
	public double mult(double a, double b) {
		s=a*b;
		System.out.println("Умножение чисел:"+s);
		return s;
	}
	
	public double div(double a, double b) {
		s=a/b;
		System.out.println("Деление чисел:"+s);
		return s;
	}

}
