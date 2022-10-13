public class CustomStringMethods
{
    /* this class has no instance variables */

    /* Constructor with no parameters, and since there are no instance variables to initialize,
              the constructor body is "empty" */
    public CustomStringMethods() { }


// WRITE AND TEST THE FOUR METHODS BELOW!

    /* Client provides searchFor and searchIn and method returns true if searchFor
              is located somewhere in searchIn , and returns false otherwise.

              For example, if searchFor is ple and searchIn is apples, this method returns true.
              If searchFor is hello and searchIn is apples, this method returns false.
     */
    public boolean foundIn(String searchFor, String searchIn) {
        if (searchIn.indexOf(searchFor) == -1){
            return false;
        }
        else{
            return true;
        }
    }


    /* Client provides myString and maxLength and method returns true if the length of myString
              exceeds maxLength, and returns false otherwise.

              For example, if myString is apples and maxLength is 5, this method returns true.
              if myString is apples and maxLength is 6, this method returns false.
        */
    public boolean longerThan(String myString, int maxLength) {
        if (myString.length() > maxLength){
            return true;
        }
        else {
            return false;
        }
    }


    /* Client provides str and idx and method returns a new String created by appending
              the character located at index idx of str to the beginning of str and the end of str

               For example, if str is apples and idx is 4, this method returns the string eapplese
               If str is apples and idx is 0, this method returns the string aapplesa
     */
    public String funnyString(String str, int idx) {
        String letter = str.substring(idx, idx +1);
        return letter + str + letter;
    }

    /* Client provides a single word as orig and the method returns a String that represents orig
              written in “Pig Latin”, which means that the first letter of the word is removed from the front and
              added to the end, and then “ay” is appended.

              For example, if orig is bananas, then the method returns the “Pig Latin” version, ananasbay
    */
    public String pigLatin(String orig) {
        String firstLetter = orig.substring(0, 1);
        String tempWord = orig.substring(1);
        String finalWord = tempWord + firstLetter + "ay";
        return finalWord;
    }

    //Bonus challenge
    public String starBetween(String str){
        int i = 0;
        String newString = "";
        while (i < str.length()){
            newString += str.substring(i, i+1);
            if (i != str.length() -1){
                newString += " * ";
            }
            i++;
        }
        return newString;
    }
}

