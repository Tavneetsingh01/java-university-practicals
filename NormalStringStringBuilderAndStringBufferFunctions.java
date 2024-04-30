public class NormalStringStringBuilderAndStringBufferFunctions {
    public static void main(String[] args) {
        String str1 = "IBM research";
        String str2 = "Microsoft";
        StringBuilder SBuild1 = new StringBuilder(str2);

        System.out.println("\nNormal String value that we have taken is: "+ str1);
        System.out.println("Applying some function on normal string:");
        System.out.println("After Capitalization of every character in string we get: "+ str1.toUpperCase());
        System.out.println("After lower casing of every character in string we get: "+ str1.toLowerCase());
        System.out.println("Getting length of the entered string which is: "+ str1.length());
        String[] words = str1.split("");
        System.out.println("After splitting words present in string based on space we get: ");
        for(String w: words){
            System.out.println(w);
        }

        System.out.println("String Builder value we have taken here " + SBuild1);
        System.out.println("\nSome Functions applied on String Builder are follows:");
        System.out.println("Reversing String Builder new value is: " + SBuild1.reverse());
        System.out.println("Checking index of a particular character (s) in String Builder " + SBuild1.reverse().indexOf("s"));
        System.out.println("Replacing some part of string with another " + SBuild1.replace(5, 8, "hard"));
        System.out.println("Appending another string to the previous StringBuilder variable: " + SBuild1.append("ia a good company"));


        StringBuffer SBuffer = new StringBuffer("Windows 11");
        SBuffer.append(" is pretty good");
        System.out.println("\nString Buffer value we have taken here is " + SBuffer);
        System.out.println("\nSome Functions applied on String Builder are follows:");
        System.out.println("Reverse of the string Using String Buffer is: " + SBuffer.reverse());
        System.out.println("Deleting the character at particular index in string using String buffer is: " + (SBuffer.reverse()).deleteCharAt(6));
        System.out.println("Character in SBuffer at index 2 is:  " + SBuffer.charAt(2));
        System.out.println("Character W in SBuffer at index 2 is:  " + SBuffer.indexOf("w"));
        System.out.println("Are SBuffer and SBuilder strings are equal:  " + SBuffer.equals(SBuild1));

    }
}
