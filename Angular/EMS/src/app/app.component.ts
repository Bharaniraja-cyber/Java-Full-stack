import { Component } from '@angular/core';
import { Employee } from './model/Employee';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  employee :Employee;
constructor(){
  this.employee = new Employee();
}

  insertEmployee(data: any){
    this.employee.empId = data.empId;
    this.employee.empName = data.empName;
    this.employee.empSalary = data.empSalary;
    alert("Employee Id : "+data.empId+"\n"+"Employee Name : "+data.empName+ "\n"+"Employee Salary : "+data.empSalary);
  }
}
