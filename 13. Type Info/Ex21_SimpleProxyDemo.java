/**
 * Modify SimpleProxyDemo.java so that it measures method-call times.
 */

import static net.mindview.util.Print.*;

interface Interface {
  void doSomething();
  void somethingElse(String arg);
}

class RealObject implements Interface {
  public void doSomething() { print("doSomething"); }
  public void somethingElse(String arg) {
    print("somethingElse " + arg);
  }
}	

class SimpleProxy implements Interface {
  private Interface proxied;
  public SimpleProxy(Interface proxied) {
    this.proxied = proxied;
  }
  public void doSomething() {
    print("SimpleProxy doSomething");
    long start = System.nanoTime();
    proxied.doSomething();
    long duration = System.nanoTime() - start;
    print("Duration: " + duration);
  }
  public void somethingElse(String arg) {
    print("SimpleProxy somethingElse " + arg);
    long start = System.nanoTime();
    proxied.somethingElse(arg);
    long duration = System.nanoTime() - start;
    print("Duration: " + duration);
  }
}	

class Ex21_SimpleProxyDemo {
  public static void consumer(Interface iface) {
    iface.doSomething();
    iface.somethingElse("bonobo");
  }
  public static void main(String[] args) {
    consumer(new RealObject());
    consumer(new SimpleProxy(new RealObject()));
  }
}

/* Outpit:
  doSomething
  somethingElse bonobo
  SimpleProxy doSomething
  doSomething
  Time: 35015
  SimpleProxy somethingElse bonobo
  somethingElse bonobo
  Time: 31393
 */