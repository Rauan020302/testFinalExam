package com.company;

public class Person {
    private String firstName;
    private String lastName;
    private String middleName;

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                '}';
    }

    public Person() {
    }

    public Person(String lastName,
                  String firstName,
                  String middleName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
    }
    public void algorithmName(String name){
        String delimeter = " ";
        String[] subStr;
        subStr = name.split(delimeter);
        for (int i = 0;i < subStr.length; i++) {
            if (subStr[i].length() == 3){
                setFirstName(subStr[0]);
                setLastName(subStr[1]);
                setMiddleName(subStr[2]);
            }else if(subStr[1].equals("уулу") || subStr[1].equals("кызы")){
                setFirstName(subStr[0] + " " + subStr[1]);
                setLastName(subStr[2]);
            }else{
                setFirstName(subStr[0]);
                setLastName(subStr[1]);
            }

        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
}
