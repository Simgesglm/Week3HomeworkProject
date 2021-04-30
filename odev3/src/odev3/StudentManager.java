package odev3;

public class StudentManager extends UserManager {
	
	@Override
	public void add(User user) {
		System.out.println(user.getId() +" idli Ogrenci eklendi");
	}
	
	
	@Override
	public void delete(User user) {
		System.out.println(user.getId() +" idli ogrenci silindi");
	}

}
