import java.util.ArrayList;
import java.util.List;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private List<Person> people;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.people = new ArrayList<>();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void getAvgAge(){
        double totalAge = 0;
        for (Person person : people) {
            totalAge += person.getAge();
        }
         double avgAge = totalAge / people.size();
        System.out.println("Average age is : "+avgAge);
    }

    public void getOldest(){
      Person oldestPerson = null;
      double oldest = 0;
        for (Person person : people) {
            if (person.getAge()>oldest){
                oldest = person.getAge();
                oldestPerson = person;
            }
        }
        System.out.println("Oldest person is : "+oldestPerson);
    }

    public void getYoungest(){
        if (people.isEmpty()){
            System.out.println("No people in list");
            return;
        }
        Person youngestPerson = people.get(0);

        for (Person person : people) {
            if (person.getAge() < youngestPerson.getAge()){
                youngestPerson = person;
            }

        }
        System.out.println("Youngest is : "+youngestPerson);
    }
}
