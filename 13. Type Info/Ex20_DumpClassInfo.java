import static net.mindview.util.Print.print;

/**
 * Look up the interface for java.lang.Class in the JDK documentation from http://java.sun.com. Write a program
 * that takes the name of a class as a command-line argument, then uses the Class methods to dump all the
 * information available for that class. Test your program with a standard library class and a class you create.
 */

public class Ex20_DumpClassInfo {
    private static String usage = "Usage:\nEx20_DumpClassInfo className";

    static void printAll(String msg, Object[] values) {
        print(msg + ":");
        for (Object value : values) {
            print(" " + value);
        }
    }

    static void dumpInfo(String name) throws Exception {
        Class<?> c = Class.forName(name);

        print("getName():" + c.getName());
        print("getCanonicalName(): " + c.getCanonicalName());
        print("getSimpleName(): " + c.getSimpleName());
        print("getPackage():" + c.getPackage());
        print("getSuperclass():" + c.getSuperclass());
        print("getTypeName():" + c.getTypeName());
        print("getAnnotatedSuperclass(): " + c.getAnnotatedSuperclass());
        printAll("getAnnotatedInterfaces()", c.getAnnotatedInterfaces());
        printAll("getClasses()", c.getClasses());
        printAll("getConstructors()", c.getConstructors());
        printAll("getDeclaredClasses()", c.getDeclaredClasses());
        printAll("getDeclaredFields()", c.getDeclaredFields());
        printAll("getFields()", c.getFields());
        printAll("getGenericInterfaces()", c.getGenericInterfaces());
        printAll("getMethods()", c.getMethods());
    }

    public static void main(String[] args) {
        if(args.length < 1) {
            System.out.println(usage);
            System.exit(0);
        }

        try {
            dumpInfo(args[0]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
