package project1;

public class cat {
	String name;
	int age;
	public cat() {
		name="unknown";
		age=0;
	}
	public static void main(String[] args) {
		cat myObj=new cat();
		System.out.println(myObj.name);
		System.out.println(myObj.age);

	}

}
