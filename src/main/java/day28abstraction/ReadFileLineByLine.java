package day28abstraction;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
                   * * * İNTERWİEW SORUSU * * *

    "throw" ile "throws" arasindaki farklar nelerdir?

    * "throw" methodun body'si icinde kullanilir. "throws" ise methodun isminden sonra kullanilir.
    * "throw" dan sonra object olusturulur. "throws" dan sonra ise sadece Exception Class'in ismi yazilir.
    * "throw", methodun icinde istedigimiz yerde "Exception" üretmek icin kullanilir."throws" ise var olan
      checked (Compile Time) Exception'i atmak icin kullanilir.
    * Yani "throw" Exception üretir. "throws" var olan Exception'i atar.
    * "throw" dan sonra sadece 1 tane Exception olabilir.
      "throws" dan sonra 1 den fazla Exception olabilir.
 */

public class ReadFileLineByLine {

    public static void main(String[] args) {
        readFileLineByLine();

    }
    public static void readFileLineByLine() {

        try {
            BufferedReader br=new BufferedReader(new FileReader("src\\main\\java\\day27exceptions\\File1.txt"));

            String line = br.readLine();
            while (line!=null){
                System.out.println(line);
                line=br.readLine();
            }

        } catch (FileNotFoundException e) {
            System.out.println("Ya path yanlis ya da dosya silinmis - " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Okunamayacak character veya characterler var - "+e.getMessage());
        }

    }
}
