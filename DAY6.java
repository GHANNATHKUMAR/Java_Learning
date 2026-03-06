public class DAY6 {
    public static void main(String[] args){
        // I have seen strings methods but String is immutable i.e you cannot directly insert anything int that  string you have to create a new string and assign it to the variable
        String s1="Hello world"; // string literal i.e in string pool
        // i want to change ny s1 using insert 
        StringBuilder sb=new StringBuilder(s1);
        sb.insert(5, " my name is ghan nath kumar");
        System.out.println(sb.toString()); // Hello my name is ghan nath kumar world
        // StringBuilder is a mutable class i.e you can directly insert anything in that string builder object and it will change the original string builder object
        // StringBuffer is also a mutable class i.e you can directly insert anything in that string buffer object and it will change the original string buffer object but it is thread safe i.e it is synchronized and it is slower than StringBuilder because of synchronization
        sb.append(s1);
        System.out.println(sb.toString()); // Hello my name is ghan nath kumar worldHello world
        sb.reverse();
        System.out.println(sb.toString()); // dlrow olleH ramuk htan nahg si eman ym olleH
        sb.replace(0, 5, "Hello"); // to replace a part of the string builder object we can use replace() method of StringBuilder class where 0 is the starting index and 5 is the ending index and Hello is the replacement string
        System.out.println(sb.toString()); // Hello olleH ramuk htan nahg si eman ym olleH
        System.out.println(sb.length()); // 49
        System.out.println(sb.charAt(0)); // H
        sb.delete(0, 5); // to delete a part of the string builder object we can use delete() method of StringBuilder class where 0 is the starting index and 5 is the ending index and 0 is inclusive and 5 is exclusive
        System.out.println(sb.toString()); // olleH ramuk htan nahg si eman ym olleH
        sb.deleteCharAt(0); // to delete a character at a specific index we can use deleteCharAt() method of StringBuilder class where 0 is the index of the character to be deleted
        System.out.println(sb.toString()); // lleH ramuk htan nahg si eman ym olleH
        sb.setCharAt(0, 'H'); // to set a character at a specific
        // index we can use setCharAt() method of StringBuilder class where 0 is the index of the character to be set and H is the character to be set
        System.out.println(sb.toString()); // HleH ramuk htan nahg si eman ym olleH
        sb.insert(5, " my name is ghan nath kumar"); // to
    // insert a string at a specific index we can use insert() method of StringBuilder class where 5 is the index at which the string is to be inserted and " my name is ghan nath kumar" is the string to be inserted
        System.out.println(sb.toString()); // HleH my name is ghan nath kumar ramuk htan nahg si eman ym olleH
        System.out.println(sb.capacity()); // 70 because the default capacity of a string builder object is 16 and when the capacity is exceeded it is doubled and the new capacity is 70 because the current length of the string builder object is 49 and when the capacity is exceeded it is doubled and the new capacity is 70
        sb.ensureCapacity(100); // to ensure that the capacity of the string builder object is at least 100 we can use ensureCapacity() method of StringBuilder class where 100 is the minimum capacity to be ensured
        System.out.println(sb.capacity()); // 100 because we have ensured that the capacity of the string builder object is at least 100
        // getchars() method of StringBuilder class is used to get a character at a specific index and it returns the character at the specified index
        char[] charArray=new char[10];
        sb.getChars(0, 10, charArray, 1); // to get a part of the string builder object as a character array we can use getChars() method of StringBuilder class where 1 is the starting index and 10 is the ending index and charArray is the character array to store the characters and 0 is the starting index of the character array
        System.out.println(charArray); // [ , H, l, e, H,  , m, y,  , n] because we have stored the characters from index 0 to 10 of the string builder object in the character array starting from index 1 of the character array and the first element of the character array is empty because we have not stored any character at index 0 of the character array
        // toString() method of StringBuilder class is used to convert the string builder object to
        // a string and it returns the string representation of the string builder object
        System.out.println(sb.toString());// HleH my name is ghan nath kumar ramuk htan nahg si eman ym olleH
    }
}
