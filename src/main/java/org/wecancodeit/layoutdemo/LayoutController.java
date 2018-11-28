package org.wecancodeit.layoutdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LayoutController {

	@RequestMapping("/home")
	public String home() {
		return "home";
	}

	@RequestMapping("/hello")
	public String hello() {
		return "hello";
	}


}
