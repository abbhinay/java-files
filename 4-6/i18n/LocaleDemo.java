import java.util.*;
class LocaleDemo
{
	public static void main(String[] arr)
	{
	try{
		Locale[] loc=Locale.getAvailableLocales();
		for(int i=0;i<loc.length;i++)
		{
		//System.out.println(loc[i]);
		System.out.println(loc[i].getDisplayLanguage()+" "+loc[i].getDisplayCountry());
		}
	}catch(Exception e)
	{
		System.out.println(e);
	}
	}
}