import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import {MatToolbarModule} from "@angular/material";
import {MatInputModule} from "@angular/material";
import {MatTableModule} from "@angular/material";
import { AppComponent } from './app.component';
import { CommonModule } from '@angular/common';
import { CurseFormComponent } from './curse-form/curse-form.component';
import {CurseServiceService} from './curse-service.service'
@NgModule({
  declarations: [
    AppComponent,
    CurseFormComponent

  ],
  imports: [
    BrowserModule,
    MatToolbarModule,
    MatInputModule,
    MatTableModule,
    CommonModule

  ],
  providers: [CurseServiceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
