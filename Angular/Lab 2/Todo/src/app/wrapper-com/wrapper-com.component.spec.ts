import { ComponentFixture, TestBed } from '@angular/core/testing';

import { WrapperComComponent } from './wrapper-com.component';

describe('WrapperComComponent', () => {
  let component: WrapperComComponent;
  let fixture: ComponentFixture<WrapperComComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [WrapperComComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(WrapperComComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
