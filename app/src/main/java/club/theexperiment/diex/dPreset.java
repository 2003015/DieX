package club.theexperiment.diex;

import android.net.Uri;
import android.content.Context;


public class dPreset extends Die {
       //Creates a member of die class and sets number of sides
    private Uri[] uriList;
    public dPreset(int s) {
        setSides(s);

        /*
        if(s==2){this.setUriList(new Uri[] {Uri.parse("android.resource://" + club.theexperiment.diex.R.raw.),Uri.parse("android.resource://" + club.theexperiment.diex.R.raw.)});}
        if(s==4){this.setUriList(new Uri[] {Uri.parse("android.resource://" + club.theexperiment.diex.R.raw.),Uri.parse("android.resource://" + club.theexperiment.diex.R.raw.),Uri.parse("android.resource://" + club.theexperiment.diex.R.raw.),Uri.parse("android.resource://" + club.theexperiment.diex.R.raw.)});}
        */if(s==6){this.setUriList(new Uri[] {Uri.parse("android.resource://" + club.theexperiment.diex.R.raw.d6_1),Uri.parse("android.resource://" + club.theexperiment.diex.R.raw.d6_2),Uri.parse("android.resource://" + club.theexperiment.diex.R.raw.d6_3),Uri.parse("android.resource://" + club.theexperiment.diex.R.raw.d6_4),Uri.parse("android.resource://" + club.theexperiment.diex.R.raw.d6_5),Uri.parse("android.resource://" + club.theexperiment.diex.R.raw.d6_6)});}
        /*if(s==8){this.setUriList(new Uri[] {Uri.parse("android.resource://" + club.theexperiment.diex.R.raw.),Uri.parse("android.resource://" + club.theexperiment.diex.R.raw.),Uri.parse("android.resource://" + club.theexperiment.diex.R.raw.),Uri.parse("android.resource://" + club.theexperiment.diex.R.raw.),Uri.parse("android.resource://" + club.theexperiment.diex.R.raw.),Uri.parse("android.resource://" + club.theexperiment.diex.R.raw.),Uri.parse("android.resource://" + club.theexperiment.diex.R.raw.),Uri.parse("android.resource://" + club.theexperiment.diex.R.raw.)});}
        if(s==10){this.setUriList(new Uri[] {Uri.parse("android.resource://" + club.theexperiment.diex.R.raw.),Uri.parse("android.resource://" + club.theexperiment.diex.R.raw.),Uri.parse("android.resource://" + club.theexperiment.diex.R.raw.),Uri.parse("android.resource://" + club.theexperiment.diex.R.raw.),Uri.parse("android.resource://" + club.theexperiment.diex.R.raw.),Uri.parse("android.resource://" + club.theexperiment.diex.R.raw.),Uri.parse("android.resource://" + club.theexperiment.diex.R.raw.),Uri.parse("android.resource://" + club.theexperiment.diex.R.raw.),Uri.parse("android.resource://" + club.theexperiment.diex.R.raw.),Uri.parse("android.resource://" + club.theexperiment.diex.R.raw.)});}
        if(s==12){this.setUriList(new Uri[] {Uri.parse("android.resource://" + club.theexperiment.diex.R.raw.),Uri.parse("android.resource://" + club.theexperiment.diex.R.raw.),Uri.parse("android.resource://" + club.theexperiment.diex.R.raw.),Uri.parse("android.resource://" + club.theexperiment.diex.R.raw.),Uri.parse("android.resource://" + club.theexperiment.diex.R.raw.),Uri.parse("android.resource://" + club.theexperiment.diex.R.raw.),Uri.parse("android.resource://" + club.theexperiment.diex.R.raw.),Uri.parse("android.resource://" + club.theexperiment.diex.R.raw.),Uri.parse("android.resource://" + club.theexperiment.diex.R.raw.),Uri.parse("android.resource://" + club.theexperiment.diex.R.raw.),Uri.parse("android.resource://" + club.theexperiment.diex.R.raw.),Uri.parse("android.resource://" + club.theexperiment.diex.R.raw.)});}
        if(s==20){this.setUriList(new Uri[] {Uri.parse("android.resource://" + club.theexperiment.diex.R.raw.),Uri.parse("android.resource://" + club.theexperiment.diex.R.raw.),Uri.parse("android.resource://" + club.theexperiment.diex.R.raw.),Uri.parse("android.resource://" + club.theexperiment.diex.R.raw.),Uri.parse("android.resource://" + club.theexperiment.diex.R.raw.),Uri.parse("android.resource://" + club.theexperiment.diex.R.raw.),Uri.parse("android.resource://" + club.theexperiment.diex.R.raw.),Uri.parse("android.resource://" + club.theexperiment.diex.R.raw.),Uri.parse("android.resource://" + club.theexperiment.diex.R.raw.),Uri.parse("android.resource://" + club.theexperiment.diex.R.raw.),Uri.parse("android.resource://" + club.theexperiment.diex.R.raw.),Uri.parse("android.resource://" + club.theexperiment.diex.R.raw.),Uri.parse("android.resource://" + club.theexperiment.diex.R.raw.),Uri.parse("android.resource://" + club.theexperiment.diex.R.raw.),Uri.parse("android.resource://" + club.theexperiment.diex.R.raw.),Uri.parse("android.resource://" + club.theexperiment.diex.R.raw.),Uri.parse("android.resource://" + club.theexperiment.diex.R.raw.),Uri.parse("android.resource://" + club.theexperiment.diex.R.raw.),Uri.parse("android.resource://" + club.theexperiment.diex.R.raw.),Uri.parse("android.resource://" + club.theexperiment.diex.R.raw.)});}
        */
        else{this.setUriList(new Uri[] {Uri.parse("android.resource://" + club.theexperiment.diex.R.raw.d6_1),Uri.parse("android.resource://" + club.theexperiment.diex.R.raw.d6_1), Uri.parse("android.resource://" + club.theexperiment.diex.R.raw.d6_1),Uri.parse("android.resource://" + club.theexperiment.diex.R.raw.d6_1),Uri.parse("android.resource://" + club.theexperiment.diex.R.raw.d6_1),Uri.parse("android.resource://" + club.theexperiment.diex.R.raw.d6_1),Uri.parse("android.resource://" + club.theexperiment.diex.R.raw.d6_1),Uri.parse("android.resource://" + club.theexperiment.diex.R.raw.d6_1),Uri.parse("android.resource://" + club.theexperiment.diex.R.raw.d6_1),Uri.parse("android.resource://" + club.theexperiment.diex.R.raw.d6_1),Uri.parse("android.resource://" + club.theexperiment.diex.R.raw.d6_1),Uri.parse("android.resource://" + club.theexperiment.diex.R.raw.d6_1),Uri.parse("android.resource://" + club.theexperiment.diex.R.raw.d6_1),Uri.parse("android.resource://" + club.theexperiment.diex.R.raw.d6_1),Uri.parse("android.resource://" + club.theexperiment.diex.R.raw.d6_1),Uri.parse("android.resource://" + club.theexperiment.diex.R.raw.d6_1),Uri.parse("android.resource://" + club.theexperiment.diex.R.raw.d6_1),Uri.parse("android.resource://" + club.theexperiment.diex.R.raw.d6_1),Uri.parse("android.resource://" + club.theexperiment.diex.R.raw.d6_1),Uri.parse("android.resource://" + club.theexperiment.diex.R.raw.d6_1)});}
    }
}


