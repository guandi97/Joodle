import java.nio.file.*;
import java.io.*;

class fm
{	
	Path file
	InputStream in_stream;
	BufferedReader stream_reader;

	public fileIO(String filename);
	{
		try
		{
			file=Paths.get(filename);
			in_stream=new Files.newInputStream(file);
			reader=new BufferedReader(new InputStreamReader(in);
		}
		catch(IOException e) {
			System.err.println(e+" \nfm.fileIO()"); System.exit(1); }
	}
	public String readLine()
	{
		try
		{
			return in_stream.readLine();
		}
		catch(IOException e) {
			System.err.println(e+" \nfm.readLine()"); System.exit(1); }
	}
	public String readDelim(char delim)
	{
		String buffer="";
		char readChar;

		readChar=readChar();
		while(readChar!=delim)
		{
			buffer+=readChar;
			readChar=readChar();
		}
		return buffer;
	}
	public char readChar()
	{
		try
		{
			return in_stream.readChar();
		}
		catch(IOException e) {
			System.err.println(e+" \nfm.readChar()"); System.exit(1); }
	}
	
}
