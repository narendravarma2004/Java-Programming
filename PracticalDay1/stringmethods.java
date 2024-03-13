public class stringmethods {
    public static void main(String[] args) {
        String str1 = new String();
        String str2 = new String("Vishnu");
        char[] charArray = {'V', 'a', 'r', 'm', 'a'};
        String str3 = new String(charArray);
        byte[] byteArray = {78, 66, 67, 68, 69};
        String str4 = new String(byteArray);
        System.out.println("String Constructors:");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("str3: " + str3);
        System.out.println("str4: " + str4);
        String original = "Hello World";
        System.out.println("\nString Methods:");
        System.out.println("Original String: " + original);
        System.out.println("Length: " + original.length());
        String concatString = original.concat("!");
        System.out.println("Concatenated String: " + concatString);
        String substring = original.substring(6);
        System.out.println("Substring from index 6: " + substring);
        char charAt6 = original.charAt(5);
        System.out.println("Character at index 5: " + charAt6);
        int indexOfW = original.indexOf('W');
        System.out.println("Index of 'W': " + indexOfW);
        int indexOfl = original.indexOf('l', 6);
        System.out.println("Index of 'l' after index 4: " + indexOfl);
        String replacedString = original.replace('l', 'L');
        System.out.println("String after replacing 'l' with 'L': " + replacedString);
        String upperCaseString = original.toUpperCase();
        System.out.println("Uppercase String: " + upperCaseString);
        String lowerCaseString = original.toLowerCase();
        System.out.println("Lowercase String: " + lowerCaseString);
        String stringWithSpaces = " Trimmed String ";
        String trimmedString = stringWithSpaces.trim();
        System.out.println("Trimmed String: '" + trimmedString + "'");
        String str5 = "Hello";
        String str6 = "hello";
        System.out.println("Comparison of str2 and str5 (case sensitive): " + str2.equals(str5));
        System.out.println("Comparison of str2 and str6 (case insensitive): " +
                str2.equalsIgnoreCase(str6));
        System.out.println("Does str2 start with 'He'?: " + str2.startsWith("Vi"));
        System.out.println("Does str2 end with 'lo'?: " + str2.endsWith("nu"));
    }
}
