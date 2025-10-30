/* James McKean
 *   10-30-2025
    Recursion 2 
 */


public class TestClass2 {
     public static void main(String[] args) {
        System.out.println(count8(884738328));
        System.out.println(countHi2("xhixhihihixhi"));
        System.out.println(stringClean("yyyffuuuuiillllloop"));
    } // end Main

    
    
    //recursive problem 3
    public static int count8(int n) {
        //base case
        
        
        if(n == 0)
            return 0;

        int lastDigit = n % 10;
        int secondLastDigit = (n / 10) % 10;

        if(lastDigit == 8) {
            if(secondLastDigit == 8)
                return 2 + count8(n / 10);
            else
                return 1 + count8(n / 10);
        }

        return count8(n / 10);
    } 
        

//___________________________________________________________________________
    


//recursive problem 4
     public static int countHi2(String str) {
        //base case
        if(str == null || str.length() <= 1)
            return 0;

        // If the string starts with "xhi" then the "hi" is not counted;
        // skip the "xhi" sequence and continue after it.
        if (str.startsWith("xhi")) {
            return countHi2(str.substring(3));
        }

        // If the string starts with "hi" (and it's not preceded by 'x'),
        // count it and continue after the "hi".
        if (str.startsWith("hi")) {
            return 1 + countHi2(str.substring(2));
        }

        // Otherwise, move forward by one character and keep searching.
        return countHi2(str.substring(1));
    } 
        

//________________________________________________________________________
    
    

    //recursive problem 5
    public static String stringClean(String str) {
        // handle null input explicitly
        if (str == null) return null;

        // base case: empty or single-character strings are already "clean"
        if (str.length() <= 1) return str;

        // recursively clean the tail
        String first = str.substring(0, 1);
        String restClean = stringClean(str.substring(1));

        // if the cleaned tail starts with the same char, skip the first char
        if (restClean.startsWith(first)) {
            return restClean;
        }

        // otherwise keep the first char followed by the cleaned tail
        return first + restClean;
    }
        

}