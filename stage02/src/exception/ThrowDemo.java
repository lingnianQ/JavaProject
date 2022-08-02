package exception;

public class ThrowDemo {
    public static void main(String[] args) {
        Person person = new Person();
        try {
            person.setAge(300);
        } catch (ILLegalAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
