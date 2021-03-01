package temp;

public class Authorization
	{

		public boolean Authorizeid(String username, String password)
			{
				if ((username.equals("harish")) && (password.equals("1234")))
					{
						return true;
					}

				else
					return false;
			}

	}
