package hi.hispring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @GetMapping("hi-spring") //API 방식
    @ResponseBody
    public String hiString(@RequestParam("name") String name){
        return "hi " + name;
    }

    @GetMapping("hi-api")
    @ResponseBody
    public Hi hiApi(@RequestParam("name") String name){
        Hi hi = new Hi();
        hi.setName(name);
        return hi;
    }
    static class Hi {

        private String name;

        public String getName(){
            return name;
        }

        public void setName(String name){
            this.name = name;
        }
    }

}
