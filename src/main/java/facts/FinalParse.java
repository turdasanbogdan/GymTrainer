package facts;

import java.io.BufferedReader;
import java.io.FileReader;

public class FinalParse {

    String age, bmi ,type;

    public FinalParse(String age, String bmi, String type){
        this.age = age;
        this.bmi = bmi;
        this.type = type;
    }

    public boolean find_facts() throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader("../../Desktop/se.txt"));
        String line = "";
        while ((line = reader.readLine()) != null) {
            String[] fields = line.split(",");

            if(line.contains(age) && line.contains(bmi) && line.contains(type)){
                System.out.println(line);
                return true;
            }

//            System.out.println(Arrays.toString(fields));
        }
        reader.close();

        return false;
    }

}
