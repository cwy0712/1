/**
 * Created by wenya on 30/1/2017.
 */
public class Staff {
    private String staff_ID;
    private String name;
    private String gender;
    private String nric;
    private String password;
    private String perPhone;
    private String homeAdd;
    private String joinedDate;
    private String designation;

    public Staff(){}

    public Staff(String staff_ID,String name,String gender, String nric, String password, String perPhone, String homeAdd, String joinedDate)
    {
        super();
        this.staff_ID = staff_ID;
        this.name = name;
        this.gender= gender;
        this.password = password;
        this.nric = nric;
        this.password = password;
        this.perPhone = perPhone;
        this.homeAdd = homeAdd;
        this.joinedDate = joinedDate;
    }

    public String getStaff_ID() {
        return staff_ID;
    }

    public void setStaff_ID(String staff_ID) {
        this.staff_ID = staff_ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNric() {
        return nric;
    }

    public void setNric(String nric) {
        this.nric = nric;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPerPhone() {
        return perPhone;
    }

    public void setPerPhone(String perPhone) {
        this.perPhone = perPhone;
    }

    public String getHomeAdd() {
        return homeAdd;
    }

    public void setHomeAdd(String homeAdd) {
        this.homeAdd = homeAdd;
    }

    public String getJoinedDate() {
        return joinedDate;
    }

    public void setJoinedDate(String joinedDate) {
        this.joinedDate = joinedDate;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
