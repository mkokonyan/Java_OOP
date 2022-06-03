package L07_Reflection.a_lab.P03_HighQualityMistakes;

import L07_Reflection.a_lab.Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        Class<Reflection> clazz = Reflection.class;

        Arrays.stream(clazz.getDeclaredFields())
                .filter(f -> !Modifier.isPrivate(f.getModifiers()))
                .sorted(Comparator.comparing(Field::getName))
                .forEach(f -> System.out.println(f.getName() + " must be private!"));

        Method[] declaredMethods = Arrays.stream(clazz.getDeclaredMethods())
                .filter(m -> !m.getName().equals("toString"))
                .toArray(Method[]::new);

        Arrays.stream(declaredMethods)
                .filter(m -> m.getReturnType() != void.class)
                .filter(m -> !Modifier.isPublic(m.getModifiers()))
                .sorted(Comparator.comparing(Method::getName))
                .forEach(m -> System.out.println(m.getName() + " must to be public!"));

        Arrays.stream(declaredMethods)
                .filter(m -> m.getReturnType() == void.class)
                .filter(m -> !Modifier.isPrivate(m.getModifiers()))
                .sorted(Comparator.comparing(Method::getName))
                .forEach(m -> System.out.println(m.getName() + " must to be private!"));


    }
}
