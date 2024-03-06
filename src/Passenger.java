public class Passenger {


    private static int idd=1;
    private String name;
    private int id;
    private int age;

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public int getCage() {
        return cage;
    }

    public void setCage(int cage) {
        this.cage = cage;
    }

    private Character gender;
    private Character bp;//L,M,U//berth Preference
    private int seatNumber;//1,2//initially it will be empty
    private String alloted;//example L1,L2/initially it will be empty
    //
    private String cname=null;
    private int cage=0;

    public Passenger(String name,int age, char gender, char bp) {
        this.id = idd++;
        this.name = name;
        this.age=age;
        this.gender = gender;
        this.bp = bp;
        this.seatNumber = -1;
        this.alloted = "";
    }

    public Passenger(String name, int age, char gen, char bp, String cname, int cage) {
        this.id = idd++;
        this.name = name;
        this.age=age;
        this.gender = gender;
        this.bp = bp;
        this.seatNumber = -1;
        this.alloted = "";
        this.cname=cname;
        this.cage=cage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    public Character getBp() {
        return bp;
    }

    public void setBp(Character bp) {
        this.bp = bp;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getAlloted() {
        return alloted;
    }

    public void setAlloted(String alloted) {
        this.alloted = alloted;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "id='" + id + '\'' +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", bp=" + bp +
                ", seat=" + alloted+seatNumber +
                ", childName=" + cname +
                '}';
    }
}
