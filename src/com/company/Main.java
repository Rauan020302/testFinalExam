package com.company;

public class Main {

    public static void main(String[] args) {
        String fullNameAidar = "Мусаев Айдар Нурсултанович";
        String fullNameMaksat = "Азамат уулу Максат";
        String fullNameElina = "Азамат кызы Элина";
        String fullNameBeka = "Мирбеков Бека";
        Person person = new Person();
        person.algorithmName(fullNameAidar);
        System.out.println(person);
        Person person1 = new Person();
        person1.algorithmName(fullNameMaksat);
        System.out.println(person1);
        Person person2 = new Person();
        person2.algorithmName(fullNameBeka);
        System.out.println(person2);

    }
    public static void algorithm(String name,Person p ){

        String delimeter = " ";
        String[] subStr;
        subStr = name.split(delimeter);
        for (String s : subStr) {
            System.out.println(s);
            if (s.length() == 3) {
                p.setFirstName(subStr[0]);
                p.setLastName(subStr[1]);
                p.setMiddleName(subStr[2]);
            } else if (subStr[1].equals("уулу") || subStr[1].equals("кызы")) {
                p.setFirstName(subStr[0] + " " + subStr[1]);
                p.setLastName(subStr[2]);
            } else {
                p.setFirstName(subStr[0]);
                p.setLastName(subStr[1]);
            }

        }

    }
    //System.out.println("Пример 1:");
    //      String str = "разделить-строку-по-разделителю";
    //      String[] subStr;
    //      String delimeter = "-"; // Разделитель
    //      subStr = str.split(delimeter); // Разделения строки str с помощью метода split()
    //      // Вывод результата на экран
    //      for(int i = 0; i < subStr.length; i++) {
    //         System.out.println(subStr[i]);
    //      }
}
