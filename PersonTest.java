public class PersonTest {
    public static void main(String[] args) { 
        // Create the personOne and personTwo objects using the parameterized public constructor
        Person personOne = new Person("Maria", 28, "maria@example.com");
        Person personTwo = new Person("David", 35, "david@example.com");

        // Print person One name, age and email via getters
        System.out.println(personOne.getName());
        System.out.println(personOne.getAge());
        System.out.println(personOne.getEmail());

        // Print person Two name, age and email via getters
        System.out.println(personTwo.getName());
        System.out.println(personTwo.getAge());
        System.out.println(personTwo.getEmail());

        // If you want, because the parameters are public, we can update the
        // newly created person One object via a setter and then print via getter
        personOne.setName("Joshua");
        System.out.println(personOne.getName());
    }    
}
