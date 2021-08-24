package kr.co.mlec.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	@RequestMapping("/hello/hello.do")
	public ModelAndView hello() {
		System.out.println("request mapping");
		ModelAndView mav= new ModelAndView("hello/hello");
		mav.addObject("msg" , "hi 스피링 MVC ~~~");
		return mav;
	}

}
