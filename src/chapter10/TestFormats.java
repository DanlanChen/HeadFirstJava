package chapter10;

public class TestFormats {
	public static void main(String[] args){
		String s =  String.format("%,6.1f", 42.0000);
		System.out.println(s);
	}

}
