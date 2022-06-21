import { TestBed } from '@angular/core/testing';

import { AdminAddBookService } from './admin-add-book.service';

describe('AdminAddBookService', () => {
  let service: AdminAddBookService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(AdminAddBookService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
