package basic;

import java.io.*;


public class Main {

    public static void main(String[] args) throws IOException {

        FileReader in = new FileReader("C:\\Users\\Ifran\\Desktop\\a.txt");
        BufferedReader br = new BufferedReader(in);



        String fileContents = "";

        int i;

        while ((i = in.read()) != -1) {
            char ch = (char) i;

            fileContents = fileContents + ch;
        }


        in.close();

        String[] arrOfStr = fileContents.split("[,!?.@]+");

        String match="I have been there for long time";
        for (String a : arrOfStr)
            if(a.compareToIgnoreCase(match)==0)
            {
                System.out.println("matched");
            }
	   }
}
