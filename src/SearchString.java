
public class SearchString {

	public static void main(String[] args) {
		String st1 = "Hello There";
		int search = st1.indexOf("Hello");
		System.out.println(search);
		if(search == -1) {
			System.out.println("not found");
		} else {
			System.out.println("Found" + search);
		}

	}

}
