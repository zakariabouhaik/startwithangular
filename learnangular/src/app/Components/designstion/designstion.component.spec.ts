import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DesignstionComponent } from './designstion.component';

describe('DesignstionComponent', () => {
  let component: DesignstionComponent;
  let fixture: ComponentFixture<DesignstionComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [DesignstionComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DesignstionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
