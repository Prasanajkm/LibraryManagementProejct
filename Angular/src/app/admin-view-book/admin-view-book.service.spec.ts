import { TestBed } from '@angular/core/testing';

import { AdminViewBookService } from './admin-view-book.service';

describe('AdminViewBookService', () => {
  let service: AdminViewBookService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(AdminViewBookService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
