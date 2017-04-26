//Jae Jee
//CIS211 401

import java.io.IOException;
import java.util.Scanner;

public class Step2 {

    public Step2() throws IOException{
        MyArtists myArtists=new MyArtists("exam4Artists.txt");
        MyArtworks myArtworks=new MyArtworks("exam4Arts.txt");
        Scanner input=new Scanner(System.in);
        int idChoice;

        do {
            System.out.println("Please enter an Artist ID (0 to quit) ==> ");
            idChoice=input.nextInt();

            if (idChoice==0){
                System.out.println("Bye!");
                break;
            }


            if (myArtworks.myArtists.onList(idChoice)){
                System.out.println("\nArtist "+idChoice+" is"+myArtworks.myArtists.map.get(idChoice).getArtistName()+"\n"
                        +"His Total Artworks= "+myArtworks.myArtists.map.get(idChoice).getTotalEntries()
                        +" and Total Estimated Value = "+myArtworks.myArtists.map.get(idChoice).getTotalValue());

                System.out.println(myArtworks.myArtists.map.get(idChoice).printList()+"\n");
            }
            else
                System.out.println("Artist "+idChoice+" not found!\n");


        }while(idChoice!=0);
    }
}
