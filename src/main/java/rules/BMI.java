package rules;

public class BMI {

    private double weight, height;
    private double bmi;

    public BMI(double weight, double height){
        this.height = height;
        this.weight = weight;
        this.bmi = weight / ( (height/100) * (height/100) );
    }


    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public double getBmi() {
        return bmi;
    }

    public void setBmi(double bmi) {
        this.bmi = bmi;
    }

    public String bmi_rule(){

        if(height < 50){
            return "out_of_bound";
        }
        if(weight < 30){
            return "out_of_bound";
        }

        System.out.println(bmi);

        if(bmi < 18){
            return "under";
        }
        else if(bmi >= 18 && bmi < 24){
            return "low";
        }else if(bmi >= 24 && bmi < 30){
            return "high";
        }
            return "obesity";
    }
}
