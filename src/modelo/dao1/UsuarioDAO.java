package modelo.dao1;

import java.util.ArrayList;
import java.util.List;
import modelo.beans1.Usuario;

/**
Clase para guardar usuarios registrados en la interfaz gráfica.
 **/
public class UsuarioDAO {
    
    private List<Usuario> usuarios;
    public UsuarioDAO(){
        usuarios = new ArrayList<>();
    } 
    /**
     * Dame la lista de usuarios registrados.
     * @return Lista completa de usuarios registrados.
     **/
    public List<Usuario> getUsuarios(){
    return usuarios;}
    /**
     * Buscar jugador.
     * @param usuario Ingresar usuario del jugador.
     * @return int Posicion en la lista de usuarios registrados.
     **/
    public int buscar(String usuario){
        int n = -1;
        for(int i = 0 ; i < usuarios.size();i++){
            if(usuarios.get(i).getUsuario().equals(usuario)){
                n = i ;
                break;
            }
                }
        return n;
    }
    
    /**
     * Insertar usuario.
     * @param usuario Ingresar usuario que deseemos insertar.
     * @return boolean.
     **/
    public boolean insertar(Usuario usuario){
        if(buscar(usuario.getUsuario() )==-1){
            usuarios.add(usuario);
            return true;
        }else{
            return false;
        }
    }
    public boolean eliminar(String usuario){
        if(buscar(usuario)!= -1){
            usuarios.remove(buscar(usuario));
            return true;
        }else{
            return false;
        }
    }
    /**
     * Obtener usuario.
     * @param usuario ingresar usuario del usuario.
     * @return Usuario.
     **/
    public Usuario obtener(String usuario){
        if(buscar(usuario) != -1){
            return usuarios.get(buscar(usuario));
        }else{return null;}
    }
    
}
