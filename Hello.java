
public class Hello {
	# just adding an additional comment
	# second comment to kick off scan
	# third comment and you know why
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
		System.out.println("Kicking off a new scan!");
	}

	public static void sayGoodbyeWorld() {
		System.out.println("Goodbye world!");
	}

	private static void foo() {
		System.out.println("Bar");
	}

}
