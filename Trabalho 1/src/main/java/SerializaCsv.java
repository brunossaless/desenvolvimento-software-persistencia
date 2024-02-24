import javax.swing.*;
import java.io.*;

public class SerializaCsv {
    String filename = "C:\\Users\\Bruno Sales\\Desktop\\Faculdade Bruno\\4° Semestre\\Desenvolvimento de Software para Persistência\\Desenvolvimento-de-Software-Para-Persistencia\\Trabalho 1\\src\\main\\resources\\objetos.csv";
    public final String separator = ",";
    SerializaCsv(){}

    void serializa(Carro c) throws IOException{
        FileWriter fw = new FileWriter(filename, true);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);
        pw.println(c.getChassi() + separator + c.getModelo() + separator + c.getMarca() + separator + c.getAno());
        pw.flush();
        pw.close();
        JOptionPane.showMessageDialog(null, "Inserido!", "Inserção Concluida",  JOptionPane.INFORMATION_MESSAGE);
    }

}
