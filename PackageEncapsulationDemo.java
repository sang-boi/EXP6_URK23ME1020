package studentpack;
import studentpack.student;
public class PackageEncapsulationDemo {
	public static void main(String[] args) {
		student s = new student();
		s.setName("Aryan");
        s.setRegNo(6016);
        System.out.println("Student Name: " + s.getName());
        System.out.println("Register Number: " + s.getRegNo());

		
	}
}
