import java.util.Scanner;

public class samepattern 
{
        public static boolean check() 
        {
            System.out.println("Please enter your first string:");
		
		    Scanner sc = new Scanner(System.in);
            String str1 = sc.nextLine();

            System.out.println("Please enter your second string:");

            Scanner sd = new Scanner(System.in);
            String str2 = sd.nextLine();

            if (str1.length() != str2.length())
            {
                return false;
            }
            
            boolean dgr = true;
            
            for (int i=0; i<str1.length(); i++)
            {

                for(int j=0; j<str1.length(); j++)
                {
                    if (str1.charAt(j) == str1.charAt(i) && str2.charAt(j) != str2.charAt(i))
                    {
                        dgr=false;
                    }
                    else if (str1.charAt(j) != str1.charAt(i) && str2.charAt(j) == str2.charAt(i)) 
                    {
                        dgr=false;
                    }
                }
            }
            
            if (dgr == true) return true;
            
            else return false;
        }

    public static void main(String[] args) 
        {
            if(check()) 
            {
            	System.out.println("True");
            }
            
            else System.out.println("False");
        }

}