package net.greet;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Greet greet = new Greet();
        Scanner sc = new Scanner(System.in);

        Boolean exit = true;

        while(exit){
            System.out.print("Please enter your command: ");
            String names = sc.nextLine();

            String command = "";
            String name = "";
            String language = "";

            String [] arr = names.split(" ");

            if (arr.length == 1){
                command = arr[0];
            }
            else if (arr.length == 2){
                command = arr[0];
                name = arr[1];
            }
            else if (arr.length == 3){
                command = arr[0];
                name = arr[1];
                language = arr[2];

            }
            if (command.equals("greet")){
                greet.greetNames( name, language);
            }else
                if (command.equals("counter")){
                System.out.println(greet.counter());
                }
            else
                if(command.equals("exit")){
                   exit = false;
                }
        }
        }

    }



