package Nhom1.donga.baitap1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TrangChuController {

    private static List<User> userList = new ArrayList<>(); // Danh sách người dùng

    @GetMapping("/trangchu")
    public String trangChu() {
        return "trangchu";
    }

    @GetMapping("/user")
    public String chiTiet(Model model) {
        model.addAttribute("userList", userList); // Thêm danh sách người dùng vào model
        return "user"; // Trả về view "user"
    }

    @GetMapping("/addUser")
    public String addUser(Model model) {
        model.addAttribute("user", new User()); // Tạo một đối tượng user mới cho form
        return "addUser"; // Trả về trang addUser để nhập dữ liệu
    }

    @PostMapping("/addUser")
    public String saveUser(@ModelAttribute("user") User user) {
        userList.add(user); // Thêm người dùng mới vào danh sách
        return "redirect:/addUser";
    }
}
