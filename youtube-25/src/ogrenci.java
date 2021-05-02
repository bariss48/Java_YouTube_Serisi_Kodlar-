public class ogrenci {

    private int number;
    private String name;
    private String surname;
    private String departmant;
    private int not;


    public ogrenci(int number,String name,String surname,String departmant,int not){

        this.departmant = departmant;
        this.name = name;
        this.surname = name;
        this.not = not;
        this.number = number;

    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDepartmant() {
        return departmant;
    }

    public void setDepartmant(String departmant) {
        this.departmant = departmant;
    }

    public int getNot() {
        return not;
    }

    public void setNot(int not) {
        this.not = not;
    }

    public  boolean siniftan_kalma(int number){

        if (70 <= number) {
            return true;
        }else

            return false;

    }







}
