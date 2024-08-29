package practise;

public class computer {
	class processor{
		public void displayDetails() {
			System.out.println("brand : Dell");
			System.out.println("speed : 234 rpm");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  computer myObj1 = new computer();
      computer.processor myObj = myObj1.new processor();
      myObj.displayDetails();
	}

}
