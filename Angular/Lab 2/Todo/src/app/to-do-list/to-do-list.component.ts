import { NgFor } from '@angular/common';
import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-to-do-list',
  standalone: true,
  imports: [NgFor],
  templateUrl: './to-do-list.component.html',
  styleUrl: './to-do-list.component.css'
})
export class ToDoListComponent {
  @Input() todos:any=[];

  deleteTask(index:number) {
    this.todos.splice(index, 1);
  }
}
