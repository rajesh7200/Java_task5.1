package Encapsulation_prg;

class NetBanking
{
	private int pin=1000;
	public int get()
	{
		return pin;
	}
	public void set(int pwd)
	{
		this.pin=pwd;
	}
}

public class Encapsulation_4 {
	public static void main(String[] args) {
	    NetBanking a1=new NetBanking();
		System.out.println(a1.get());
		a1.set(7852);
		System.out.println(a1.get());
		
	}
}