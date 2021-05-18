package Pablopm07.Bases;


public class Bases_de_Almacenes {

    public static void main(String[] args) {

        
        Ventana v = null;
      
        try{
            
            v = new Ventana();
            v.setVisible(true);
            
             v.conexion.close();
            
        }catch(Exception e){
            System.out.println("Ha habido un error");  
            e.printStackTrace();
        
            
        }
    }
}
