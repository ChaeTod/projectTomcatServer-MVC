package home;

import org.springframework.stereotype.Controller;
import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")  // parent mapping
public class ShowFormController {
    @RequestMapping(value= "/showForm")  // sub mapping
    public ModelAndView showForm(HttpServletRequest request) {
        return new ModelAndView("jsp/view/show-form.jsp");
    }
/*
    @RequestMapping(value= "/processForm")
    public ModelAndView processForm(HttpServletRequest request) {
        return new ModelAndView("jsp/view/processForm.jsp");
    }
*/
    @RequestMapping(value= "/processForm")  // sub mapping
    public ModelAndView processForm(HttpServletRequest request, Model model) {
        // read the request parameter from the HTML form
        String name = request.getParameter("studentName");

        // convert the data to all caps
        name.toUpperCase();

        // create the message
        String result = "Yo! " + name;

        // add message to the model
        model.addAttribute("message", result);

        return new ModelAndView("jsp/view/main-menu.jsp");
    }

    @RequestMapping(value= "/processFormThree")
    public ModelAndView processFormTree(@RequestParam("studentName") String name, Model model) {

        // convert the data to all caps
        name = name.toUpperCase();

        // create the message
        String result = "Hey my friend from V3 " + name +"!";

        // add message to the model
        model.addAttribute("message", result);

        return new ModelAndView("jsp/view/main-menu.jsp");
    }




}
