//Jae Jee
//CIS211 401
public class ArtNode extends Art implements Comparable<ArtNode>{
    ArtNode previous,next;

    public ArtNode(int artID, String artTitle, int artistID, double value, ArtNode previous, ArtNode next) {
        super(artID, artTitle, artistID, value);
        this.previous=previous;
        this.next=next;
    }

    public ArtNode getPrevious() {
        return previous;
    }

    public void setPrevious(ArtNode previous) {
        this.previous = previous;
    }

    public ArtNode getNext() {
        return next;
    }

    public void setNext(ArtNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return String.format("%5d %-15s %5d %10.2f",getArtiD(),getArtTitle(),getArtistID(),getValue());
    }

    @Override
    public int compareTo(ArtNode artNode) {
        if (getArtiD()>artNode.getArtiD())
            return 1;
        else if (getArtiD()<artNode.getArtiD())
            return -1;
        else
            return 0;
    }
}
