/**
 * Following the example in Transmogrify.java, create a Starship class containing
 * an AlertStatus reference that can indicate three different states. Include
 * methods to change the states.
 */

class Alert {
    public String toString() { return "No alert"; }
}

class FalseAlert extends Alert {
    public String toString() { return "False alert"; }
}

class MockAlert extends Alert {
    public String toString() { return "Mock alert"; }
}

class GeneralAlert extends Alert {
    public String toString() { return "General alert!"; }
}

public class Ex16_Starship {
    private Alert AlertStatus = new Alert();

    void checkAlert() { System.out.println("Current alert status: " + AlertStatus); }
    void initFalseAlert() { AlertStatus = new FalseAlert(); }
    void initMockAlert() { AlertStatus = new MockAlert(); }
    void initGeneralAlert() { AlertStatus = new GeneralAlert(); }

    public static void main(String[] args) {

        Ex16_Starship starship = new Ex16_Starship();

        starship.checkAlert();
        starship.initFalseAlert();
        starship.checkAlert();
        starship.initMockAlert();
        starship.checkAlert();
        starship.initGeneralAlert();
        starship.checkAlert();
    }
}
