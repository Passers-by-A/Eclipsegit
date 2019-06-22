package cn.jd.practical;

public class demo02 {
	public static void main(String[] args) {
		Fraction c1 = new Fraction(2, 8);
		Fraction c2 = new Fraction(4, 6);
		Fraction c3;
		Fraction c4;
		Fraction c5;
		Fraction c6 = new Fraction();

        System.out.println(c1);
        System.out.println(c2);

        c3 = c1.Add(c2);
        System.out.println(c3);
        c3 = Fraction.Add(c1, c2);
        System.out.println(c3);

        c4 = c1.Sub(c2);
        System.out.println(c4);
        c4 = Fraction.Sub(c1, c2);
        System.out.println(c4);

        c5 = c1.Mul(c2);
        System.out.println(c5);
        c5 = Fraction.Mul(c1, c2);
        System.out.println(c5);

        System.out.println(c6);
    }
}
class Fraction {
	private int fz;		// 分子
	private int fm;		// 分母

	public Fraction(){
		fz=0;
		fm=1;
	}
	public Fraction (int  fz,  int  fm) {
		this.fz=fz;
		if(fm==0) {
			System.out.println("分母不能为零");
		}else {
			this.fm=fm;
		}
	alter();
	}
	
	public int getFz() {
		return fz;
	}
	public void setFz(int fz) {
		this.fz = fz;
	}
	public int getFm() {
		return fm;
	}
	public void setFm(int fm) {
		this.fm = fm;
	}
	
	private Fraction alter() {
		int num=this.yueshu(this.fz,this.fm);
		this.fz/=num;
		this.fm/=num;
		return this;
	}
	
	private  int yueshu(int a,int b) {
		while(b!=0){
			int temp=a%b;
			a=b;
			b=temp;
		}
		int yueshu=a;
		return yueshu;
	}
	
	public Fraction Add (Fraction other) {
		this.fz+=this.fz;
		this.fm+=this.fm;
		return this;
	}
	public static Fraction Add(Fraction other1, Fraction other2) {
		return new Fraction(other1.fz*other2.fm+other2.fz*other1.fm,other1.fm*other2.fm);
	}
	
	public Fraction Sub (Fraction other) {
		this.fz-=this.fz;
		this.fm-=this.fm;
		return this;
	}
	public static Fraction Sub(Fraction other1, Fraction other2) {
		return new Fraction(other1.fz*other2.fm-other2.fz*other1.fm,other1.fm*other2.fm);
	}
	
	public Fraction Mul (Fraction other) {
		this.fz*=this.fz;
		this.fm*=this.fm;
		return this;
	}
	public static Fraction Mul(Fraction other1, Fraction other2) {
		return new Fraction(other1.fz*other2.fz,other1.fm*other2.fm);
	}
	
	public Fraction Div (Fraction other) {
		this.fz/=this.fz;
		this.fm/=this.fm;
		return this;
	}
	public Fraction Div(Fraction other1, Fraction other2) {
		return new Fraction(other1.fz*other2.fm,other1.fm*other2.fz);
	}
	
	public String toString(){
		return   fz + "/" + fm ;
	}
}










