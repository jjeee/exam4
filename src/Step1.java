//Jae Jee
//CIS211 401

import java.io.IOException;
import java.util.Scanner;

public class Step1 {

    public Step1() throws IOException{
        ArtMap artMap=new ArtMap("exam4Arts.txt");
        Scanner input=new Scanner(System.in);
        int idChoice;

        do {
            System.out.println("Please enter an Art ID (0 to quit) ==> ");
            idChoice=input.nextInt();

            if (idChoice==0){
                System.out.println("Bye!");
                break;
            }


            if (artMap.onList(idChoice))
                System.out.println(artMap.retrieveArtist(idChoice));
            else
                System.out.println("Artist not found!\n");


        }while(idChoice!=0);
    }
}
