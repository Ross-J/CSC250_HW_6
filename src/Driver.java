import java.net.URL;
import java.util.Scanner;

public class Driver 
{
	public static void main(String[] args)
	{
		HearthstoneCardObject c1 = new HearthstoneCardObject("Armor Vendor", 1, 1, 3);
		HearthstoneCardObject c2 = new HearthstoneCardObject("Wandmaker", 2, 2, 2);
		
		c1.display();
		c2.display();
		
		String getJson = Driver.getJSON("https://api.hearthstonejson.com/v1/25770/enUS/cards.json");
		System.out.println(getJson);
	}
	
	static String getJSON(String urlString)
	{
		String line = "";
		try
		{
			URL url = new URL(urlString);
			Scanner input = new Scanner(url.openStream());

			while (input.hasNext())
			{
				line += input.nextLine();
			}

			input.close();
			}
		catch(Exception e)
		{
			e.printStackTrace();
			line = "Can't Connect";
		}
			return line;
	}
}
