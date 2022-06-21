import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdminViewBookComponent } from './admin-view-book/admin-view-book.component';

const routes: Routes = [
  { path: "adminViewBook", component: AdminViewBookComponent }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
