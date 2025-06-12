public class Main {
    public static void main(String[] args) {
        // Part 1
        System.out.println("Hello World!");

        // Part 2 
        sayHello(); 
        int result = addTwo(4); 
        System.out.println("4 + 2 = " + result);

        // Part 3
        Animal pet1 = new Animal();            
        Animal pet2 = new Animal("Dog");       

        System.out.println(pet1);          
        System.out.println(pet2);             

        pet1.setType("Cat");                  
        System.out.println("Pet1 is now a: " + pet1.getType());

        System.out.println("Are they the same? " + pet1.equals(pet2)); 
    }

    
    public static void sayHello() {
        System.out.println("Hello from a method!");
    }

    // Static method that returns a value
    public static int addTwo(int number) {
        return number + 2;
    }
}

// Simple class representing an Animal
class Animal {
    private String type;

    // Default constructor
    public Animal() {
        this.type = "Unknown";
    }

    // Full constructor
    public Animal(String type) {
        this.type = type;
    }

    // Getter
    public String getType() {
        return type;
    }

    // Setter
    public void setType(String type) {
        this.type = type;
    }

    // toString method
    public String toString() {
        return "Animal type: " + type;
    }

    // equals method
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Animal other = (Animal) obj;
        return this.type.equals(other.type);
    }
}