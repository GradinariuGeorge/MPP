import { TestBed, inject } from '@angular/core/testing';

import { CurseServiceService } from './curse-service.service';

describe('CurseServiceService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [CurseServiceService]
    });
  });

  it('should be created', inject([CurseServiceService], (service: CurseServiceService) => {
    expect(service).toBeTruthy();
  }));
});
