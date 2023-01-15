package test;

public class Method {
//	public static void main(String[] args) {
//		sayHello();
//	}
//	
//	public static void sayHello() {
//		// public(アクセス修飾子),static(static修飾子)に続けて、返り値のデータ型、メソッド名を記述
//		// voidは返り値がない場合の記述
//		System.out.println("Hello World");
//	}
	
	public static void main(String[] args) {
		var answer = square(5);
		System.out.println(answer);
	}
	
	public static int square(int number) {
		return number * number;
	}
}
