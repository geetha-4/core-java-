class traingle extends Method{
	int base;
	int height;
	double traingle;
void Collectdata() {
	base=10;
	height=2;
	System.out.println("Enter the base: "+base);
	System.out.println("enter the height: "+height);
    }
	void Calculatedata() {
		traingle=base*height/2;
	}
	void Display() {
		System.out.println("traingle: "+traingle);
	}
}