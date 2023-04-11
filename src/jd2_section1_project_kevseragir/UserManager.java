package jd2_section1_project_kevseragir;



	import java.util.ArrayList;
	import java.util.List;

	public class UserManager extends User{

		
		List<Object> Users	=new ArrayList<>();	//KullanıcıDizisi


	public UserManager(Long id, String userName, String password, String email) {
			super(id, userName, password, email);
		}

	public void delete(Long id) {
		System.out.println(id + " Silindi");	

	}

	public void search(Long id) {
	System.out.println(id + " Arandı");	
	}

	public void add(User user) {
	Users.add(user.getId() + user.getEmail() + user.getPassword() + user.getUserName());
	}
		Object [] userLogin = new Object [4];
		
	public void log(User user_) {
		userLogin[0]=user_.getId();
		userLogin[1]=user_.getEmail();
		userLogin[2]=user_.getUserName();
		userLogin[3]=user_.getPassword();

	}

	}



