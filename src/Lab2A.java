        //Class: CSE 1321L
        //Section: ...
        ///Term: ...
        //Instructor: ...
        //Name: ...
        //Lab#: ...

import java.util.Scanner; //imports scanner class

public class Lab2A {
    public static void main(String[] args) {

        //declares scanner and variables
        Scanner scan = new Scanner(System.in);
        String strName1;
        String strName2;
        String strVerb;
        String strAdverb;

        //Gets input for variables
        System.out.print("Enter a name: ");
        strName1 = scan.nextLine();
        System.out.print("Enter another name: ");
        strName2 = scan.nextLine();
        System.out.print("Enter a verb: ");
        strVerb = scan.nextLine();
        System.out.print("Enter an adverb: ");
        strAdverb = scan.nextLine();

        //output
        System.out.println("Once upon a time, there was a person named " + strName1 + " who had a child named " + strName2 + ". This child would " + strVerb + " " + strAdverb + " while singing to strangers.");
    }
}
