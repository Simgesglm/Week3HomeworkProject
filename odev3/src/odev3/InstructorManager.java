package odev3;

public class InstructorManager extends UserManager {
	
	@Override
	public void add(User user) {
		System.out.println(user.getId() +" idli egitmen eklendi");
	}
	
	@Override
	public void delete(User user) {
		System.out.println(user.getId() +" idli egitmen silindi");
	}

}
