import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'TravelSystem';
  newTravel = {
    name: '',
    destination: '',
    fromDate: '',
    toDate: '',
    noOfPersons: 1
  };
  travels: any[] = [];
  selectedIndex: number | null = null;

  addTravel() {
    if (this.newTravel.name && this.newTravel.destination) {
      this.travels.push({ ...this.newTravel });
      this.resetForm();
    }
  }

  deleteTravel() {
    if (this.selectedIndex !== null) {
      this.travels.splice(this.selectedIndex, 1);
      this.selectedIndex = null;
    }
  }

  saveTravels() {
    // Implement save logic here
  }

  selectTravel(index: number) {
    this.selectedIndex = index;
  }

  resetForm() {
    this.newTravel = {
      name: '',
      destination: '',
      fromDate: '',
      toDate: '',
      noOfPersons: 1
    };
  }
}
