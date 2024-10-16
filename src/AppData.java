package src;
import java.io.*;

public class AppData {

    private String[] headers = {"Value1", "Value2", "Value3"};

    private int[][] data = {
            {100, 200, 123},
            {300, 400, 500}
    };

    public void createCsvFile() {
        try (FileOutputStream writer = new FileOutputStream("CsvFile.csv")) {
            writer.write(String.join("; ", headers).getBytes());



            for (int i = 0; i < data.length; i++) {
                writer.write(System.lineSeparator().getBytes());
                for (int j = 0; j < data[i].length; j++) {
                    writer.write(String.valueOf(data[i][j]).getBytes());
                    if (j < data[i].length - 1) {
                        writer.write(String.valueOf(";    ").getBytes());

                    }
                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void readCsvFile () {
        try (BufferedReader reader = new BufferedReader(new FileReader("CsvFile.csv"))) {
            String line;
            while ((line = reader.readLine())!= null) {
                System.out.println(line);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        AppData appData = new AppData();
        appData.createCsvFile();
        appData.readCsvFile();
    }
}





