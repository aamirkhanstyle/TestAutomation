package movies;

public class VariableTypes {

	int age=25;
	public static void main(String[] args) {
		VariableTypes v=new VariableTypes();
		v.test();
		v.test1();
		
	}
	public void test() {
		int age1=66;
		System.out.println(age1);
		System.out.println(age);
		
	}
	public void test1() {
		System.out.println(age);
	
		
	}
}
