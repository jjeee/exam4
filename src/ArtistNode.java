//Jae Jee
//CIS211 401
public class ArtistNode extends Artist implements Comparable<ArtistNode>{
    private ArtNode firstNode,lastNode;
    int totalEntries;
    double totalValue;

    public ArtistNode(int artistID, String artistName) {
        super(artistID, artistName);
        totalEntries=0;
        totalValue=0;
    }

    public  int getTotalEntries() {
        return totalEntries;
    }

    public  double getTotalValue() {
        return totalValue;
    }

    @Override
    public String toString() {
        return String.format("%5d %-15s %5d  %10.2f",getArtistID(),getArtistName(),totalEntries,totalValue);
    }

    @Override
    public int compareTo(ArtistNode o) {
        if (getArtistID()>o.getArtistID())
            return 1;
        else if (getArtistID()<o.getArtistID())
            return -1;
        else
            return 0;
    }

    public void printList(java.io.PrintWriter output){
        ArtNode tmp=firstNode;
        while (tmp!=null){
            output.println("\t\t"+tmp);
            tmp=tmp.next;
        }
    }

    public String printList(){
        ArtNode tmp=firstNode;
        String artList="";
        while (tmp!=null){
            artList+="\n\t\t"+tmp;
            tmp=tmp.next;
        }
        return artList;
    }

    public void add(ArtNode artNode){
        artNode.previous=lastNode;

        if (isEmpty())
            firstNode=artNode;
        else
            lastNode.next=artNode;

        lastNode=artNode;
        totalEntries++;
        totalValue+=artNode.getValue();
    }

     public boolean isEmpty(){return totalEntries==0;}
}
