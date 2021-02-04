public class MyMain {
    // This method adds up the values of all digits
    // in x, recursively
    public static int addDigits(int x) { 
        int y = 0;
        if (x < 10)
        {
            return x;
        }
        else
        {
            int a = x / 10;
            int b = x % 10;
            y = y + b;
            return addDigits(a) + y;
        }
    }


    // This method checks if a String is a palindrome
    // (e.g. "racecar", "madam"), recursively
    public static boolean isPalindrome(String str) { 
        if (str.length() == 0 || str.length() == 1)
        {
            return true;
        }
        else 
        {
            if (str.charAt(0) == str.charAt(str.length()- 1))
            {
                return isPalindrome(str.substring(1, str.length() - 1));
            }
            
        }
        return false;
        //return true;
        
    }

    // This method returns the orignal string reversed;
    // this method should be written using recursion
    public static String reverse(String str) { 
        if (str.length() == 1)
        {
            return str;
        }
        else
        {
           //char a = str.charAt(0);
            char b = str.charAt(str.length() - 1);
            String final1 = b + reverse(str.substring(0, str.length()-1));
            return final1;
            
        }
    }

    public static void main(String[] args) {
        System.out.println(addDigits(167));
    }
}
