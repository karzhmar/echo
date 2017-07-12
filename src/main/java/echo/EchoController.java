package echo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EchoController {

	@RequestMapping( "/dummy" )
	public String greeting( @RequestParam( value = "text" ) String text, Model model ) {
		model.addAttribute("text", text );
		return "echo";
	}
}
