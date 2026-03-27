package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller			// 서버 사용할 시, 이 파일을 찾을 수 있게끔 함
public class index {
	@GetMapping("/")		//localhost:8080 접속할 때
	@ResponseBody			//아래의 내용으로 응답한다.
	public String helloworld() {
		return "Docker 잘 연동되었습니다!!";
	}
	
}
