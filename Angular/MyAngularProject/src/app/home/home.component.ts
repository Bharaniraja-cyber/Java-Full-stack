import { Component } from '@angular/core';
import { CalculatorService, Factorialservive } from '../calculator.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrl: './home.component.css'
})
export class HomeComponent {
  sum:number
  fact:number
  constructor(private cal : CalculatorService,private fac:Factorialservive){
    this.sum = cal.getAdd(10,20)
    this.fact = fac.getfact(4)
  }
}
