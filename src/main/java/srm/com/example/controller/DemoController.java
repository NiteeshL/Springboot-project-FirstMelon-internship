package srm.com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import srm.com.example.dto.DemoDTO;
import srm.com.example.repo.DemoRepo;

@Controller
public class DemoController {

    @Autowired
    private DemoRepo demoRepo;

    @GetMapping("/add-student")
    public String showAddStudentForm(Model model) {
        model.addAttribute("student", new DemoDTO());
        return "add-student"; 
    }

    @PostMapping("/add-student")
    public String addStudent(@ModelAttribute DemoDTO student) {
        demoRepo.save(student);
        return "redirect:/view-student";
    }

    @GetMapping("/view-student")
    public String viewStudents(Model model) {
        model.addAttribute("students", demoRepo.findAll());
        return "view-student";
    }
}
