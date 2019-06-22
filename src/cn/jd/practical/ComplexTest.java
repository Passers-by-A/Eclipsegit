package cn.jd.practical;

public class ComplexTest {
	 public static void main(String[] args) {
	        Complex c1 = new Complex(1, 2);
	        Complex c2 = new Complex(3, 4);
	        Complex c3;
	        Complex c4;
	        Complex c5;
	        Complex c6 = new Complex();

	        System.out.println(c1);
	        System.out.println(c2);

	        c3 = c1.Add(c2);
	        System.out.println(c3);
	        c3 = Complex.Add(c1, c2);
	        System.out.println(c3);

	        c4 = c1.Sub(c2);
	        System.out.println(c4);
	        c4 = Complex.Sub(c1, c2);
	        System.out.println(c4);

	        c5 = c1.Mul(c2);
	        System.out.println(c5);
	        c5 = Complex.Mul(c1, c2);
	        System.out.println(c5);

	        System.out.println(c6);
	    }
}
class Complex{
	private int real;
	private int imag;
	
	public Complex(){
		this.real=0;
		this.imag=0;
	}
	
	public Complex(int real,int imag){
		this.real=real;
		this.imag=imag;
	}

	public int getReal() {
		return real;
	}

	public void setReal(int real) {
		this.real = real;
	}

	public int getImag() {
		return imag;
	}

	public void setImag(int imag) {
		this.imag = imag;
	}
	
	public Complex Add(Complex other) {
		this.real+=other.real;
		this.imag+=other.imag;
		return this;
	}
	
	public static Complex Add(Complex other1, Complex other2) {
		return new Complex(other1.real+other2.real,other1.imag+other2.imag);
	}
	
	public Complex Sub(Complex other) {
		this.real-=other.real;
		this.imag-=other.imag;
		return this;
	}
	
	public static Complex Sub(Complex other1, Complex other2) {
		return new Complex(other1.real-other2.real,other1.imag-other2.imag);
	}
	
	public Complex Mul(Complex other) {
		this.real*=other.real;
		this.imag*=other.imag;
		return this;
	}
	
	public static Complex Mul(Complex other1, Complex other2) {
		return new Complex(other1.real*other2.real,other1.imag*other2.imag);
	}
	
	public String toString(){
		return   real + "+" + imag + "i";
	}
}
