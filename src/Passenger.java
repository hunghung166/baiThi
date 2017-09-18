/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nguyenhung
 */
public class Passenger {

    private int id;
    private String name;
    private String address;
    private String phone;
    private String datein;
    private String dateout;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDatein() {
        return datein;
    }

    public void setDatein(String datein) {
        this.datein = datein;
    }

    public String getDateout() {
        return dateout;
    }

    public void setDateout(String dateout) {
        this.dateout = dateout;
    }

    public Passenger(int id, String name, String address, String phone, String datein, String dateout) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.datein = datein;
        this.dateout = dateout;
    }

    public Passenger() {
    }

    @Override
    public String toString() {
        return "Passenger{" + "id=" + id + ", name=" + name + ", address=" + address + ", phone=" + phone + ", datein=" + datein + ", dateout=" + dateout + '}';
    }

}
