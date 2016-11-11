package review;

import java.util.Arrays;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReviewController {
	
	@RequestMapping("/review")
    public String displayReview(Model model) {
        
		Review review = new Review(42, "Hitchhiker's Guide", "Douglas Adams", "Lorem ipsum", new Date(2016, 11, 11));
		model.addAttribute("selectedReview", review);
        return "review-view";
	}
	

}
