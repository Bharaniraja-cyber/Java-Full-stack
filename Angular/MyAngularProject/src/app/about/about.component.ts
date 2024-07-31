import { Component } from '@angular/core';
import { CalculatorService, Factorialservive } from '../calculator.service';

@Component({
  selector: 'app-about',
  templateUrl: './about.component.html',
  styleUrl: './about.component.css'
})
export class AboutComponent {
  sum1 : number
  table: number
  constructor(private cal:CalculatorService,private fac :Factorialservive){
  this.sum1 = cal.getsub(60,20)
  this.table = fac.getfact(9)
  }
}
