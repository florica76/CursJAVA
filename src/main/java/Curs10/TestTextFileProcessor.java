package Curs10;

public class TestTextFileProcessor {
    public static void main(String[] args) {
        TextFileProcessor textFile = new TextFileProcessor();
        textFile.writeFile();
        //textFile.readFile();
        textFile.appendTextToFile();
        textFile.readFile();
        textFile.deleteFile();
    }
}
