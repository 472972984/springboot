package indi.chq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import indi.chq.entity.Users;
import indi.chq.service.TestService;


//@RestController的意思就是controller里面的方法都以json格式输出，不用再写什么jackjson配置的了！
@RestController
public class TestController {
	
	@Autowired
	private TestService testService;
	
	@RequestMapping("/queryUsers/{id}")
	public Users queryUsers(@PathVariable long id){
		return testService.getUserById(id);
	}
	

	@RequestMapping("/test")
	public String Demo(){
		return "Hello World";
	}
	
}
