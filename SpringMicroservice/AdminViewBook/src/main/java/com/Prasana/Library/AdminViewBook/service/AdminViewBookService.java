package com.Prasana.Library.AdminViewBook.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Prasana.Library.AdminViewBook.dto.AdminViewBookDTO;
import com.Prasana.Library.AdminViewBook.entity.AdminViewBook;
import com.Prasana.Library.AdminViewBook.repository.AdminViewBookRepository;

@Service
@Transactional
public class AdminViewBookService {
	
	@Autowired
	AdminViewBookRepository adminBookRepository;
	
	public AdminViewBookDTO getBookById(Integer id) {
		AdminViewBookDTO adminViewBookDTO=null;
		
		Optional<AdminViewBook> optional=adminBookRepository.findById(id);
		if(optional.isPresent()) {
			AdminViewBook adminViewBook=optional.get();
			 adminViewBookDTO=AdminViewBookDTO.valueOf(adminViewBook);
		}
		
			
		return adminViewBookDTO;
	}
	
	public List<AdminViewBookDTO> getAllBooks(){
		List<AdminViewBookDTO> adminViewBookDTOList=new ArrayList<>();
		List<AdminViewBook> adminViewBooksList=adminBookRepository.findAll();
		for(AdminViewBook adminViewBook:adminViewBooksList) {
			AdminViewBookDTO adminViewBookDTO=new AdminViewBookDTO();
			adminViewBookDTO=AdminViewBookDTO.valueOf(adminViewBook);
			adminViewBookDTOList.add(adminViewBookDTO);
		}
		return adminViewBookDTOList;
	}
	public List<AdminViewBookDTO> getBookByName(String bookName) {
		List<AdminViewBookDTO> adminViewBookDTOList=new ArrayList<>();
		List<AdminViewBook> adminViewBooksList=adminBookRepository.findByBookName(bookName);
		for(AdminViewBook adminViewBook:adminViewBooksList) {
			AdminViewBookDTO adminViewBookDTO=new AdminViewBookDTO();
			adminViewBookDTO=AdminViewBookDTO.valueOf(adminViewBook);
			adminViewBookDTOList.add(adminViewBookDTO);
		}
		return adminViewBookDTOList;
	}
	
	public List<AdminViewBookDTO> getBookByAuthor(String authorName){
		List<AdminViewBookDTO> adminViewBookDTOList=new ArrayList<>();
		List<AdminViewBook> adminViewBooksList=adminBookRepository.findByAuthorName(authorName);
		for(AdminViewBook adminViewBook:adminViewBooksList) {
			AdminViewBookDTO adminViewBookDTO=new AdminViewBookDTO();
			adminViewBookDTO=AdminViewBookDTO.valueOf(adminViewBook);
			adminViewBookDTOList.add(adminViewBookDTO);
		}
		return adminViewBookDTOList;
	}
	public List<AdminViewBookDTO> getBookByPublication(String publicationName){
		List<AdminViewBookDTO> adminViewBookDTOList=new ArrayList<>();
		List<AdminViewBook> adminViewBooksList=adminBookRepository.findByPublicationName(publicationName);
		for(AdminViewBook adminViewBook:adminViewBooksList) {
			AdminViewBookDTO adminViewBookDTO=new AdminViewBookDTO();
			adminViewBookDTO=AdminViewBookDTO.valueOf(adminViewBook);
			adminViewBookDTOList.add(adminViewBookDTO);
		}
		return adminViewBookDTOList;
	}
	public List<AdminViewBookDTO> getBookByAvailable(String available){
		List<AdminViewBookDTO> adminViewBookDTOList=new ArrayList<>();
		List<AdminViewBook> adminViewBooksList=adminBookRepository.findByAvailable(available);
		for(AdminViewBook adminViewBook:adminViewBooksList) {
			AdminViewBookDTO adminViewBookDTO=new AdminViewBookDTO();
			adminViewBookDTO=AdminViewBookDTO.valueOf(adminViewBook);
			adminViewBookDTOList.add(adminViewBookDTO);
		}
		return adminViewBookDTOList;
	}
	
}
