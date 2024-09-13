package Nhom1.donga.baitap1;

public class User {
    private String firstName;
    private String lastName;
    private Number No;
    private String birthDate;
    private String sex;
    private String phone;
    private String address;

    // Getter và Setter cho tất cả các thuộc tính
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public Number getNo() { return No; }
    public void setNo(Number No) { this.No = No; }

    public String getBirthDate() { return birthDate; }
    public void setBirthDate(String birthDate) { this.birthDate = birthDate; }

    public String getSex() { return sex; }
    public void setSex(String sex) { this.sex = sex; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
}
