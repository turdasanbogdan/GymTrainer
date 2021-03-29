package facts;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

public class StepTwoParse
{

    String bmi;

    public StepTwoParse(String bmi){
        this.bmi = bmi;
    }

    public boolean find_facts() throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader("../../Desktop/se.txt"));
        String line = "";
        while ((line = reader.readLine()) != null) {
            String[] fields = line.split(",");

            if(line.contains(bmi)){

                return true;
            }

//            System.out.println(Arrays.toString(fields));
        }
        reader.close();

        return false;
    }
}