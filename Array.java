package test;

import java.util.ArrayList;

public class Array {
	public static void main(String[] args) {
		int[] scores;
		scores = new int[3]; // int型の要素を3つ作成している
		// 上記2行を1行で記述することもできる
		// int[] scores = new int[3];
		
		// 型推論を使用できる
		// var scores = new int[3];
		
		// 配列の宣言から値の代入まで行う
		// int[] scores = {1, 5, 10}
		
		scores[0] = 1;
		scores[1] = 5;
		scores[2] = 10;
		
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[2]);
				

		// ArrayListの使用にはライブラリが必要。3行目がインポート文。

		// 宣言と初期化
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(1); // addメソッドでArrayListの末尾に要素を追加する
		numbers.add(5);
		numbers.add(10);
		numbers.add(15);
		
		System.out.println(numbers.get(0)); // getメソッドで指定したindexの要素を取得する
		System.out.println(numbers.get(1));
		System.out.println(numbers.get(2));
		System.out.println(numbers.get(3));
	}

}
