package odev3;

public class Main {

	public static void main(String[] args) {
		
		Instructor instructor =new Instructor();
		instructor.setId(1);
		instructor.setFristName("Engin");
		instructor.setLastName("Demirog");
		instructor.seteMail("enginddemirog@icloud.com");
		instructor.setPassword("123456");
		instructor.setProfession("Java,C#,Python");
		
		Student student = new Student();
		student.setId(2);
		student.setFristName("Simge");
		student.setLastName("Saglam");
		student.seteMail("simgesaglam@icloud.com");
		student.setPassword("789102");
		
		student.setStudentNumberString("123");
		
		InstructorManager instructorManager =new InstructorManager();
		
		instructorManager.add(instructor);
		instructorManager.delete(instructor);
		
		StudentManager studentManager =new StudentManager();
		
		studentManager.add(student);
		studentManager.delete(student);
		
		UserManager userManager =new UserManager();
		
		User [] users= {instructor,student};
		
		userManager.addMultiple(users);
		userManager.deleteMultiple(users);
			
		
		
	
		
		

	}

}
