package model;

import android.content.Intent;
import android.net.Uri;
import android.util.Log;

import view.InfoSite;


public class SendEmail {


    public void sendEmail() {

        for (int i = 0; i <Basket.getContent().size() ; i++) {
            Log.d("Kim", Basket.getContent().get(i).getWallName());
            String wallName = Basket.getContent().get(i).getWallName();
            String priceData = Basket.getContent().get(i).getPrice();
            String heightData = Basket.getContent().get(i).getHeight();
            String widthData = Basket.getContent().get(i).getWidth();

            String emptyString = "";
            String fullString = "";
            StringBuilder email = new StringBuilder(emptyString);

            email.append(wallName)
                    .append(", ")
                    .append(priceData)
                    .append(", ")
                    .append(heightData)
                    .append(", ")
                    .append(widthData);

            fullString = email.toString();


            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.putExtra(Intent.EXTRA_EMAIL,new String[]{("kimx4706@edu.easj.dk")});
            intent.putExtra(Intent.EXTRA_SUBJECT, "Forespørgsel på New-Yorker væg");
            intent.putExtra(Intent.EXTRA_TEXT, fullString);

        }






 /*       Intent emailIntent = new Intent(Intent.ACTION_SEND);
// The intent does not have a URI, so declare the "text/plain" MIME type
        emailIntent.setType("text/plain");
        emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[] {"kimx4706@edu.easj.dk"}); // recipients
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Email subject");
        emailIntent.putExtra(Intent.EXTRA_TEXT, "Email message text");
        //emailIntent.putExtra(Intent.EXTRA_STREAM, Uri.parse("content://path/to/email/attachment"));
// You can also attach multiple items by passing an ArrayList of Uris
*/


    }


}
