package rules;

public class Training {

    private String sex;
    private String scope;

    public Training(String sex, String scope){
        this.sex = sex;
        this.scope = scope;
    }

    public String training_rule(){
        if(sex.equals("F") && scope.equals("SLIM")){
            return "FS";
        }else if(sex.equals("F") && scope.equals("HEAVY")){
            return "FH";
        }else if(sex.equals("M") && scope.equals("SLIM")){
            return "MS";
        }else if(sex.equals("M") && scope.equals("HEAVY")){
            return "MH";
        }

        return "Default";
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
