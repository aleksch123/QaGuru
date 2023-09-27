import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

public class MiniJunit {

    public static void main(String[] args) throws Exception {

        Method[] methods = DemoTest.class.getDeclaredMethods();
        for (Method method : methods) {
            Test annotation = method.getAnnotation(Test.class);
            if (annotation != null) {
                DemoTest instance = DemoTest.class.getConstructor().newInstance();
                try {
                    method.invoke(instance);
                    System.out.println("Test Passed!");
                    return;

                } catch (Exception e) {
                    System.out.println("Test Failed!");


                }

            }
        }

    }


}
