package facts;

import java.io.BufferedReader;
import java.io.FileReader;


public class StepOneParse
{

    String age;

    public StepOneParse(String age){
        this.age = age;
    }

    public boolean find_facts() throws Exception {

        BufferedReader reader = new BufferedReader(new FileReader("../../Desktop/se.txt"));
        String line = "";
        while ((line = reader.readLine()) != null) {
            String[] fields = line.split(" ");

            if(line.contains(age)){

                return true;
            }

//            System.out.println(Arrays.toString(fields));
        }
        reader.close();

        return false;
    }
}
