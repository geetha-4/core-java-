class rectangle extends Method{
	double length;
	double breath;
	double rectangle;
   void Collectdata() {
	   length=2;
	   breath=4;
	System.out.println("Enter the length: "+length);
	System.out.println("enter the breath: "+breath);
    }
	void Calculatedata() {
		rectangle=length*breath;
	}
	void Display() {
		System.out.println("rectangle: "+rectangle);
	}
	}
