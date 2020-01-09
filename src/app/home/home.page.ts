import { Component } from '@angular/core';
import { InAppBrowser } from '@ionic-native/in-app-browser/ngx';
import { Platform } from '@ionic/angular';
import { NavController  } from '@ionic/angular';

@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
})
export class HomePage {

  constructor(public navCtrl: NavController, private iab: InAppBrowser){
    }

    ngOnInit(){
      const browser = this.iab.create('http://theredfoxfire.github.io/','_self',{location:'no'});
    }
}
