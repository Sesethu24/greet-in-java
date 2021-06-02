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

}
