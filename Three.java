class ConstructorOverloading {
    private String name;
    private int age;

    // Constructor with no parameters
    public ConstructorOverloading() {
        this.name = "NameNotImportant";
        this.age = 0;
    }

    // Constructor with one parameter (name)
    public ConstructorOverloading(String name) {
        this.name = name;
        this.age = 0;
    }

    // Constructor with two parameters (name and age)
    public ConstructorOverloading(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display details
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Three{
    public static void main(String[] args) {
        // Creating objects using different constructors
        ConstructorOverloading person1 = new ConstructorOverloading();
        ConstructorOverloading person2 = new ConstructorOverloading("Prashant Gautam");
        ConstructorOverloading person3 = new ConstructorOverloading("Hari Ghimire", 27);

        // Displaying details of each person
        System.out.println("Person 1:");
        person1.display();
        System.out.println();

        System.out.println("Person 2:");
        person2.display();
        System.out.println();

        System.out.println("Person 3:");
        person3.display();
    }
}