package nyay;

public class Sankhya
{

  public static void main(String[] args)
  {
	String str="I am a softwre tester";
	String vov="aeiou";
	int count=0;
	
	
	for(int i=0;i<vov.length();i++)
	{
		for(int j=0;j<str.length();j++)
		{
			if(vov.charAt(i)==str.charAt(j))
			{
				count++;
			}
		}
	}
	System.out.println("total vovels in he string is : "+count);
}
}



