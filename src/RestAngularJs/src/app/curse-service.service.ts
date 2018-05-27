import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {AppComponent, PeriodicElement} from "./app.component";
import {Cursa} from "./Material/Cursa";

@Injectable({
  providedIn: 'root'
})
export class CurseServiceService {

  constructor(private http: HttpClient) {
  }
  getAll(){
    return this.http.get<Cursa[]>("http://localhost:8080/cursa/getAllCurse")
  }
}
