public class Main {
    public static void main(String[] args) {
    Employee e1 = new Employee("1", "Hashem", 2000);
    Account a1 = new Account("1", "Ahmed", 5000);
    Account a2 = new Account("1", "Ahmed", 6000);
    System.out.println("Account 2: "+a2.getBalance());
    System.out.println(a1.credit(100));
    System.out.println(a1.transferTo(a2, 1000));
    System.out.println("Account 1: "+a1.getBalance());
    System.out.println("Account 2: "+a2.getBalance());
    
    }
}