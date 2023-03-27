class S3{
	float length;
	float breadth;
	void getdata(float a, float b){
	length  = a;
	breadth = b;
	   }
}
class S3a{
	public static void main(String args[]){
		//System.out.println("Area of Rectangle");
	float Area;
			S3 a = new S3();
			S3 b = new S3();
			a.getdata(14, 10);
			Area=a.length * a.breadth;
			System.out.println("Area of Rectangle =" +Area);
	}
}	