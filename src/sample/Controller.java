package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import javax.swing.*;

import static javax.swing.JOptionPane.showMessageDialog;

public class Controller {

    public TextField txtNombre;
    public Button btnBuscar;

    public void busqueda(ActionEvent actionEvent){

        Nombre Buscar = Nombre.buscarPorNombre(txtNombre.getText());
        JOptionPane.showMessageDialog(null, "Informacion De la Persona: " + Buscar.nombre + " " +
                Buscar.apellido + " " + Buscar.edad + " años");


    }

}
