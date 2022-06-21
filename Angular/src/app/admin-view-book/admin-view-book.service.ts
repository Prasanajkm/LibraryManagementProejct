import { Injectable } from '@angular/core';
import { catchError, tap } from 'rxjs/operators';
import {
  HttpClient,
  HttpResponse,
  HttpErrorResponse,
} from "@angular/common/http";
import { Observable,throwError  } from 'rxjs';
import { adminViewBook } from './adminViewBook';
@Injectable({
  providedIn: 'root'
})
export class AdminViewBookService {

  constructor(private http:HttpClient) { }
  getAdminViewBookById():Observable<adminViewBook>{
    console.log("inservice");
    return this.http.get<adminViewBook>("http://localhost:8100/adminViewBook/byId/1000").pipe(
      tap((data: any) => console.log('Data Fetched:' + (data))))
    // return this.http.get<adminViewBook[]>("http://localhost:8100/admin/100");
  }
  getAllBooks(): Observable<adminViewBook[]>{
    return this.http.get<adminViewBook[]>("http://localhost:8100/adminViewBook/viewAllBooks").pipe(
      tap((data: any[]) => console.log('Data Fetched:' + (JSON.stringify(data)))))
  }

  private handleError(err: HttpErrorResponse): Observable<any> {
    let errMsg = '';
    if (err.error instanceof Error) {
      // A client-side or network error occurred. Handle it accordingly.
      console.log('An error occurred:', err.error.message);
      errMsg = err.error.message;
    } else {
      // The backend returned an unsuccessful response code.
      // The response body may contain clues as to what went wrong,
      console.log(`Backend returned code ${err.status}`);
      errMsg = err.error.status;
    }
    return throwError(()=>errMsg);
  }
}
