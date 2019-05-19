public class sinhvien {
    private int id;
    private String name;
    private int age;
    private String address;
    private double gpa;
    public sinhvien() {

    }

    public sinhvien(int id, String name, int age, String address, double gpa ) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.gpa = gpa;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getAddress() {
        return this.address;
    }

    public double getGpa() {
        return this.gpa;
    }

    public void setId(int newId) {
        this.id = newId;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setAge(int newAge){
        this.age = newAge;
    }

    public void setAddress(String newAddress) {
        this.address = newAddress;
    }

    public void setGpa(double newGpa) {
        this.gpa = newGpa;
    }

    public void show() {
        System.out.println("ID: "+this.id + " NAME: "+this.name+ " AGE: "+this.age + " ADDRESS: "+this.address +" GPA: "+this.gpa);
    }
}
