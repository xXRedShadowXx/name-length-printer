/*
*R. Daffern
*This program checks the client's current order being processed
*last update 4/12/19
*/

import java.util.*;

public class github
{
    public static void main(String[] args)
    {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Whats your pet's name: ");
        String name = input.nextLine();
        
        int length = name.length();
        System.out.println("Hello, your pet's name is " + name + "your pet's name has" + length + "letters in your name.");
 
    }
}
