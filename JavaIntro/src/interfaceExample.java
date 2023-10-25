
interface interfaceExample {
    public void animalSound(); // interface method (does not have a body)
    public void sleep(); // interface method (does not have a body)
}

// Pig "implements" the Animal interface
class Cat implements interfaceExample {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The cat says: mew mew");
    }
    public void sleep() {
        // The body of sleep() is provided here
        System.out.println("Zzz");
    }
}