import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  name : String;
  age : number;
  email : String;
  txtcolor:String;
  img : String;
constructor(){
  this.name = "bharani"
  this.age = 20;
  this.email = "bharaniraja21@gmail.com" ;
  this.txtcolor = "green";
  this.img = "https://n1.sdlcdn.com/imgs/k/v/x/Men_sitenavigation-b972a.jpg"
}

getadd(a:number,b:number){
  let sum = a+b;
  return sum
}

getmul(a:number,b:number){
 let multiply = a*b;
  return multiply
}

change() {
  this.name = "bharaniraja"
}

}
