package kr.co.mlec.body;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import kr.co.mlec.form.MemberVO;

@RestController
@RequestMapping("/ajax")
public class ResBodyController2 {

	@RequestMapping("/restBody.do")
	public String resStringBody() {
		return "OK, 성공";
	}

	@RequestMapping("/restBody.json")
	public Map<String, String> resJsonBody() {
		Map<String, String> result = new HashMap<String, String>();
		result.put("id", "sbc");
		result.put("name", "hong");
		result.put("addr", "서울");
		return result;
	}
	
	@RequestMapping("/restVOBody.json")
	public MemberVO resJsonVOBody() {
		MemberVO vo = new MemberVO();
		vo.setId("sbc");
		vo.setName("sbc");
		vo.setPassword("1234");
		return vo;
	}
	
	@RequestMapping("/restStringListBody.json")
	public List resJsonStringListBody() {
		List<String> list = new ArrayList<String>();
		for (int i = 1; i < 4; i++) {
			list.add(String.valueOf(i));
		}
		return list;
	}
	
	
	
	@RequestMapping("/restVOListBody.json")
	public List<MemberVO> resJsonVOListBody() {
		List<MemberVO> list = new ArrayList<>();
		for (int i = 1; i < 4; i++) {
			MemberVO vo = new MemberVO();
			vo.setId("sbc");
			vo.setName("sbc");
			vo.setPassword("1234");
			list.add(vo);
		}
		return list;
	}
	
}