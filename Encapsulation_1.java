package Encapsulation_prg;

class Atm
{
	private int pwd=1234;
	public int get()
	{
		return pwd;
	}
	public void set(int pwd)
	{
		this.pwd=pwd;
	}
}

public class Encapsulation_1 {
	public static void main(String[] args) {
		Atm a1=new Atm();
		System.out.println(a1.get());
		a1.set(9853);
		System.out.println(a1.get());
		
	}
}
