package Nhom1.donga.baitap1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TrangChuController {

    @GetMapping("/trangchu")
    public String trangChu() {
        return "trangchu";
    }

    @GetMapping("/user")
    public String chiTiet(Model model) {
        model.addAttribute("user", "Phan Anh Phuong");
        return "user";
    }

    @GetMapping("/addUser")
    public String addUser(Model model) {
        model.addAttribute("user", new User());
        return "addUser";
    }

    @PostMapping("/addUser")
    public void saveUser(@ModelAttribute("User")User user) {
        System.out.println("FirstName: " + user.getFirstName());
        System.out.println("LastName: " + user.getLastName());
    }

    @GetMapping("/addUserCccd")
    public String addUserCccd(Model model) {
        model.addAttribute("userCccd", new UserCccd());
        return "addUserCccd";
    }

    @PostMapping("/addUserCccd")
    public void saveUserCccd(@ModelAttribute("UserCccd")UserCccd userCccd) {
        System.out.println("So: " + userCccd.getNumber());
        System.out.println("Ho va ten: " + userCccd.getFullName());
        System.out.println("Ngay sinh: " + userCccd.getDateOfBirth());
        System.out.println("Quoc Tich: " + userCccd.getNationality());
        System.out.println("Gioi tinh: " + userCccd.getSex());
        System.out.println("Que Quan: " + userCccd.getPlaceOfOrigin());
        System.out.println("Noi thuong tru: " + userCccd.getPlaceOfResidence());
    }
}