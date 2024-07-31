import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CalculatorService {
  getAdd(a:number,b:number){
    return a+b
  }

  getsub(a:number,b:number){
    return a-b
  }
  
  getmul(a:number,b:number){
    return a*b
  }
}

export class Factorialservive{
  getfact(a:number,result:number=1){
    for(let i=1;i<=a;i++){
      result *= i
    }
    return result
   }
}