import java.util.Objects;

public class DaneLogowania {

	/**
	 * 
	 * @param login
	 */
	public boolean checklogin(String login) {

		boolean exist=false;
		for(User user: Users.user)
		{
			if(user.login==login)
			{
				exist=true;
				break;
			}
		}
		return exist;
	}

	/**
	 * 
	 * @param login
	 * @param password
	 */
	public boolean logattempt(String login, String password) {

		boolean accepted=false;
		for(User user: Users.user)
		{
			if(Objects.equals(user.login, login) && Objects.equals(user.password, password))
			{
				accepted=true;
				break;
			}
		}
		return accepted;
	}

	/**
	 * 
	 * @param login
	 * @param password
	 */
	public boolean getprivilege(String login, String password) {

		boolean privileged=false;
		for(User user: Users.user)
		{
			if(Objects.equals(user.login, login) && Objects.equals(user.password, password))
			{
				privileged=user.privileged;
				break;
			}
		}
		return privileged;
	}

}