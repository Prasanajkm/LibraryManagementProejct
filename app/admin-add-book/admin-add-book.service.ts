import { Injectable } from '@angular/core';
import { catchError, tap } from 'rxjs/operators';
import {
  HttpClient,
  HttpResponse,
  HttpErrorResponse,
} from "@angular/common/http";
import { Observable,throwError  } from 'rxjs';
import { adminAddBook } from './admin-add-book';

@Injectable({
  providedIn: 'root'
})
export class AdminAddBookService {

  constructor(
    private http:HttpClient
    ) { }
    addBook(data:adminAddBook):Observable<any>{
      
      return this.http.post('http://localhost:8200/adminAddBook/addBook',data).pipe(
        tap((data1: any) => console.log('Data Fetched:' + (data1))));
    }
}
