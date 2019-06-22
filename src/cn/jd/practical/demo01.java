package cn.jd.practical;

import java.util.InputMismatchException;
import java.util.Scanner;

public class demo01 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入第一整数 ：");
		int num1 = sc.nextInt();
		System.out.println("请输入第二整数 ：");
		int num2 = sc.nextInt();
		try{
			System.out.println(num1+"+"+num2+"="+TwoNum.Add(num1, num2));
			System.out.println(num1+"-"+num2+"="+TwoNum.Sub(num1, num2));
			System.out.println(num1+"*"+num2+"="+TwoNum.Mul(num1, num2));
			System.out.println(num1+"/"+num2+"="+TwoNum.Div(num1, num2));
		}
		catch(ArithmeticException e){
			System.out.println(num1+"/"+num2+"="+"/"+"by zero");
		}
		catch(InputMismatchException e){
		}
	}
}
class TwoNum{
    private int num1;
    private int num2;

    public TwoNum(){
    }

    public TwoNum(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public void setNum1(int num1){
    	this.num1 = num1;
    }
    public void setNum2(int num2){
    	this.num2 = num2;
    }
    
    public int getNum1(){
    	return num1;
    }
    public int getNum2(){
    	return num2;
    }   

    public int Add(){
        return num1 + num2;	
    }

    public static int Add(int num1, int num2){
        return new TwoNum(num1, num2). Add();
    }

    public int Sub(){ 
        return num1 - num2;	
    }

    public static int Sub(int num1, int num2){
        return new TwoNum(num1, num2).Sub();
    }

    public int Mul(){
        return num1 * num2;	   
    }

    public static int Mul(int num1, int num2){
        return new TwoNum(num1, num2).Mul();
    }

public int Div(){
        if(num2 == 0){
    		throw new ArithmeticException("除数为0");
    	} else {
    		return num1 / num2;
		} 
    }

    public static int Div(int num1, int num2){
    	return new TwoNum(num1, num2).Div();
    }

    public String toString(){
        return "(" +  num1 + " , " + num2 + ")";
    }
}