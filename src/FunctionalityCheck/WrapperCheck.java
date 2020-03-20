package FunctionalityCheck;

public class WrapperCheck {

	public static void main(String[] args) {
		
		byte b=10;
		short s=20;
		int i=30;
		double d= 40.0D;
		float f=50.0F;
		char c='c';
		long l=60;
		boolean b2= true;
		
		//initilize wrapper class with primitive object value
		
		Byte byteobj =b;
		Short shortobj=s;
		Integer intobj=i;
		Double doubleobj=d;
		Float floatobj=f;
		Character charobj =c;
		Boolean booleanobj=b2;
		Long longobject=l;
		
		//Print the object value
		System.out.println("Byte object value "+byteobj);
		System.out.println("Short object value "+shortobj);
		System.out.println("Integer object value "+intobj);
		System.out.println("Double object value "+doubleobj);
		System.out.println("Float object value "+floatobj);
		System.out.println("Character object value "+charobj);
		System.out.println("Boolean oject value "+booleanobj);
		System.out.println("Long object value "+longobject);
		
		
		System.out.println("First argument "+args[1]);
		

	}

}
