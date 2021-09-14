package quatro.equipe.util;

import java.io.*;

public class ArquivoUtil {

    private File file;
    private BufferedWriter bw;
    private BufferedReader br;

    public ArquivoUtil(File file) {
        this.file = file;
        FileOutputStream fos;
        FileInputStream fis;

        try{
            fos = new FileOutputStream(this.file, true);

        } catch (FileNotFoundException e) {
            System.out.println();
        }

    }
}
