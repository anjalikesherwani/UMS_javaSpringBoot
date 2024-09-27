package in.nsti.ald.ums;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
/*import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;*/
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class AppController {
	
	@Autowired
	private StudentService studentService;  
	
	@Autowired
    private LeaveRepository leaveRepository;  // Injecting the leaveRepository
	
	 @Autowired
	 private FeesRepository feesRepository;  // Injecting the FeesRepository

	 @Autowired
	 private checkLeavesReopsitory checkleavesReopsitory;   // Injecting the checkleavesRepository
	
	 @Autowired
	 private PaidFeesRepository paidfeesRepository;   // Injecting the paidfeesRepository
	 
	 
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
        return "redirect:/student";
    }
  	
	@GetMapping("/student")
	public String student() {
		return "student";
	}
	
	@GetMapping("/studentDetail")
	public String showLeaveForm(Model model) {
        model.addAttribute("leave", new Leave());
        return "studentDetail";  // Corresponds to the Thymeleaf template
	}
	
	@PostMapping("/applyLeave")
    public String applyLeave(@ModelAttribute("leave") Leave leave, Model model) {
        leave.setStatus("Leave Applied");  // Update status upon applying
        leaveRepository.save(leave);
        
        model.addAttribute("message", "Leave Applied Successfully!");
        model.addAttribute("leave", leave);
        
        return "redirect:/index";  // Redirect to a status page
    }
	
	
	@GetMapping("/fees")
	public String showFeesForm(Model model) {
        model.addAttribute("fees", new Fees());  // Add an empty Fees object to the model
        return "fees";  // Return the Thymeleaf template for the form
	}

	@PostMapping("/fees")
	public String submitFees(@ModelAttribute("fees") Fees fees, Model model) {
		
		System.out.println("Amount: " + fees.getAmount());  // Debugging to check value
		
		fees.setStatus("Fees Submitted");  // Set status after submission
        feesRepository.save(fees);  // Save the fees record to the database
        
        model.addAttribute("message", "Fees Submitted Successfully!");  // Success message
        model.addAttribute("fees", fees);  // Add the updated fees object to the model
        
        return "redirect:/index";  // Redirect to a status page or display the result
    }
	
	@GetMapping("/admin_login")
	public String admin_login() {
		return "admin_login";
	}
	
	@GetMapping("/admin")
	public String showCheckLeavesForm(Model model) {
        model.addAttribute("checkleaves", new CheckLeaves());
		return "admin";
	}

	@PostMapping("/checkLeaves")
	public String checkLeave(@ModelAttribute("checkleaves") CheckLeaves checkleaves, Model model) {
        checkleavesReopsitory.save(checkleaves);
        
        model.addAttribute("message", "Leave Applied Successfully!");
        model.addAttribute("checkleaves", checkleaves);
        
        return "redirect:/index";  // Redirect to a status page
	}

	@GetMapping("/paid_fees")
	public String showPaidFeesForm(Model model) {
        model.addAttribute("paidfees", new PaidFees());
		return "paid_fees";
	}
	
	@PostMapping("/paidFees")
	public String paidFees(@ModelAttribute("paidfees")PaidFees paidfees, Model model) {
		paidfeesRepository.save(paidfees);
		
		model.addAttribute("message", "Fees submitted Successfully!");
		model.addAttribute("paidfees", paidfees);
		
		return "redirect:/index";
	}
	
	@GetMapping("/student_progress")
	public String student_progress() {
		return "myprogress";
	}	
	@GetMapping("/myprogress")
	public String myprogress() {
		return "myprogress";
	}
	
	@GetMapping("/result")
	public String result() {
		return "result";
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