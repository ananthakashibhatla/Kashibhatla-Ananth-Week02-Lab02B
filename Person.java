public class Person {
    // Create private attributes for name, age, and email
    private String name; 
    private int age; 
    private String email; 

    // Create a parameterized constructor for name, age, and email
    public Person(String name, int age, String email) {
        this.name = name; 
        this.age = age; 
        this.email = email; 
    }

    // Create the getter and setter for the name attribute
    public String getName() { 
        return name; 
    }
    public void setName(String name) { 
        this.name = name;
    }

    // Create the getter and setter for the age attribute
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age; 
    }

    // Create the getter and setter for the email attribute
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    // Create a void method to display the name, age and email attributes
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
    }
}
