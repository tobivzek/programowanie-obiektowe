package models;
public abstract class BasicData {
    public String name;
    public String Surname;
    public String Drug;
    public String Contagious;
    public String setSurname;
    public String setContagious;
    public String setDrug;
    public int age;
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAge() {
        return String.valueOf(this.age);
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getSurname() {
        return this.Surname;
    }
    public void setSurname(String Surname){
        this.Surname = Surname;
    }
    public String getContagious() {
        return this.Contagious;
    }
    public void setContagious(String Contagious){
        this.Contagious = Contagious;
    }
    public String getDrug() {
        return this.Drug;
    }
    public void setDrug(String Drug){
        this.Drug = Drug;
    }
    public void breakLine() {
        System.out.println("----------------------------");
    }
}