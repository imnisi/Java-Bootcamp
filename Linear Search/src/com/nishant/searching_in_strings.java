package com.nishant;

public class searching_in_strings {
    public static void main(String[] args){
        String Name = "Nishant";
        char target = 'i';
        System.out.print(searchingInString(Name, target));

    }

    static boolean searchingInString(String name, char target) {
        if(name.isEmpty())
            return false;

        //Iterating Using normal for loop
//        for (int i = 0; i < name.length(); i++) {
//            if(target == name.charAt(i))
//                return true;
//        }

        //Iterating using for each loop.
        for(char ch: name.toCharArray()) { //converting string into character array
            if (ch == target)
                return true;
        }
        return false;
    }
}
