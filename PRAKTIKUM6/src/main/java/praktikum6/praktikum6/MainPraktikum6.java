package praktikum6.praktikum6;
import javafx.application.Application;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.cell.PropertyValueFactory;

public class MainPraktikum6 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();

        TableView tabel= new TableView<Mahasiswa>();

        TableColumn <Mahasiswa, String> nim = new TableColumn<>("NIM");
        nim.setCellValueFactory(new PropertyValueFactory<Mahasiswa, String>("nim"));

        TableColumn <Mahasiswa, String> nama = new TableColumn<>("Nama");
        nama.setCellValueFactory(new PropertyValueFactory<Mahasiswa, String>("nama"));


        tabel.getColumns().add(nim);
        tabel.getColumns().add(nama);

        tabel.getItems().add(new Mahasiswa( 1,"2310817210043", "Muhammad Bukhari Fitri"));
        tabel.getItems().add(new Mahasiswa( 2,"2310817210033", "Muhammad Bukhari"));
        tabel.getItems().add(new Mahasiswa( 3,"2310817210025", "Muhammad"));
        tabel.getItems().add(new Mahasiswa( 4,"2310817210016", "Muhammad Fitri"));
        tabel.getItems().add(new Mahasiswa( 5,"2310817210012", "Muhammad Bukh"));
        tabel.getItems().add(new Mahasiswa( 6,"2310817210013", "Muhammad B"));
        tabel.getItems().add(new Mahasiswa( 7,"2310817210016", "Muhammad Bukh"));
        tabel.getItems().add(new Mahasiswa( 8,"2310817210052", "Muhammad Bukhari Fi"));
        tabel.getItems().add(new Mahasiswa( 9,"2310817210098", "Muhammad Fulan"));
        tabel.getItems().add(new Mahasiswa( 10,"2310817210011", "Fitri"));

        root.setCenter(tabel);

        Scene scene = new Scene(root, 500, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Tabel Mahasiswa");
        primaryStage.show();

    }
}
