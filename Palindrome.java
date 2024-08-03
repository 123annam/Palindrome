public class Palindrome {
    public static void main(String[] args)
    {
        String str1="annam";
        System.out.println(isPalindrome(str1));

    }
    static boolean isPalindrome(String str)
    {
        str.toLowerCase();
        for(int i=0;i<str.length()/2;i++)
        {
            int start=str.charAt(i);
            int end=str.charAt(str.length()-1-i);
            if(start!=end)
            {
                return false;
            }
        }
        return true;
    }
    
}