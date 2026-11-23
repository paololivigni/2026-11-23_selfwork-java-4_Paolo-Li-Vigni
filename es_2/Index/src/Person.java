public class Person {

    private int index;
    private String name;
    private String surname;
    private int age;
    private String city;

    public Person (int index, String name, String surname, int age, String city){

        this.index = index;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.city = city;
    }

    public int getIndex(){
        return index;
    }

    public void setIndex(int index){
        this.index = index;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getSurname(){
        return surname;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getCity(){
        return city;
    }

    public void setCity(String city){
        this.city = city;
    }

}
