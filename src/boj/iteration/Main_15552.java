package boj.iteration;

import java.io.*;

public class Main_15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCaseCount = Integer.parseInt(reader.readLine());

        for (int i = 0; i < testCaseCount; i++) {
            String[] splits = reader.readLine().split(" ");
            int sum = Integer.parseInt(splits[0]) + Integer.parseInt(splits[1]);
            writer.write(sum + "\n");
        }

        writer.flush();
        writer.close();
        reader.close();
    }
}
