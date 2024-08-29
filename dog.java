package project1;

public class dog {
	String name;
	String colour;
	public dog(String n,String c) {
		name=n;
		colour=c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dog myObj=new dog("hello","black");
		System.out.println(myObj.name);
		System.out.println(myObj.colour);
	}

}





