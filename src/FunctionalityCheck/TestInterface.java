package FunctionalityCheck;

public class TestInterface implements Show {

	@Override
	public void print() {
		System.out.println("Print from the print interface");
	}

	@Override
	public void ShowInterface() {
		System.out.println("Show+ from the Show Interface");
		
	}

	public static void main(String[] args) {
		
		TestInterface TInt =new TestInterface();
		TInt.print();
		TInt.ShowInterface();

	}

	

}
