public class Person {

    private String name;
    private String surname;
    private int age;

    /* Constructor */

    public Person(String name,String surname,int age){
        this.name= name;
        this.surname = surname;
        this.age = age;

    }

    //display name
    public void displayName(){
        System.out.println(name);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
