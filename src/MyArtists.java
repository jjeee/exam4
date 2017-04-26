//Jae Jee
//CIS211 401
import java.io.File;
import java.io.IOException;
import java.util.*;

public class MyArtists {
    public Map<Integer,ArtistNode> map= new TreeMap<Integer,ArtistNode>();

    Scanner input;

    public MyArtists(String inputFile) throws IOException{
        input=new Scanner(new File(inputFile));
        input.useDelimiter("\t|\r\n");
        while (input.hasNext()){
            int id=input.nextInt();
            String name=input.nextLine();

            map.put(id,new ArtistNode(id,name));
        }
    }

    public boolean onList(int idChoice){
        if (map.get(idChoice)==null)
            return false;
        else return true;
    }

    public String ArtistNodeString(int idChoice){
        String artistNode="Artist "+idChoice+", Name="+map.get(idChoice).getArtistName()+", Total Artworks= "
                +map.get(idChoice).getTotalEntries()+", Total Value= "+map.get(idChoice).getTotalValue();
        return artistNode;
    }
}
