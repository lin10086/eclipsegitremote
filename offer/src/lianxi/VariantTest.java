package lianxi;

import java.util.Scanner;

public class VariantTest{
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个数");
		int n=sc.nextInt();
		int mul =1;
		
		for(int i=1;i<=n;i++) {
			mul*=i;
		}
		System.out.println(mul);
		
	}
}



