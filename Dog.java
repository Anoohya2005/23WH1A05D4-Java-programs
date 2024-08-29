package practise;

public class Dog {
	String name,color;
	public Dog(String x,String y) {
		name = x;
		color = y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Dog myObj = new Dog("Leo","white");
      System.out.println(myObj.name);
      System.out.println(myObj.color);
	}

}
