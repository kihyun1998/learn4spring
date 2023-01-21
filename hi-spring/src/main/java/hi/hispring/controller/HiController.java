package hi.hispring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HiController {
    @GetMapping("hi") //경로 매핑
    public String  hi(Model model){
        model.addAttribute("data","spring!!");
        return "hi";
    }
}
