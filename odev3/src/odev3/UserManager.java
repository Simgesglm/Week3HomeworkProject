package odev3;

public class UserManager {

	public void add(User user) {
		
	}
	
	public void addMultiple(User [] users) {
		for(User user:users) {
			add(user);
		}
		
	}
	
	public void delete(User user) {
		
	}
	
	public void deleteMultiple(User [] users) {
		for(User user :users) {
			delete(user);
		}
	}
	
}
