import { Component } from '@angular/core';
import { Employee } from './model/Employee';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'EMS_AngularProject';
  employee: Employee;

  constructor() {
    this.employee = new Employee();
  }

  insertEmployee(data: any) {
    this.employee.empId = data.empId;
    this.employee.empName = data.empName;
    this.employee.empSalary = data.empSalary;
    alert(data.empId + " " + data.empName + " " + data.empSalary);
  }
}
