/**
 * Remove all the generics from MultipleInterfaceVariants.java and modify the code so that the example compiles.
 */

interface Payable {}

class Employee implements Payable {}
class Hourly extends Employee implements Payable {}

public class Ex31_MultipleInterfaceVariants {
    public static void main(String[] args) {
        new Employee();
        new Hourly();
    }
}