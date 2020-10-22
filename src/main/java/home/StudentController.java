package home;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping(value = "/showForm")
    public ModelAndView showForm(Model model) {
        // create a new student object
        Student student = new Student();

        // add student object to the model
        model.addAttribute("student ", student); // first student - name, second student - the value

        return new ModelAndView("jsp/view/student-form.jsp");
    }

    /*@RequestMapping(value= "/processFrom")
    public String processForm(@ModelAttribute("student") Student student) {
        // log the input data
        System.out.println("Student: " + student.getFirstName() + " " + student.getLastName());

        return "jsp/view/student-conformation.jsp";
    }*/

    @RequestMapping(value= "/processFrom")
    public ModelAndView processForm(@ModelAttribute("student") Student student) {
        // log the input data
        System.out.println("Student: " + student.getFirstName() + " " + student.getLastName());

        return new ModelAndView("jsp/view/student-conformation.jsp");
    }
}
