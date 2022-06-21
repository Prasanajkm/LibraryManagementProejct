package com.Prasana.Library.AdminAddBook.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Prasana.Library.AdminAddBook.entity.AdminAddBookEntity;

public interface AdminAddBookRepository extends JpaRepository<AdminAddBookEntity, Integer> {
	public List<AdminAddBookEntity> findByRackNumber(String rackNumber);
	
}
