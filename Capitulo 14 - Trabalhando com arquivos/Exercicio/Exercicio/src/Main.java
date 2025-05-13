import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String path = "C:\\CursoJava\\Capitulo 14 - Trabalhando com arquivos\\Exercicio\\dados.csv";
        String path2= "C:\\CursoJava\\Capitulo 14 - Trabalhando com arquivos\\Exercicio";
        String path3 = "C:\\CursoJava\\Capitulo 14 - Trabalhando com arquivos\\Exercicio\\out\\summary.csv";
        List<String> linhas = new ArrayList<>();

        try(BufferedReader br= new BufferedReader(new FileReader(path)); BufferedWriter bw = new BufferedWriter(new FileWriter(path3, true))) {

            String line= br.readLine();
            while(line!= null) {
                linhas.add(line);
                line= br.readLine();
            }

            new File(path2 + "\\out").mkdir();

            new File(path2 + "\\out\\summary.csv").createNewFile();

            for(int i=0; i<4; i++) {

                String[] result = linhas.get(i).split(",");

                double total = Double.parseDouble(result[1]) * Double.parseDouble(result[2]);

                String data = result[0] + "," + String.format("%.2f",total);
                bw.write(data);
                bw.newLine();
            }

        } catch(IOException e) {
            System.out.println("Error: "+ e.getMessage());
        }
    }
}