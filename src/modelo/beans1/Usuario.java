package modelo.beans1;

import java.util.ArrayList;

import javax.swing.JOptionPane;
/**
*Crea objetos de tipo jugador.
*Es la persona que jugará el juego.
 **/
 public class Usuario {
    private String nombre;
    private String usuario;
    private String contraseña;
    private String correo;
    private ArrayList<Tarea> tareas;
   
    public Usuario(String nombre, String usuario, String contraseña, String correo) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.correo = correo;
        tareas = new ArrayList<Tarea>();
    }
    public ArrayList<Tarea> lista(){
        return tareas;
    }
    public void agregarTarea(Tarea tarea){
        tareas.add(tarea);
    }
    public int buscar(String tarea){
        int n = -1;
        for(int i = 0 ; i < tareas.size();i++){
            if(tareas.get(i).getNombre().equals(tarea)){
                n = i ;
                break;
            }
                }
        return n;
    }
    public Tarea obtener(String tarea){
         if(buscar(tarea) != -1){
            return tareas.get(buscar(tarea));
        }else{return null;}
    }
   public boolean eliminar(String tarea){
        if(buscar(tarea)!= -1){
            tareas.remove(buscar(tarea));
            return true;
        }else{
            return false;
        }
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getCorreo() {
        return correo;
    }
}