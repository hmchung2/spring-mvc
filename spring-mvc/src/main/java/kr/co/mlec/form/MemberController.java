package kr.co.mlec.form;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/form")
public class MemberController {
	@RequestMapping("/joinForm.do")
	public String joinForm() {
		return "form/joinForm";
	}

	@RequestMapping("/join.do")
	public String join(@ModelAttribute("member") MemberVO member, Model model) {
		System.out.println(member.getId());
		System.out.println(member.getPassword());
		System.out.println(member.getName());
		model.addAttribute("msg", "가입이 완료되었습니다.");
		return "form/memberInfo";
		// return "redirect:/form/joinForm.do";
	}
}



//@RequestMapping("/join.do")
//public String join(@ModelAttribute("member") MemberVO member) {
//	System.out.println(member.getId());
//	System.out.println(member.getPassword());
//	System.out.println(member.getName());
//	return "form/memberInfo";
//}



//JSP 에서는 ${memberVO.id} 이런식으로 vo 클래스 이름으로 대체 해야함.
//@RequestMapping("/join.do")
//public String join(MemberVO member  ) {		
//	System.out.println(member);
//	System.out.println(member.getId());
//	System.out.println(member.getPassword());
//	System.out.println(member.getName());
//	return "form/memberInfo";
//}

//@RequestMapping("/join.do")
//public ModelAndView join(MemberVO member  ) {		
//	System.out.println(member);
//	ModelAndView mav= new ModelAndView("form/memberInfo");
//	mav.addObject("member" , member);		
//	return mav;
//}

//@RequestMapping("/join.do")
//public ModelAndView join(@RequestParam("id") String id, @RequestParam("password") String password , @RequestParam("name") String name   ) {
//	MemberVO member = new MemberVO();		
//	member.setId(id);
//	member.setPassword(password);
//	member.setName(name);
//	ModelAndView mav= new ModelAndView("form/memberInfo");
//	mav.addObject("member" , member);		
//	return mav;
//}

//@RequestMapping("/join.do")
//public ModelAndView join(@RequestParam("id") String id, @RequestParam("password") String password , @RequestParam("name") String name   ) {
//	MemberVO member = new MemberVO();		
//	member.setId(id);
//	member.setPassword(password);
//	member.setName(name);
//	ModelAndView mav= new ModelAndView("form/memberInfo");
//	mav.addObject("member" , member);		
//	return mav;
//}


//@RequestMapping("/join.do")
//public String join(HttpServletRequest request) {
//	MemberVO member = new MemberVO();
//	String id = request.getParameter("id");
//	String password = request.getParameter("password");
//	String name = request.getParameter("name");
//	
//	member.setId(id);
//	member.setPassword(password);
//	member.setName(name);
//	request.setAttribute("member",member);
//	System.out.println(member);
//	
//	return "form/memberInfo";
//}