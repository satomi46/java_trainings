package test;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("Hello World");
		int radius;
		radius = 5;
		System.out.println(radius * radius *3.14);
		
		var radiusSecond = 5;
		System.out.println(radiusSecond * radiusSecond * 3.14);

		System.out.println(((Object)radiusSecond).getClass().getSimpleName());
		System.out.println(600 * 4);
		System.out.println(6 / 3);
		System.out.println(6 % 5);
	}

}
