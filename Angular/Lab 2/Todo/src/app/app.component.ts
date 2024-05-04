import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { WrapperComComponent } from './wrapper-com/wrapper-com.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet,WrapperComComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'todo_app';
}
