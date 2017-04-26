//Jae Jee
//CIS211 401

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MyArtworks {
    MyArtists myArtists=new MyArtists("exam4Artists.txt");
    Scanner input;

    public MyArtworks(String fileName) throws IOException{
        input=new Scanner(new File(fileName));
        ArrayList<ArtNode> artList = new ArrayList<>();


        input.useDelimiter("\t|\r\n");
            while (input.hasNext()){
                int artID=input.nextInt();
                String artTitle=input.next();
                int artistID=input.nextInt();
                int value=input.nextInt();

                artList.add(new ArtNode(artID,artTitle,artistID,value,null,null));
            }
        Collections.sort(artList);
        for (ArtNode artNode:artList){
            myArtists.map.get(artNode.getArtistID()).add(artNode);
        }
    }

    public void print(java.io.PrintWriter output){
        for (int i=1;i<(myArtists.map).size()+1;i++){
            output.println((myArtists.map.get(i)));
            ((myArtists.map).get(i)).printList(output);
        }
    }
}
