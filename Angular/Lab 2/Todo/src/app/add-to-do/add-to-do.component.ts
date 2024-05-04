import { Component , Output, EventEmitter, Input } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-add-to-do',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './add-to-do.component.html',
  styleUrl: './add-to-do.component.css'
})
export class AddToDoComponent {
  @Output() taskAdded = new EventEmitter<string>();
  newTask: string = '';
  addtoTask() {
    this.taskAdded.emit(this.newTask);
    this.newTask = '';
  }

}
