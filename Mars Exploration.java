import java.io.*;
import java.util.*;

class Result {

    public static int marsExploration(String s) {
        int Count = 0;
        String first = "SOS";
      
        for (int j = 0; j < s.length(); j++) {
            if (s.charAt(j) != first.charAt(j % 3)) {
                Count++;
            }
        }
        return Count;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        int result = Result.marsExploration(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
