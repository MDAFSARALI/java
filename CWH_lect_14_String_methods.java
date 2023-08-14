public class CWH_lect_14_String_methods {
    public static void main(String[] args) {
        // String name = " Afsar ";
        // Index start from zero but length starts with 1;
        // System.out.println(name);
        /*
         * name.length();
         * name.tolowercase();
         * name.touppercase();
         * name.trim();---->returns new string after removing all the leading and
         * traling spaces from the original string
         * name.substring(int start);-------->Ye line string ko start ka jo number diya
         * hua hai wha se le kar last tak print karega..
         * name.substring(int start,int end);---->Returns a substring from start index
         * to end index .Strt index is inclided and end index is excluded...
         * name.replace('r','p');------>Returns a new string after replacing r with p .
         * name.startswith("WORD/STRING");-------->It will check weither the starting is
         * true or false...
         * System.out.println(name2.endsWith("r"));---->It will check weither the ends
         * is true or false...
         * name.charAt(int no/position);----->Return character at a given index position
         * ....
         * name.indexOf(string s);------>Ye ye batayega ki pehla s ka index konsa hai
         * .......
         * name.indexOf("s", 4);-------->Returns the index of the given string starting from the index (int). IF not matched then -1 is returned in this case....
         * name.lastIndexOf("s",2); It returns the last position where the string or the character is present ......> Seaching started from the last...
         * System.out.println(name2.equalsIgnoreCase("AFSAR"));----------->It ignores the lower or upper case it only check wether the string is qual or not.....by ignoring the case||
         */
        /*
         * int value =name.length();
         * System.out.println(value);
         * String valuels=name.toLowerCase();
         * System.out.println(valuels);
         * String valueup=name.toUpperCase();
         * System.out.println(valueup);
         * // System.out.println(name);---------->This line proves thastring of name the
         * string is immutable bcz the original and now is same.
         * String valuetrm=name.trim();
         * System.out.println(valuetrm);// ye line aage or piche ka line me se space
         * hata kar baki sab ko print kardega but agar beach me hoga to nahi hata sakta
         * ...
         * 
         * 
         */
        // String name2 = "Afsar";
        // String a = name2.substring(3);// Beaging index 3 so string from zero to 2
        // takprint nahi hoga but 3 se last tak
        // // print hoga ...
        // // If substring (0); karenge to pura string hi print ho jayega ....
        // System.out.println(a);
        // System.out.println(name2.substring(1, 5));
        // System.out.println(name2.replace('r', '?'));// It replaces all the value of r
        // with ? no matter how many times it
        // // is present ......
        // System.out.println(name2.replace("sar", "zal"));// It replaces the all sar to
        // zal ......
        // System.out.println(name2.replace("r", "Bhai"));// It replaces all r with
        // "Bhai"......
        // System.out.println(name2.startsWith("Af"));//--------->It returns true or
        // false .....
        String name2 = "Afsar";
        // System.out.println(name2.endsWith("sar"));
        // System.out.println(name2.charAt(2));
        // System.out.println(name2.indexOf('s'));// It will return 2 because index
        // strts with 0;
        //System.out.println(name2.indexOf("sa"));
        //System.out.println(name2.indexOf("s", 0));// Try it by diffrent value of index you will undestand it definitely.....
        //System.out.println(name2.lastIndexOf("s"));// If something is not present then returns -1:
        //System.out.println(name2.lastIndexOf("s",3));
        //System.out.println(name2.equals("Afsar"));
        System.out.println(name2.equalsIgnoreCase("AFSAR"));
        System.out.println("I am escape \"double quote");
        // READ THE NOTES OF HARRY::::::
    }
}
