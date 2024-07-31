import { Component } from '@angular/core';
import { CalculatorService, Factorialservive } from '../calculator.service';

@Component({
  selector: 'app-contact',
  templateUrl: './contact.component.html',
  styleUrl: './contact.component.css'
})
export class ContactComponent {
  sum2:number
  alpha:number
  constructor(private cal :CalculatorService,private fact:Factorialservive){
    this.sum2 = cal.getmul(10,20)
    this.alpha = fact.getfact(6)
  }
}
