import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { AdminAddBookService } from './admin-add-book.service';

@Component({
  selector: 'app-admin-add-book',
  templateUrl: './admin-add-book.component.html',
  styleUrls: ['./admin-add-book.component.css']
})
export class AdminAddBookComponent implements OnInit {
successMessage!:string;
errorMessage!:String;
addBookForm!:FormGroup

  constructor(
    private formBuilder: FormBuilder,
    private adminAddBookService:AdminAddBookService

  ) { }
  addBook(){
    this.adminAddBookService.addBook(this.addBookForm.value).subscribe(
      (data)=>this.successMessage="Registered Suucessfulyy",
      (error) => {
        console.log(error);
        this.errorMessage = error;
        
      }

    )
  }

  ngOnInit(): void {
    this.addBookForm=this.formBuilder.group({
      bookName:["",Validators.required],
      authorName:["",Validators.required],
      publicationName:["",Validators.required],
      rackNumber:["",Validators.required]
    })
  }

}
