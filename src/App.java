import controllers.MetodosBinaria;
import model.Persona;

public class App {
   
    public static void main(String[] args) {
        Persona [] personas = new Persona[7];
        personas[0] = new Persona(1, "Juan");
        personas[1] = new Persona(2, "Pedro");
        personas[2] = new Persona(3, "Maria");
        personas[3] = new Persona(4, "Jose");
        personas[4] = new Persona(5, "Ana");
        personas[5] = new Persona(6, "Luis");
        personas[6] = new Persona(7, "Laura");

        //MetodosBusqueda metodosBusqueda = new MetodosBusqueda(personas);
        MetodosBinaria metodosBinaria = new MetodosBinaria(personas);
        metodosBinaria.showPerson();
        
       
        
    }
        
}
