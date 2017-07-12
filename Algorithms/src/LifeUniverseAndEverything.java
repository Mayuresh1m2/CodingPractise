import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by mayur on 12-07-2017.
 */
public class LifeUniverseAndEverything {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inp = br.readLine();
        while (!inp.isEmpty() && !inp.contentEquals("42")){
            System.out.println(inp);
            inp= br.readLine();
        }
        br.close();
    }
}
