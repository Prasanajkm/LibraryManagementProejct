package com.Prasana.Library.AdminAddBook.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Prasana.Library.AdminAddBook.dto.AdminAddBookDTO;
import com.Prasana.Library.AdminAddBook.exception.AdminAddBookException;
import com.Prasana.Library.AdminAddBook.service.AdminAddBookService;

@RestController
@RequestMapping("/adminAddBook")
@CrossOrigin
@PropertySource("message.properties")
public class AdminAddBookController {
	
	@Autowired
	private AdminAddBookService adminAddBookService;
	
	@Value("${API.REGISTER.SUCCESS}")
	String sm;
	@Autowired
	public Environment  env;
	
	@PostMapping(value="/addBook")
	public ResponseEntity<String> addBook(@RequestBody AdminAddBookDTO adminViewBookDTO) throws AdminAddBookException {
		Integer bookId=adminAddBookService.addBook(adminViewBookDTO);
		//environment.getpr
		
		String sm1;
		return new ResponseEntity<String>(sm+" :"+bookId,HttpStatus.CREATED);
	}
}
