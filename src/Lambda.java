
public class Lambda {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//ローカルクラス
		class Local1{
			public void sayHello() {
				System.out.println("Local Class1!!");
			}
		}
		//ローカルクラス
		class Local2 implements Runnable{
			public void run() {
				System.out.println("Local Class2!!");
			}
		}

		Local1 local = new Local1();
		local.sayHello();
		Runnable runner1 = new Local2();
		runner1.run();

		//無名クラス(クラス生成とインスタンス生成を同時に行う）
		//インタフェースを実装している必要がある
		Runnable runner2 = new Runnable() {
			public void run() {
				System.out.println("NoNamed Class!!");
			}
		};
		runner2.run();

		//ラムダ式
		//インスタンスとメソッドの宣言を省く
		Runnable runner3 = () -> System.out.println("Lambda Class!!");
		runner3.run();

		//クラスの生成
		class Local3 implements Test{
			public void writeString(String str) {
				System.out.println(str);
			}
		}
		Test l1 = (String str) -> System.out.println(str);

		Test local2 = new Local3();
		local2.writeString("OK!!");
		l1.writeString("Lambda OK!!");

	}
	interface Test{
		void writeString(String str);
	}

}
