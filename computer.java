package project1;

class outer_class{
	class processor{
		void displaydetails() {
			System.out.println("brand="+"hp");
			System.out.println("speed="+"150Mpx");
		}
	}
}
public class computer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outer_class myObj1=new outer_class();
		outer_class.processor myObj2=myObj1.new processor();
		myObj2.displaydetails();

	}

}
