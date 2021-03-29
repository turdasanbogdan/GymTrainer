import facts.FinalParse;
import rules.Training;
import rules.Age;
import rules.BMI;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import facts.StepOneParse;
import facts.StepTwoParse;

class Main{


    public static void main(String args[])
        throws IOException
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Age age;
        BMI bmi;
        Training training;
        String age_result;
        String bmi_result;
        String training_result;
        StepOneParse stepOne;
        StepTwoParse stepTwo;
        FinalParse finalParse;

        boolean res = false;

        System.out.println("Please insert your age");

        int a = Integer.parseInt(reader.readLine());

        age= new Age(a);

        age_result = age.age_rule();

        stepOne = new StepOneParse(age_result);

        try{
        res = stepOne.find_facts();
        } catch (Exception e) {
            e.printStackTrace();
        }

        while(res == false){

            System.out.println("Please insert other age, that one might have problems ");
            System.out.println("If you don t like to continue please insert -1");

            a = Integer.parseInt(reader.readLine());

            if(a == -1){
                return;
            }
            age= new Age(a);

            age_result = age.age_rule();

            stepOne = new StepOneParse(age_result);

            try{
                res = stepOne.find_facts();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        System.out.println("Your trainning will be for :" + age_result);

        System.out.println("Please insert your weight");

        double weight = Float.parseFloat(reader.readLine());

        System.out.println("Please insert your height");

        double height = Float.parseFloat(reader.readLine());

        while(weight == 0){
            System.out.println("Please insert your weight");
            weight = Float.parseFloat(reader.readLine());
        }

        while(height == 0){
            System.out.println("Please insert your height");
            height = Float.parseFloat(reader.readLine());
        }

        bmi = new BMI(weight, height);

        bmi_result = bmi.bmi_rule();

        stepTwo = new StepTwoParse(bmi_result);

        try{
            res = stepTwo.find_facts();
        } catch (Exception e) {
            e.printStackTrace();
        }

        while(res == false){

            System.out.println("Please insert other weight and then height, that one might have problems ");
            System.out.println("If you don t like to continue please insert -1");

            System.out.println("Please insert your weight");
            weight = Float.parseFloat(reader.readLine());

            if(weight == -1){
                return;
            }

            System.out.println("Please insert your height");
            height = Float.parseFloat(reader.readLine());

            if(height == -1){
                return;
            }

            bmi = new BMI(weight, height);

            bmi_result = bmi.bmi_rule();

            stepTwo = new StepTwoParse(bmi_result);

            try{
                res = stepTwo.find_facts();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        System.out.println("Your trainning will be for :" + bmi_result);

        System.out.println("Please insert your Sex");
        System.out.println("----------WARNNING----------");
        System.out.println("Only F for female");
        System.out.println("----------WARNNING----------");
        System.out.println("Only M for female");
        System.out.println("----------WARNNING----------");
        System.out.println("Only one sex admitted");

        String sex = reader.readLine();

        System.out.println("NOW CHOOSE YOUR SCOPE");
        System.out.println("THE SCOPES ARE: SLIM and HEAVY");
        System.out.println("----------WARNNING----------");
        System.out.println("FOR SLIM enter 0");
        System.out.println("----------WARNNING----------");
        System.out.println("FOR HEAVY enter everything expect 0");
        System.out.println("Please insert your scope");

        int scope = Integer.parseInt(reader.readLine());

        if(scope == 0){
            training = new Training(sex, "SLIM");
        }else{
            training = new Training(sex, "HEAVY");
        }

        System.out.println(training.getSex());

        training_result = training.training_rule();

        if(training_result.equals("Default")){
            System.out.println("Calisthetic - Crunch Cardio -Jumping rope Aerobic -Burpes\n");
        }else{

            finalParse = new FinalParse(age_result, bmi_result,training_result);

            System.out.println("Your trainning will be for :" + training_result);

            try{
                finalParse.find_facts();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }


    }


}
