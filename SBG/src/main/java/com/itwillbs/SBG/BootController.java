package com.itwillbs.SBG;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BootController {
	
	@RequestMapping(value = "/test1",method = RequestMethod.GET)
	public String test1() throws Exception{
		
		//기능1번 구현
		//깃허브에서 1번 기능 수정하기
		//로컬에서 작업하기 1번
		
		return "test";
	}

}

