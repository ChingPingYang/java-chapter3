
public class Class_main {

	public static void main(String[] args) {
		Class_sub demo = new Class_sub();
		
		demo.setX();
		String hi = demo.doSomething("fefefef");
		System.out.println(hi);
		
		demo.tryIt();
	}
}