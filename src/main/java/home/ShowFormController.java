package home;

import org.springframework.stereotype.Controller;
import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShowFormController {
    @RequestMapping(value= "/showForm")
    public ModelAndView showForm(HttpServletRequest request) {
        return new ModelAndView("jsp/view/show-form.jsp");
    }
/*
    @RequestMapping(value= "/processForm")
    public ModelAndView processForm(HttpServletRequest request) {
        return new ModelAndView("jsp/view/processForm.jsp");
    }
*/
    @RequestMapping(value= "/processForm")
    public ModelAndView processForm(HttpServletRequest request, Model model) {
        // read the request parameter from the HTML form
        String name = request.getParameter("studentName");

        // convert the data to all caps
        name.toUpperCase();

        // create the message
        String result = "Yo!" + name;

        // add message to the model
        model.addAttribute("message", result);

        return new ModelAndView("jsp/view/main-menu.jsp");
    }

    /*
    public String letShoutDude(HttpServletRequest request, Model model){
        // read the request parameter from the HTML form
        String name = request.getParameter("studentName");

        // convert the data to all caps
        name.toUpperCase();

        // create the message
        String result = "Yo!" + name;

        // add message to the model
        model.addAttribute("message", result);

        return "jsp/view/processForm.jsp";
    }
    */




}
