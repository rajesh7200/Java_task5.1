package Encapsulation_prg;


class Laptop
{
	private double pwd=1234.00;
	public double get()
	{
		return pwd;
	}
	public void set(double pwd)
	{
		this.pwd=pwd;
	}
}

public class Encapsulation_3 {
	public static void main(String[] args) {
		Laptop a1=new Laptop();
		System.out.println(a1.get());
		a1.set(9853.1234);
		System.out.println(a1.get());
		
	}
}
