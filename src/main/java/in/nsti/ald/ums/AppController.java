package in.nsti.ald.ums;

import org.springframework.beans.factory.annotation.Autowired;
/*import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;*/
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class AppController {
	
	@Autowired
	private StudentService studentSrevice;
	
	
	@GetMapping("/")
	public String home() {
		
		return "index";
	}
	
	@GetMapping("/index")
	public String index() {
		return "index";
	}
	@GetMapping("/about")
	public String about() {
		return "about";
	}
	@GetMapping("/contact")
	public String contact() {
		return "contact";
	}
	@GetMapping("/StudentTable")
	public String StudentTable() {
		return "StudentTable";
	}
	@GetMapping("/team")
	public String team() {
		return "team";
	}
	@GetMapping("/course")
	public String course() {
		return "course";
	}
	@GetMapping("/instructor")
	public String instructor() {
		return "instructor";
	}
	@GetMapping("/testimonial")
	public String testimonial() {
		return "testimonial";
	}
	
	@GetMapping("/fees")
	public String fees() {
		return "fees";
	}
	
	@GetMapping("/myprogress")
	public String myprogress() {
		return "myprogress";
	}
	@GetMapping("/result")
	public String result() {
		return "result";
	}
	
	@GetMapping("/feature")
	public String feature() {
		return "feature";
	}
	
	@GetMapping("/signup")
	public String signup(Model model) {
		Student student= new Student();
		model.addAttribute("student",student);
		return "signup";	
	}
	
	@PostMapping("saveStudent")
	public String saveStudent(Student student) {
        studentService.saveStudent(student);  // this will avoid the null pointer issue
        return "redirect:/students";
    }
  	
	@GetMapping("/student")
	public String student() {
		return "student";
	}
	
	@GetMapping("/studentDetail")
	public String StudentDetail() {
		return "StudentDetail";
	}
	
	@GetMapping("/admin")
	public String admin() {
		return "admin";
	}

	@GetMapping("/admin_login")
	public String admin_login() {
		return "admin_login";
	}

	@GetMapping("/paid_fees")
	public String paid_fees() {
		return "paid_fees";
	}

	@GetMapping("/student_progress")
	public String student_progress() {
		return "student_progress";
	}
	
	@GetMapping("/Architecture")
	public String Architecture() {
		return "Architecture";
	}
	
	@GetMapping("/Biology")
	public String Biology() {
		return "Biology";
	}
	
	@GetMapping("/CSE")
	public String CSE() {
		return "CSE";
	}
	
	@GetMapping("/devops")
	public String devops() {
		return  "devops";
	}
	
	@GetMapping("/fashion")
	public String fashion() {
		return "fashion";
	}
	
	@GetMapping("/law")
	public String law() {
		return "law";
	}
	
	@GetMapping("/math")
	public String math() {
		return "math";
	}
	
	@GetMapping("/PhysicalEducation")
	public String PhysicalEducation() {
		return "PhysicalEducation";
	}
	
	@GetMapping("/uiUx")
	public String uiUx() {
		return "uiUx";
	}
}