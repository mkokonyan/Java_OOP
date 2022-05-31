package L03_Inheritance.b_exercise.P06_Animals;

import java.sql.Struct;

public class Animal {
    private String name;
    private int age;
    private  String gender;

    public Animal(String name, int age, String gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        Validators.validateData(name);

        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    private void setAge(int age) {
        Validators.validateData(String.valueOf(age));

        this.age = age;
    }

    public String getGender() {
        return this.gender;
    }

    private void setGender(String gender) {
        Validators.validateData(gender);

        this.gender = gender;
    }

    public String produceSound() {
        return null;
    }

    @Override
    public String toString() {
        StringBuilder  stringBuilder = new StringBuilder();
        stringBuilder.append(this.getClass().getSimpleName()).append(System.lineSeparator());
        stringBuilder.append(this.name).append(" ").append(this.age).append(" ").append(this.gender).append(System.lineSeparator());
        stringBuilder.append((this.produceSound()));

        return stringBuilder.toString();
    }
}
