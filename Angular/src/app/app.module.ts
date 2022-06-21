import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AdminViewBookComponent } from './admin-view-book/admin-view-book.component';
import { ObjectToArrayPipe } from './admin-view-book/object-to-array.pipe';
import { HomeComponent } from './home/home.component';
import { AdminAddBookComponent } from './admin-add-book/admin-add-book.component';
import { ReactiveFormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    AdminViewBookComponent,
    ObjectToArrayPipe,
    HomeComponent,
    AdminAddBookComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
