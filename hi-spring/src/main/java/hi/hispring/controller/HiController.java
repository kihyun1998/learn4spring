package hi.hispring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HiController {
    @GetMapping("hi") //경로 매핑
    public String  hi(Model model){
        model.addAttribute("data","spring!!");
        return "hi";
    }

    @GetMapping("hi-mvc")
    public String hiMvc(@RequestParam("name") String name, Model model){
        model.addAttribute("name",name);
        return "hi-template";
    }
}
