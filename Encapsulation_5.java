package Encapsulation_prg;

class OTP
{
	private int x=9034;
	public int get()
	{
		return x;
	}
	public void set(int x)
	{
		this.x=x;
	}
}

public class Encapsulation_5 {
	public static void main(String[] args) {
		OTP a1=new OTP();
		System.out.println(a1.get());
		a1.set(6453);
		System.out.println(a1.get());
		
	}
}
