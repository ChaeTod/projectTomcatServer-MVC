package home;

import org.springframework.stereotype.Controller;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    /*@RequestMapping(value= "/home")
    public ModelAndView home(HttpServletRequest request) {
        return new ModelAndView("jsp/view/main-menu.jsp");
    }



    @RequestMapping(value= "/processForm")
    public ModelAndView processForm(HttpServletRequest request) {
        return new ModelAndView("jsp/view/show-form.jsp");
    }*/

    @RequestMapping(value= "/home")
    public ModelAndView home(HttpServletRequest request) {
        return new ModelAndView("jsp/view/main-menu.jsp");
    }



   /* @RequestMapping("showForm")
    public String showForm(){
        return "jsp/view/show-form.jsp";
    }*/

}
