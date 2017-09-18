
import java.util.PriorityQueue;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author nguyenhung
 */
public class PassengerController {

    static PriorityQueue<Passenger> queuePassenger = new PriorityQueue<>();
    static Passenger ps = new Passenger();

    public boolean addPassenger() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập vào tên: ");
        String name = sc.nextLine();
        System.out.println("Nhập vào địa chỉ: ");
        String address = sc.nextLine();
        System.out.println("Nhập vào số điện thoại");
        String phone = sc.nextLine();
        System.out.println("Nhập vào ngày đi: ");
        String datein = sc.nextLine();
        System.out.println("Nhập vào ngày về: ");
        String dateout = sc.nextLine();
        System.out.println("ID: " + id + "\nTên: " + name + "\nĐịa chỉ: " + address + "\nSố điện thoại: " + phone + "\nNgày đi: " + datein + "\nNgày về: " + dateout);

        ps.setId(id);
        ps.setName(name);
        ps.setAddress(address);
        ps.setPhone(phone);
        ps.setDatein(datein);
        ps.setDateout(dateout);
        queuePassenger.add(ps);

        return true;

    }

    public void displayPassenger() {
        if (queuePassenger.isEmpty() == true) {
            System.out.println("Danh sách trống");

        } else {
            queuePassenger.forEach(ps -> {
                System.out.println("ID: " + ps.getId());
                System.out.println("Tên: " + ps.getName());
                System.out.println("Đja chỉ: " + ps.getAddress());
                System.out.println("Số điện thoại: " + ps.getPhone());
                System.out.println("Ngày đi: " + ps.getDatein());
                System.out.println("Ngày về " + ps.getDateout());
            });
        }
    }

    public void modifyPassenger() {
        System.out.println("Nhập ID khách hàng cần sửa");

        queuePassenger.forEach(ps -> {
            Scanner sc = new Scanner(System.in);
            String strId = sc.nextLine();
            int id = 0;
            try {
                id = Integer.parseInt(strId);
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập vào số");
            }
            if (id == ps.getId()) {
                queuePassenger.remove();
                System.out.println("Nhập vào tên: ");
                String name = sc.nextLine();
                if (name.isEmpty() == true) {
                    name = ps.getName();
                }
                System.out.println("Nhập vào địa chỉ: ");
                String address = sc.nextLine();
                if (address.isEmpty() == true) {
                    System.out.println(address = ps.getAddress());
                }
                System.out.println("Nhập vào số điện thoại");
                String phone = sc.nextLine();
                if (phone.isEmpty() == true) {
                    System.out.println(phone = ps.getPhone());
                }
                System.out.println("Nhập vào ngày đi: ");
                String datein = sc.nextLine();
                if (datein.isEmpty() == true) {
                    System.out.println(datein = ps.getDatein());
                }
                System.out.println("Nhập vào ngày về: ");
                String dateout = sc.nextLine();
                if (dateout.isEmpty() == true) {
                    System.out.println(dateout = ps.getDateout());
                }

                ps.setId(id);
                ps.setName(name);
                ps.setAddress(address);
                ps.setPhone(phone);
                ps.setDatein(datein);
                ps.setDateout(dateout);
                queuePassenger.add(ps);
            } else {
                System.out.println("Ko tồn tại sinh viên có ID này");
            }
        });





    }
}
