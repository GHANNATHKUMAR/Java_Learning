class DAY5{
 public static void main(String[] args) {
   String A="HELLO";
    String b=new String("world");
    A=b;
    String c="ghannath";
    b=c;
    A=c;
    System.out.println(A);
    System.out.println(b);

    // strings methods 
    // 1. length()-> it is used to find the length of the string
    // 2.indexOf()-> it is used to find the index of the first occurrence of the specified character or substring in the string
    // 3.charAt()-> it is used to find the character at the specified index in the string
    // 4.trim()-> it is used to remove the leading and trailing spaces from the string
    // 5.equals()-> it is used to compare two strings for equality
    // 6.equalsIgnoreCase()-> it is used to compare two strings for equality ignoring case considerations
    //     7.concat()-> it is used to concatenate two strings
    //     8.toUpperCase()-> it is used to convert all the characters in the string to uppercase
    //     9.toLowerCase()-> it is used to convert all the characters in the string to lowercase
    //     10. escape characters-> it is used to represent special characters in the string like double quotes, single quotes, backslash etc.
    //     11. substring()-> it is used to extract a part of the string from the specified index to the end of the string or to the specified index
    //         12. replace()-> it is used to replace all the occurrences of the specified character or substring in the string with the specified character or substring
    //    13. startsWith()-> it is used to check if the string starts with the specified prefix
    //    14. endsWith()-> it is used to check if the string ends with the specified
    //   15. compareTo()-> it is used to compare two strings lexicographically and returns a negative integer, zero, or a positive integer as this string is less than, equal to, or greater than the specified object.
    //   16. parseInt()-> it is used to convert a string to an integer
    //   17. valueOf()-> it is used to convert a primitive data type to a string
    //     18. toString()-> it is used to convert a primitive data type to a string
    //     19 split()-> it is used to split the string into an array of substrings based on the specified delimiter
    //     20. toCharArray()-> it is used to convert the string to a character array
    // 21. replaceAll()-> it is used to replace all the occurrences of the specified regular expression in the string with the specified replacement
    // 22. isEmpty()-> it is used to check if the string is empty or not
    //23. isBlank()-> it is used to check if the string is blank or not it returns true if the string is empty or contains only white space characters
    
      String s="Hello wOrld";
    System.out.println(s.length());
    System.out.println(s.toUpperCase()); // HELLO WORLD
    System.out.println(s.toLowerCase()); // hello world
    String txt="WOrld";
    System.out.println(s.indexOf(txt)); //6
    s.charAt(0); //H
    String name="   ghan nath   ";
    System.out.println(name.trim());//ghn nath
    String s1="Hello world"; 
    System.out.println(s1.equals(c)); // false
    System.out.println(s1.equalsIgnoreCase("hello world")); // true
    String str1="Java"; // string literal i.e in string pool 
    String str2="Java"; // string literal i.e in string pool
    String str3=new String("Java"); // string object created using new keyword i.e in heap memory
    System.out.println(str1.equals(str2)); // true
    System.out.println(str1.equals(str3)); // true because equals() method compares the content of the string and str1, str2 and str3 have the same content "Java"
    System.out.println(str1==str2); // true because str1 and str2 are string literals and they refer to the same object in the string pool
    System.out.println(str1==str3); // false because str3 is created using new keyword and it refers to a different object in the heap memory




    System.out.println(s1+s); // Hello worldHello wOrld
    System.out.println(s1.concat(s)); // Hello worldHello wOrld

    // String s3="Hello my name is "ghannath" kumar"; // error because of double quotes in the string
    String s3="Hello my name is \"ghannath\" kumar"; // to use double quotes in the string we have to use escape character \ before the double quotes
    String s4="Hello my name is \'ghannath\' kumar"; // we can use single quotes in the string without any problem
    String s5="Hello my name is \\ghannath\\ kumar"; // to use backslash in the string we have to use escape character \ before the backslash
    System.out.println(s3); // Hello my name is "ghannath" kumar
    System.out.println(s4); // Hello my name is 'ghannath' kumar
    System.out.println(s5); // Hello my name is \ghannath\ kumar

    String p="Helloworld";
    System.out.println(p.substring(3,7)); // lo w  where 3 is inclusive and 7 is exclusive
    System.out.println(s.replace('H','h')); // hello world where H is replaced by h;
    System.out.println(s.replace("world","java")); // Hello java where world is replaced by java
    String txt1="Hello";
    System.out.println(s1.startsWith(txt1)); // true because s1 starts with Hello
    System.out.println(s1.endsWith("world")); // true because s1 ends with world
    System.out.println("apple".compareTo("banana")); // -1 because apple is less than banana
    System.out.println("banana".compareTo("apple")); // 1 because banana is greater than apple
    System.out.println("apple".compareTo("apple")); // 0 because both strings are equal 
    String s2="11122333";
    int messagedecode=Integer.parseInt(s2); // to convert string to integer we can use parseInt() method of Integer class
    System.out.println(messagedecode); // 11122333
    int num=100;
    String numString=String.valueOf(num); // to convert integer to string we can use valueOf() method of String class
    System.out.println(numString); // "100"
    // Integer.toString(num); // we can also use toString() method of Integer class to convert integer to string
    String numString2=Integer.toString(num);
    System.out.println(numString2); // "100"
     

    String s8="Hello my name is ghan nath kumar";
    String[] word=s8.split(" "); // to split the string into an array of substrings based on the specified delimiter we can use split() method of String class
    for(String word1:word){
        System.out.println(word1); // Hello my name is ghan nath kumar
    }
    String s6="Hello";
    char[] charArray=s6.toCharArray(); // to convert the string to a character array we can use toCharArray() method of String class
    for(char c1:charArray){
        System.out.println(c1); // H e l l o
    }

    String st5=" Hello world  ";
    System.out.println(st5.replaceAll("\\s","")); // Hello world where all the spaces are removed using replaceAll() method of String class and \\s is used to match any whitespace character
    String st6="Hello 6 world 8 9"; 
    System.out.println(st6.replaceAll("\\d","")); // Hello  world  9 where all the digits are removed using replaceAll() method of String class and \\d is used to match any digit
    System.out.println(st6.replaceAll("[^0-9]","")); // 689 where all the non-digit characters are removed using replaceAll() method of String class and \\D is used to match any non-digit character
    System.out.println(st6.replaceAll("[^a-zA-Z]","")); // Helloworld where all the non-alphabet characters are removed using replaceAll() method of String class and [^a-zA-Z] is used to match any non-alphabet character
    System.out.println(st6.replaceAll(" ","")); // Hello6world89 where all the spaces are removed using replaceAll() method of String class and " " is used to match space character
    String s9="";
    System.out.println(s9.isEmpty()); // true because s9 is an empty string
    String s10="   ";
    System.out.println(s10.isEmpty()); // false because s10 is not an empty string it contains spaces
    System.out.println(s10.isBlank()); // true because s10 is a blank string it contains only spaces
}
}