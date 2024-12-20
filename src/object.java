
public class object {
		public static void main(String[] args)
		{
			cargo p=new cargo();
			p.takeoff();
			p.fly();
			p.land();
			plan ref=new plan() {
				@Override
				void fly() {
					System.out.println("plane flew");
				}
			};
			        ref.fly();
				}
			}



