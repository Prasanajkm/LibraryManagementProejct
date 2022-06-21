package com.Prasana.Library.AdminAddBook.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Prasana.Library.AdminAddBook.repository.AdminAddBookRepository;
import com.Prasana.Library.AdminAddBook.dto.*;
import com.Prasana.Library.AdminAddBook.entity.AdminAddBookEntity;
import com.Prasana.Library.AdminAddBook.exception.AdminAddBookException;
@Service
@Transactional
public class AdminAddBookService {
	
	@Autowired
	private AdminAddBookRepository adminAddBookRepository;
	
	
	public Integer addBook(AdminAddBookDTO adminAddBookDTO) throws AdminAddBookException {
		List<AdminAddBookEntity> list=adminAddBookRepository. findByRackNumber(adminAddBookDTO.getRackNumber());
		if(list.isEmpty()) {
		
		AdminAddBookEntity adminAddBookEntity=adminAddBookDTO.createEntity();
		adminAddBookRepository.save(adminAddBookEntity);
		System.out.println(adminAddBookEntity.getBookId());
		return adminAddBookEntity.getBookId();
		}
		else
			throw new AdminAddBookException("Service.RACK_FULL");
		
	}
}
