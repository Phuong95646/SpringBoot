package Nhom1.donga.baitap1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
}
