import java.io.FILE;
import java.util.regex.*;

class us
{

	public 

	fileIO profile_user;

	public us(String profile)
	{
		fileIO profile_io=new fileIO("./profiles/Profiles");

		String profile=profile_io.readLine();
		while(profile.matches(^profile)!=true)
		{
			String profile=profile_io.readLine();
			if(profile==null) continue;
		}
		if(profile!=null) profile_exists(profile);
		else profile_new(profile);
	}
	private void profile_exists(String profile)
	{
		String profile_arr[]=profile.split("\\s");
		profile_user=new fileIO("./profiles/"+profile_arr[1]);
	}
	private String profile_new(String profile)
	{
		
	}
	public config
}
