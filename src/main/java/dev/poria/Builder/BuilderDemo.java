package dev.poria.Builder;

public class BuilderDemo {
    public static void main(String[] args) {

        Person person1 = new Person.PersonBuilder("Poria" , "Sherafatian")
                .setAge(20)
                .setAddress("IRAN")
                .setEmail("PoriaDeveloper@gmail.com")
                .setPhoneNumber("+98 902 717 3739")
                .build();

        System.out.println(person1);
    }
}
