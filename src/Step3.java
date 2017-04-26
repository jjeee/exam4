//Jae Jee
//CIS211 401

import java.io.IOException;

public class Step3 {

    public Step3() throws IOException{
        java.io.PrintWriter output=new java.io.PrintWriter("exam4out3.txt");
        MyArtworks myArtworks=new MyArtworks("Exam4Arts.txt");
        myArtworks.print(output);
        output.close();
    }
}
