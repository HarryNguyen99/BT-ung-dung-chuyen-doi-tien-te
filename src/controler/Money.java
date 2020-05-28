package controler;

import model.Moneys;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/money")
public class Money {
    @GetMapping()
    public ModelAndView showInput(){
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("input",new Moneys());
        return modelAndView;
    }

    @PostMapping()
    public ModelAndView showResoul(@ModelAttribute Moneys moneys){
        ModelAndView modelAndView = new ModelAndView("resoul");
        float resoul = moneys.getInputM() * moneys.getRate();
        modelAndView.addObject(resoul);
        return modelAndView;
    }
}
