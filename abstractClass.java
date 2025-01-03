abstract class abstractClass {
    public String fname = "Onik" ;
    public int age = 28 ;
    public abstract void study();
}

class Student extends abstractClass {
    public int graduationYear = 2018;
    public void study() { // the body of the abstract method is provided here
    System.out.println("Studying all day long");
    }
}
