package net.greet;

import java.util.HashMap;

public class Greet {

    HashMap<String, Integer> greetMap = new HashMap<>();

    public void greetNames(String name, String language){

        if (!greetMap.containsKey(name)){
            greetMap.put(name,1);
        }
        else if (greetMap.containsKey(name)) {
                greetMap.put(name, greetMap.get(name + 1));
            }
        System.out.println(Languages.valueOf(language).getLang() + name);
    }
    public int counter(){
        int count = greetMap.size();
        return  count;
    }
    public void help(){
        System.out.println("\nHelp Menu:\n " +
                "\n 1. greet followed by the name and the language the user is to be greeted in\n" +
                "\n 2. greeted should display a list of all users that has been greeted and how many time each user has been greeted\n" +
                "\n 3. greeted followed by a username returns how many times that username have been greeted\n" +
                "\n 4. counter returns a count of how many unique users has been greeted\n" +
                "\n 5. clear deletes of all users greeted and the reset the greet counter to 0\n" +
                "\n 6. clear followed by a username delete the greet counter for the specified user and decrement the greet counter by 1\n" +
                "\n 7. exit exits the application\n"
        );
    }
     public void clear(){
        greetMap.clear();
        int count = 0;
     }
     
//     public void greeted(){
//         for (Map<>:
//              ) {
//
//         }
//     }
}
