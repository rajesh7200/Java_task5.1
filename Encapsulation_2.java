package Encapsulation_prg;

class FB
{
	private String pwd="hihi";
	public String get()
	{
		return pwd;
	}
	public void set(String pwd)
	{
		this.pwd=pwd;
	}
}

public class Encapsulation_2 {
	public static void main(String[] args) {
		FB a1=new FB();
		System.out.println(a1.get());
		a1.set("9853");
		System.out.println(a1.get());
		
	}
}



