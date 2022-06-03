package L07_Reflection.a_lab.P01_Reflection;

import L07_Reflection.a_lab.Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Class<Reflection> clazz = Reflection.class;

        System.out.println(clazz.getSimpleName());
        System.out.println(clazz.getSuperclass().getSimpleName());

        try {
            Arrays.stream(clazz.getInterfaces())
                    .map(Class::getSimpleName)
                    .forEach(System.out::println);

            Constructor<Reflection> ctor = clazz.getDeclaredConstructor();

            Reflection reflection = ctor.newInstance();

            System.out.println(reflection);


        } catch (NoSuchMethodException
                 | IllegalAccessException
                 | InvocationTargetException
                 | InstantiationException ex) {
            System.out.println(ex.getMessage());
        }


    }
}
