import { Component } from '@angular/core';
import { AddToDoComponent } from '../add-to-do/add-to-do.component';
import { ToDoListComponent } from '../to-do-list/to-do-list.component';

@Component({
  selector: 'app-wrapper-com',
  standalone: true,
  imports: [AddToDoComponent,ToDoListComponent],
  templateUrl: './wrapper-com.component.html',
  styleUrl: './wrapper-com.component.css'
})
export class WrapperComComponent {
  todos: any=[];
  addTask(task:any){
    this.todos.push(task);
  }
 

}
