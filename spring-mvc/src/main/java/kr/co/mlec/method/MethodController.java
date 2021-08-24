package kr.co.mlec.method;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping(value="/method/method.do")
@Controller
public class MethodController {
	
	@RequestMapping(method=RequestMethod.GET)
	public String callGet() {
		System.out.println("method controller1");
		return "method/methodForm";
	}

	@RequestMapping(method=RequestMethod.POST)
	public String callPost() {
		System.out.println("method controller2");
		return "method/methodProcess";	
	}
}


//
//@Controller
//public class MethodController {
//	@RequestMapping(value="/method/method.do", method=RequestMethod.GET)
//	public String callGet() {
//		System.out.println("method controller1");
//		return "method/methodForm";
//	}
//
//	@RequestMapping(value="/method/method.do",method=RequestMethod.POST)
//	public String callPost() {
//		System.out.println("method controller2");
//		return "method/methodProcess";	
//	}
//}
