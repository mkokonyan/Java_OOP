package L02_Encapsulation.b_exercise.P04_PizzaCalories;

public class Dough {
    private String flourType;
    private String bakingTechnique;
    private double weight;

    public Dough(String flourType, String bakingTechnique, double weight) {
        setFlourType(flourType);
        setBakingTechnique(bakingTechnique);
        setWeight(weight);
    }

    private void setWeight(double weight) {
        Validators.doughWeightValidator(weight);

        this.weight = weight;
    }

    private void setFlourType(String flourType) {
        Validators.doughTypeValidator(flourType);
        this.flourType = flourType;
    }

    private void setBakingTechnique(String bakingTechnique) {
        this.bakingTechnique = bakingTechnique;
    }

    public double calculateCalories() {
       return (2 * weight) *
               DoughModifiers.valueOf(this.flourType).getModifier() *
               DoughModifiers.valueOf(this.bakingTechnique).getModifier();
    }
}
