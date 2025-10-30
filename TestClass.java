/* James McKean
    10-28-2025
    Recursion */


public class TestClass{


public static void main(String[] args) {

    System.out.println(countHi("xxhixxxxhixxxx"));
    System.out.println(strCount("ashgoahsgjoabgoabg", "goa"));

} // end Main

// recursive problem 1
public static int countHi(String str) {
    
    // Check for null string
    if(str == null)
        return 0;
    
    // Base Case
    if(str.length() <= 1)
        return 0;

    char firstLetter = str.charAt(0);
    char secondLetter = str.charAt(1);
    if(firstLetter == 'h' && secondLetter == 'i')
        return 1 + countHi(str.substring(2));

    return countHi(str.substring(1));
}

//recursive problem 2
public static int strCount(String str, String sub) {

    //base case
    if(str == null || sub == null)
        return 0;
    
    // protect against empty sub (problem states non-empty sub, but be defensive)
    if (sub.length() == 0) return 0;

    if (str.length() < sub.length())
        return 0;

    int subLength = sub.length();
    // use startsWith for clarity
    if (str.startsWith(sub)) {
        // found one non-overlapping occurrence: skip past the matched substring
        return 1 + strCount(str.substring(subLength), sub);
    }

    // no match at the front: advance by one character and continue searching
    return strCount(str.substring(1), sub);

}

}