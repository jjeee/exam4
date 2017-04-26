//Jae Jee
//CIS211 401

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ArtMap {
    public Map<Integer,Integer> map= new TreeMap<Integer,Integer>();

    public ArtMap(String fileID) throws IOException{
        Scanner inputFile=new Scanner(new File(fileID));

        inputFile.useDelimiter("\t|\r\n");
        while (inputFile.hasNext()){
            int ArtId=inputFile.nextInt();
            String title=inputFile.next();
            int ArtistID=inputFile.nextInt();
            int value=inputFile.nextInt();

            map.put(ArtId,ArtistID);
        }
    }

    public boolean onList(int idChoice){

        if (map.get(idChoice)==null)
            return false;
        else
            return true;
    }

    public String retrieveArtist(int idChoice){
        String artistID="Artist= "+map.get(idChoice)+"\n";
        return artistID;
    }
}
