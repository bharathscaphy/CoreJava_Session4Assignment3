
public class EncapsMain {

	public static void main(String[] args) {
		Encapsulation ob=new Encapsulation();
		ob.setEmpID(1245);
		ob.setEmpName("Bharath");
		ob.setEmpAge(21);
		System.out.println("Employee Id:"+ ob.getEmpID());
		System.out.println("Employee Name:"+ ob.getEmpName());
		System.out.println("Employee Age:"+ ob.getEmpAge());
	}
}
