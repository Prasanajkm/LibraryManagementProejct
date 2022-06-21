package com.Prasana.Library.AdminViewBook.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Prasana.Library.AdminViewBook.entity.AdminViewBook;

@Repository
public interface  AdminViewBookRepository extends JpaRepository<AdminViewBook,Integer> {
	List<AdminViewBook> findByBookName(String bookName);
	List<AdminViewBook> findByAuthorName(String authorName);
	List<AdminViewBook> findByPublicationName(String publicationName);
	List<AdminViewBook>  findByAvailable(String available);
	
}
