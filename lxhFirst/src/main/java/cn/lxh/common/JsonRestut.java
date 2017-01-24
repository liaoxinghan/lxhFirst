package cn.lxh.common;

import org.springframework.util.StringUtils;

/**
* <p>Title: JsonRestut</p>
* <p>Description: </p>
* <p>Company: zhph</p> 
* @author liaoxinghan
* @date 2016-12-29
*/
public class JsonRestut {

	private String status;

	private String message;

	public JsonRestut() {
	}

	public JsonRestut(String status, String message) {
		super();
		this.status = status;
		this.message = message;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
