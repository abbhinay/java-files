import java.util.*;
class LocaleDemo1
{
	public static void main(String[] arr)
	{
		try{
		Locale[] l=Locale.getAvailableLocales();
		for(int i=0;i<l.length;i++)
		{
			System.out.println(l[i].getDisplayLanguage()+"\t"+l[i].getDisplayCountry());
		}
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
