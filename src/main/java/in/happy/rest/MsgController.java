package in.happy.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgController {
	
	//status code 200
    // @PostMapping("/save")
    //public String saveMsg() {
    //return "setting data to post man";
    //}
	  
	// Making status code 201
	  @PostMapping("/save")
		public ResponseEntity<String> save() {
			String Responsebody = "welcome to first Api";
			return new ResponseEntity<String>(Responsebody, HttpStatus.CREATED);
		}
	
	@GetMapping("/welcome")
	public ResponseEntity<String>  getWelcomeMsg() {
		String msg = "welcome to first Api";
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
	@GetMapping("/greet")
	public String getGreetMsg() {
		String msg = "Good Morning";
		return msg;
	}

}
