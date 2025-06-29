import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String path = "C:\\CursoJava\\Capitulo 14 - Trabalhando com arquivos\\Exercicio\\dados.csv";

        try(BufferedReader br= new BufferedReader(new FileReader(path));) {

            String line= br.readLine();
            while(line!= null) {
                String[] lin = line.split(" ");
                System.out.print(lin[0]);
                System.out.println(" " + lin[1]);
                line= br.readLine();
            }
        } catch(IOException e) {
            System.out.println("Error: "+ e.getMessage());
        }
    }
}