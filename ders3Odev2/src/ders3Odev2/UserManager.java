package ders3Odev2;

public class UserManager {
	
	public void add(User user) {
		System.out.println(user.getId()+" numarali kullanıcı eklendi.");
	}
	
	public void delete(User user) {
		System.out.println(user.getId()+" numarali kullanıcı silindi.");
	}
	
	public void addMultipleUser(User[] users) {
		for (User user : users) {
			add(user);
		}
	}

}
