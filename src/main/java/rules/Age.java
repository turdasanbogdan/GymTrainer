package rules;

public class Age {

    private int age;

    public Age(int age){
        this.age = age;
    }

    public String age_rule(){
        if( age <= 25 && age >=7){
            return "young";
        }else if( age > 25 && age <= 55 ){
            return "middle";
        }else if(age < 108 && age > 0){
            return "old";
        }
        return "out_of_bound";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
