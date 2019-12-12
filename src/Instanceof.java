class X{}
class Y extends X{}
class Z extends Y{}

public class Instanceof {

	public static void check1(X obj) {
		System.out.println(obj instanceof X);
	}
	public static void check2(X obj) {
		System.out.println(obj instanceof Y);
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		X obj1 = new X();
		Y obj2 = new Y();
		Z obj3 = new Z(); //末端のサブクラスまでOK!!
		X obj4 = new Y(); //ポリモフィズム

		check1(obj1);
		check1(obj2);
		check1(obj3);

		System.out.println();

		check2(obj1); //スーパークラスはダメ!!
		check2(obj4); //instanceofはあくまでインスタンス、型ではない

	}

}
