abstract class plane{
	void takeoff() {
		System.out.println("plane tookoff");
	}
	abstract void fly();
	void land() {
		System.out.println("plane landed");
	}
}
class Cargoplane extends plane{
	@Override
	void fly() {
		System.out.println("Cargo plane tookoff");
	}
}
public class objectclassindirectly{
	public static void main(String[] args)
	{
		Cargoplane p=new Cargoplane();
		p.takeoff();
		p.fly();
		p.land();
		plane ref=new plane() {
			@Override
			void fly() {
				System.out.println("plane flew");
			}
		};
		        ref.fly();
			}
		}

