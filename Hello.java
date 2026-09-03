
public class Hello {
	# just adding an additional comment
	public static void main(String[] args){
		for (int i = 0; i < 10; i++) {
			sayHelloWorld();
		}
		for (int i = 0; i < 10; i++) {
			sayGoodbyeWorld();
		}
	}

	public static void sayHelloWorld() {
		System.out.println("Hello world!");
	}

	public static void sayGoodbyeWorld() {
		System.out.println("Goodbye world!");
	}

	private static void foo() {
		System.out.println("Bar");
	}

}
