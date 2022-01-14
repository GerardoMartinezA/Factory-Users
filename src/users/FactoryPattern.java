package users;

public class FactoryPattern {
	
	public static void main(String[] args) {
		UserFactory userFactory = new UserFactory();
		
		Users user1 = userFactory.getUsers("PROJECTLEADER");
		user1.create();
		
		Users user2 = userFactory.getUsers("FUNCTIONALANALYST");
		user2.create();
		
		Users user3 = userFactory.getUsers("DEVELOPER");
		user3.create();
		
		Users user4 = userFactory.getUsers("QA");
		user4.create();
		
		Users user5= userFactory.getUsers("ERS");
		user5.create();
	}

}
