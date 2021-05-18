
package pkgCentroConvenciones;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import javax.swing.JOptionPane;
import pkgCentroConvGUI.*;

/************************************************* ***********************
* Palabra de honor:
* - No he discutido ni mostrado el código de mi programa con alguien que no sea mi compañero
*   Profesor o con el monitor asignado a este curso
* 
* - No he utilizado código obtenido de otro u otros estudiantes,
* O cualquier otra fuente no autorizada, ya sea modificado o sin modificar.
*
* - Si cualquier código o documentación utilizada en mi programa
* Fue obtenido de otra fuente, tal como un libro de texto o curso
* Notas, debe ser claramente señalado con una cita apropiada en
* Los comentarios de mi programa.
*
* <Mario Alberto Reyes de la Rosa – 0221710055>
*
************************************************** *********************/

public class CcApp implements Serializable {
    
    //objeto global centro de convenciones
    public static CentroConvenciones cc = new CentroConvenciones();
    
    public static void main(String[] args) {
  
        //leer datos, si el archivo existe
        try
        {
            FileInputStream fichero = new FileInputStream("registroCC.txt");
            ObjectInputStream stream = new ObjectInputStream(fichero);
            cc = (CentroConvenciones)stream.readObject();
            stream.close();
        }
        catch(FileNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null, "No hay datos para cargar");
        }
        catch(IOException ex)
        {
            JOptionPane.showMessageDialog(null, "Error en stream");
        }
        catch(ClassNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null, "Error al leer el fichero");
        }
 
        
        //abrir la ventana de inicio
        FInicio fInicio = new FInicio();
        fInicio.setVisible(true);
     
    }
    
}
