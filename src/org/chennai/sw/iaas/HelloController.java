package org.chennai.sw.iaas;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcome() {
		return "index";
	}
	
	@RequestMapping(value = "/hello.sw", method = RequestMethod.GET)
	public @ResponseBody String hello() {
		return "IAAS wishes you good luck.";
	}
}
