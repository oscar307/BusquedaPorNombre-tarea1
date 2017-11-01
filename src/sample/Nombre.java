package sample;

/**
 * Created by hp on 01/11/2017.
 */
public class Nombre {
    public String nombre;
    public String apellido;
    public int edad;

    private static Nombre[ ] listaPersonas={
        new Nombre("Oscar", "Diaz", 25),
                new Nombre("Jose", "Perz", 23),
                new Nombre("Patricia", "Vargas", 39),
                new Nombre("Estefani", "Obando", 24),
                new Nombre("Jorge", "Soto", 24),
                new Nombre("Pedro", "Lopez", 27),
    };

    private Nombre(String nombre,String apellido,int edad){

        this.nombre=nombre;
        this.apellido=apellido;
        this.edad= edad;

    }

    public static  Nombre buscarPorPosicion (int posicion){
        if (posicion < listaPersonas.length){
            return listaPersonas[posicion];
        }
        return null;
    }
    public static Nombre buscarPorNombre (String nombre){
        for (int a = 0; a < listaPersonas.length; a++){
            if (listaPersonas[a].nombre.equals(nombre)) {
                return listaPersonas[a];
            }

        }
        return null;
    }
    public static Nombre busqueda(){
        if (listaPersonas.length > 0){
            for (int x = 0; x < listaPersonas.length; x++){
                return listaPersonas[x];
            }
        }
        return null;
    }




}
