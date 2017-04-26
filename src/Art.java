//Jae Jee
//CIS211 401
public class Art {
    private int artID;
    private double value;
    private int artistID;
    private String artTitle;

    public Art(int artID, String artTitle, int artistID, double value) {
        this.artID = artID;
        this.value = value;
        this.artTitle = artTitle;
        this.artistID=artistID;
    }

    public int getArtistID() {
        return artistID;
    }

    public void setArtistID(int artistID) {
        this.artistID = artistID;
    }

    public int getArtiD() {
        return artID;
    }

    public void setArtiD(int artiD) {
        this.artID = artiD;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getArtTitle() {
        return artTitle;
    }

    public void setArtTitle(String artTitle) {
        this.artTitle = artTitle;
    }

    @Override
    public String toString() {
        return  artID + "\t" + artTitle +  "\t\t" +artistID+"\t\t" + value;
    }
}
