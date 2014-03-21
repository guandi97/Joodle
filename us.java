import java.io.FILE;
import java.util.regex.*;

class us
{
	fileIO profile_user;
	public us(String profile)
	{
		{	
			fileIO profile_io=new fileIO("./profiles/Profiles");

			String profile=profile_io.readLine();
			while(profile.matches(^profile)!=true)
			{
				String profile=profile_io.readLine();
			}
		}

		String profile_arr[]=profile.split("\\s");
		profile_user=new fileIO("./profiles/"+profile_arr[1]);
	}
	public config
