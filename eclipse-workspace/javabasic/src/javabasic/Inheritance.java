package javabasic;

class Google_Map_Location
{
	public Google_Map_Location(String location)
	{
		System.out.println("Google_Map_Location towards:" +location);
	}
}

class Zomato_Location extends Google_Map_Location
{
	public Zomato_Location(String location)
	{
		super(location);
		System.out.println("Zomato_Map_Location towards:" +location);
	}
}

public class Inheritance {


	public static void main(String[] args) {
	new Zomato_Location("KSLayout");

	}

}
