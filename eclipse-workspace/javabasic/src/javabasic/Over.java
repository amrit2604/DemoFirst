package javabasic;

class Instagram
{
	public void login()
	{
		System.out.println("login To your account");
	}
}
class Web extends Instagram
{	
	@Override
	public void login()
	{
		super.login();
		System.out.println("login To your account - web");
	}
}
class App extends Instagram
{
	@Override
	public void login()
	{
		super.login();
		System.out.println("login To your account - App");
	}
}
public class Over 
{
	public static void main(String[] args) 
	{
		Web w1 = new Web();
		w1.login();
		System.out.println("-----------");
		App a1 = new App();
		a1.login();
	}
}
