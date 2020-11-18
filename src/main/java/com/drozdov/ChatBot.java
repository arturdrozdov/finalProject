package com.drozdov;

import java.util.*;

public class ChatBot {
        private static HashSet<Object> professions;


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String message = scanner.nextLine();

            initProfessions();


            String botAnswer = process(message);
            System.out.println(botAnswer);
        }

        public static void initProfessions() {
            professions = new HashSet<>();

            professions.add("Designer");
            professions.add("Java");
            professions.add("Frontend");
        }

        public static String process(String message) {
            if (isHelloMessage(message)) {
                String botName = "Артур3000";
                return "Приветствую, я - " + botName;
            }




        public static int find(String message, HashSet<String>professions) {
            message = message.toLowerCase();

            for(String word: data.keySet()) {
                String lowerCasedWord = word.toLowerCase();

                if (message.contains(lowerCasedWord)) {
                    return data.get(word);
                }
            }


        }
        private static boolean isHelloMessage(String message) {
            message = message.toLowerCase();

            String helloWord1 = "привет";
            String helloWord2 = "здравствуй";

            return message.contains(helloWord1) || message.contains(helloWord2);
        }
    }

