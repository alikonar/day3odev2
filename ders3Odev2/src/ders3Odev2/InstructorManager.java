package ders3Odev2;


public class InstructorManager {
	
	public void addInstructor(Instructor instructor) {
		System.out.println(instructor.getFirstName()+" "+instructor.getLastName()+" eklendi.");
	}
	
	public void addCourse(Instructor instructor) {
		System.out.println("Merhaba "+instructor.getFirstName()+" . "+instructor.getCourseName()+" kursları başarıyla eklendi.");
	}
	
	public void addMultipleCourse(Instructor[] instructors) {
		for (Instructor instructor : instructors) {
			addCourse(instructor);
		}
	}
	
	public void getNumberOfStudent(Instructor instructor) {
		System.out.println("Merhaba "+instructor.getFirstName()+" . "+"Mevcut ogrenci sayiniz : "+instructor.getNumberOfStudent());
	}
	 public void showInstructors(Instructor[] instructors) {
	        System.out.println("--Eğitmenler--");
	        System.out.println("-----");
		 	for (Instructor instructor : instructors) {	        	
	        	System.out.println("Isim : " + instructor.getFirstName());
		        System.out.println("Soyisim: " + instructor.getLastName());
		        System.out.println("Email: " + instructor.getEmail());
		        System.out.println("-------");
			}
		 	
	 }

}
