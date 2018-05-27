import {NgModule} from "@angular/core";
import {CommonModule } from '@angular/common';
import {MatToolbarModule} from "@angular/material";
import {MatInputModule} from "@angular/material";
import {MatTableModule} from "@angular/material";

@NgModule({
  imports: [CommonModule, MatToolbarModule, MatInputModule, MatTableModule],
  exports: [CommonModule, MatToolbarModule, MatInputModule, MatTableModule],
})
export class CustomMaterialModule { }
