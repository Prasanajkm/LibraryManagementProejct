import { Component, OnInit } from '@angular/core';
import { AdminViewBookService } from './admin-view-book.service';
import { adminViewBook } from './adminViewBook';

@Component({
  selector: 'app-admin-view-book',
  templateUrl: './admin-view-book.component.html',
  styleUrls: ['./admin-view-book.component.css']
})
export class AdminViewBookComponent implements OnInit {

  books!: adminViewBook;
  booksList!:adminViewBook[];
  errorMessage!: string;
  constructor(private adminViewBookService :AdminViewBookService) { }

  ngOnInit(): void {
    
    this.adminViewBookService.getAdminViewBookById().subscribe({
      next:  books => this.books = books,
      error:error => this.errorMessage = <any>error

  })
  this.adminViewBookService.getAllBooks().subscribe({
    next:booksList=> this.booksList=booksList
  })

  }
  // getAdminViewBookById(){
  //   this.adminViewBookService.getAdminViewBookById().subscribe({
  //     next:  books => this.books = books,
  //     error:error => this.errorMessage = <any>error

  // })
  // }
}
