class circle extends Method{
	double radius;
	static double pi;
	double area;
	static {
		pi=3.17;
	}
	void Collectdata() {
		radius=5;
		System.out.println("Enter the radius: "+radius);
	    }
		void Calculatedata() {
			area=pi*radius*radius;
		}
		void Display() {
			System.out.println("area: "+area);
		}
	}

