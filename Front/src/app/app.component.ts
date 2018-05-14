import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'app';
  liczba: Number = 0;
  srednia: Number = 0;
  odpowiedz: Array<number> = [];
 
  constructor(private http: HttpClient) {
 
  }
  
  configUrl = 'http://localhost:8080/Random?count=';
 
  generate=function() {
    return this.http.get(this.configUrl + this.liczba).subscribe(
      res => {
        console.table(res);
		console.log(res);
		this.odpowiedz = res;
      },
      err => {
        console.error(err);
        alert(err);
      }
    );
  }
  
   configUrlAvg = 'http://localhost:8080/Avg?array=';
 
  avg =function() {
    return this.http.get(this.configUrlAvg + this.odpowiedz).subscribe(
      res => {
        console.table(res);
		console.log(res);
		this.srednia = res;
      },
      err => {
        console.error(err);
        alert(err);
      }
    );
  }
  
  
  
  
}
