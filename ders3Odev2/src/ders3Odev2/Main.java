package ders3Odev2;

public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.setId(1);
		student1.setFirstName("Ali");
		student1.setLastName("Konar");
		student1.setEmail("ali@ali.com");
		student1.setPasword("ali282828");
		student1.setCourseName("C#");
		
		Student student2 = new Student();
		student2.setId(2);
		student2.setFirstName("Melek Nur");
		student2.setLastName("Gul");
		student2.setEmail("melek@ali.com");
		student2.setPasword("melek282828");
		student2.setCourseName("Sosyoloji");
		
		Instructor instructor1= new Instructor();
		instructor1.setId(21001);
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demirog");
		instructor1.setEmail("engin.demirog@engin.com");
		instructor1.setPasword("engin212121");
		instructor1.setNumberOfStudent(1548);
		instructor1.setCourseName("Java, C#, Python, Ruby");
		
		Instructor instructor2= new Instructor();
		instructor2.setId(81002);
		instructor2.setFirstName("Atil");
		instructor2.setLastName("Samancioglu");
		instructor2.setEmail("atil@atil.com");
		instructor2.setPasword("atil1234");
		instructor2.setNumberOfStudent(1548);
		instructor2.setCourseName("Python, Java, Big Data, TenserFlow");
		
		Student[] students= {student1, student2};
		
		StudentManager studentManager= new StudentManager();
		studentManager.addStudent(student1);
		System.out.println("--------");
		studentManager.registerCourse(student1);
		System.out.println("--------");
		studentManager.deleteStudent(student2);
		System.out.println("--------");
		studentManager.showStudents(students);
		
		
		Instructor[] instructors= {instructor1, instructor2};
		
		InstructorManager instructorManager= new InstructorManager();
		instructorManager.addInstructor(instructor1);
		System.out.println("--------");
		instructorManager.addCourse(instructor1);
		System.out.println("--------");
		instructorManager.getNumberOfStudent(instructor2);
		System.out.println("--------");
		
		instructorManager.showInstructors(instructors);
		
		
		UserManager userManager = new UserManager();
		userManager.add(instructor1);
		System.out.println("--------");
		userManager.delete(student2);
		System.out.println("--------");
		userManager.addMultipleUser(instructors);
		
		
		

	}

}



//Kodlama.io projesini yazdığınızı düşünelim.

//User, Instructor, Student nesnelerini modelleyiniz. (Class-Inheritance)

//UserManager, InstructorManager, StudentManager için sistemde olabilecek operasyonları tahminleyip modelleyiniz. (Class-Inheritance-Method)

//Kural -- Sadece gördüğümüz konulardan yararlanmalısınız.
