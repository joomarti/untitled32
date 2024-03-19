package popka2;

public class Reader {
    private  int id;
    private  String  fullName;
    private  String  email;
    private  int   NOMER ;
    private  int  Gender_gender;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNOMER() {
        return NOMER;
    }

    public void setNOMER(int NOMER) {
        this.NOMER = NOMER;
    }

    public int getGender_gender() {
        return Gender_gender;
    }

    public void setGender_gender(int gender_gender) {
        Gender_gender = gender_gender;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", NOMER=" + NOMER +
                ", Gender_gender=" + Gender_gender +
                '}';
    }

    public Reader(int id, String fullName, String email, int NOMER, int gender_gender) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.NOMER = NOMER;
        Gender_gender = gender_gender;
    }
}
