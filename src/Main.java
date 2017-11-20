 import java.io.FileInputStream;
    import java.io.FileOutputStream;
    import java.io.IOException;
    import java.io.ObjectInputStream;
    import java.io.ObjectOutputStream;

    public class Main {

        public static void main(String[] args) throws IOException, ClassNotFoundException {
        	
            // tworzymy obiekt klasy ObjectOutputStream do zapisywania do pliku
            ObjectOutputStream wy = new ObjectOutputStream(new FileOutputStream("zespol.txt"));

            TreatmentTeam zespol1 = new TreatmentTeam("Zespół chirurgów","2017");

            wy.writeObject(zespol1);

            // tworzymy obiekt klasy ObjectInputStream do odczytywania z pliku
            ObjectInputStream we = new ObjectInputStream(new FileInputStream("zespol.txt"));
           
            // odczytujemy z pliku
            TreatmentTeam p1 = (TreatmentTeam)we.readObject();

            System.out.println(p1.name + ", " + p1.starts);
            

        }
    }