
package pe.edu.upeu.pi_2021_1.config;

public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        if(Conexion.getConexion()!=null){
            System.out.println("conectado");
        }else{
            System.out.println("No conectado");
        }
    }
    
}
