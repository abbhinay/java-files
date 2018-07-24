class StringDemo1
{
	public static void main(String[] arr)
	{
		String s1=new String("aligarh");
		System.out.println(s1.toUpperCase());
		System.out.println(s1.length());
		byte[] b=s1.getBytes();
		for(int i=0;i<b.length;i++)
		System.out.println((char)b[i]);
		char[] c=s1.toCharArray();
		for(char t:c)
		System.out.println(t);
		System.out.println(s1.charAt(2));
		System.out.println(s1.concat("city"));
		String s2="          hello";
		System.out.println("with space: "+s2);
		System.out.println("without space: "+s2.trim());	
		String s3="humpty dumpty sat on a bridge";
		String[] t=s3.split(" ");
		for(String p:t)
		System.out.println(p);
		System.out.println("first index of a in aligarh: "+s1.indexOf('a'));
		System.out.println("last index of a in aligarh: "+s1.lastIndexOf('a'));
		System.out.println(s3.substring(4));
		System.out.println(s3.substring(4,12));
		System.out.println(s1.replace('a','Q'));
		System.out.println(s1.equals("aligarh"));
		System.out.println(s1.equalsIgnoreCase("Aligarh"));
	}
}