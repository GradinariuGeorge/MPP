import { Component } from '@angular/core';
import {MatTableDataSource} from '@angular/material';
import {CurseServiceService} from "./curse-service.service";
import {Cursa} from "./Material/Cursa";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})

export class AppComponent {
  displayedColumns = ['idCursa', 'Capacitate', 'NrParticipanti'];
  dataSource : Cursa[]=[]

  applyFilter(filterValue: string) {
    filterValue = filterValue.trim(); // Remove whitespace
    filterValue = filterValue.toLowerCase(); // MatTableDataSource defaults to lowercase matches

  }
  constructor(private service:CurseServiceService) {

  }

  ngOnInit() {
    this.service.getAll().subscribe(
      (obiecte)=>this.dataSource=obiecte
    )
  }
 }


export interface PeriodicElement {
  idCursa: number;
  Capacitate: number;
  NrParticipanti: number;

}

const ELEMENT_DATA: PeriodicElement[] = [
  {idCursa: 1, Capacitate: 2, NrParticipanti: 1},
  {idCursa: 2, Capacitate: 2, NrParticipanti: 1},
  {idCursa: 3, Capacitate: 2, NrParticipanti: 1},
  {idCursa: 4, Capacitate: 2, NrParticipanti: 1},
  {idCursa: 5, Capacitate: 2, NrParticipanti: 1},
  {idCursa: 6, Capacitate: 2, NrParticipanti: 1},
  {idCursa: 7, Capacitate: 2, NrParticipanti: 1},
  {idCursa: 8, Capacitate: 2, NrParticipanti: 1},
  {idCursa: 9, Capacitate: 2, NrParticipanti: 1},
  {idCursa: 10, Capacitate: 2, NrParticipanti: 1},

];
