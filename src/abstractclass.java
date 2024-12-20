abstract class Plane{
	void takeoff() {
		System.out.println("Plane tookoff");
	}
	abstract void fly();
	void land() {
		System.out.println("Plane landed");
	}
}
class CargoPlane extends Plane{
	@Override
	void fly() {
		System.out.println("Cargo Plane tookoff");
	}
}
public class abstractclass{
	public static void main(String[] args) {
		CargoPlane p=new CargoPlane();
		p.takeoff();
		p.fly();
		p.land();
	}
}
