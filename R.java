class Student
{

}
class customer
{

}
class R{
	public static void main(String[] args) throws Exception{
		Object o = Class.forName(args[0]).newInstance();
		System.out.println(" object created :" +o.getClass().getName());
	}
}
  