package ders3Odev2;

public class StudentManager {

	public void addStudent(Student student) {
		System.out.println(student.getFirstName()+" "+student.getLastName()+" basariyla kayit oldunuz.");
	}
	
	public void deleteStudent(Student student) {
		System.out.println(student.getFirstName()+" "+student.getLastName()+" basariyla ogrenci kaydi silindi.");
	}
	
	public void registerCourse(Student student) {
		System.out.println("Merhaba "+student.getFirstName()+" . "+student.getCourseName()+" kursuna artik sahipsiniz.");
	}
	
	public void showStudents(Student[] students) {
        for (Student student : students) {
        	System.out.println("Isim : " + student.getFirstName());
            System.out.println("Soyisim: " + student.getLastName());
            System.out.println("Email: " + student.getEmail());
            System.out.println("------");
		}
 }
	
	
	
}
