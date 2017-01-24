package cn.lxh.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
* <p>Title: IndexController</p>
* <p>Description: </p>
* <p>Company: zhph</p> 
* @author liaoxinghan
* @date 2016-12-16
*/
@Controller
public class IndexController {

	@RequestMapping("/")
	public String toIndex(){
		
		return "main";
	}
	
	@RequestMapping("/view")
	public String toView(String viewName,HttpServletRequest request){
		String header = request.getHeader("X-Requested-With");
		if("XMLHttpRequest".equals(header)){
			return viewName;
		}else{
			return "../../404";
		}
	}
}
