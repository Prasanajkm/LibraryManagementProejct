package com.Prasana.Library.AdminViewBook.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Prasana.Library.AdminViewBook.dto.AdminViewBookDTO;
import com.Prasana.Library.AdminViewBook.service.AdminViewBookService;
@RestController
@CrossOrigin
@RequestMapping("/adminViewBook")
public class AdminViewBookController {
	
	@Autowired
	AdminViewBookService adminViewBookService;
	
	@GetMapping (value="/byId/{id}")
	public AdminViewBookDTO getAdminViewBookServiceById(@PathVariable Integer id) {
		return adminViewBookService.getBookById(id);
	}
	
	@GetMapping(value="/viewAllBooks")
	public List<AdminViewBookDTO> getAdminAllBooks(){
		return  adminViewBookService.getAllBooks();
	}
	
	@GetMapping (value="/byName/{name}")
	public List<AdminViewBookDTO> getBookByName(@PathVariable String name) {
		return adminViewBookService. getBookByName(name);
	}
	
	@GetMapping (value="/byAuthor/{name}")
	public List<AdminViewBookDTO> getBookByAuthor(@PathVariable String name) {
		
		List<AdminViewBookDTO> adminViewBookDTOs=adminViewBookService. getBookByAuthor(name);
		return adminViewBookDTOs;
	}

	@GetMapping (value="/byPublication/{name}")
	public List<AdminViewBookDTO> getBookByPublication(@PathVariable String name) {
		return adminViewBookService. getBookByPublication(name);
	}
	
	@GetMapping(value="/byAvailable/{available}")
	public List<AdminViewBookDTO> getBookByAvailable(@PathVariable String available) {
		return adminViewBookService. getBookByAvailable(available);
	}	
}
