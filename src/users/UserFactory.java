package users;

public class UserFactory {
	
	public Users getUsers(String userType) {
		if (userType == null) {
			return null;
		}
		if (userType.equalsIgnoreCase("PROJECTLEADER")) {
			return new ProjectLeader();
		} else if (userType.equalsIgnoreCase("FUNCTIONALANALYST")) {
			return new FunctionalAnalyst();
		} else if (userType.equalsIgnoreCase("DEVELOPER")) {
			return new Developer();
		} else if (userType.equalsIgnoreCase("QA")) {
			return new QA();
		}
		else if (userType.equalsIgnoreCase("ERS")) {
			return new ERS();
		}
		return null;
	}

}
