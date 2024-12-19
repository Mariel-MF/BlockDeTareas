package modelo.logic1;
import modelo.beans1.Usuario;
import modelo.dao1.UsuarioDAO;
import java.util.ArrayList;
import java.util.List;
/**
Clase que nos permitira usar los objetos de tipo jugador, que se encuentran registrados en la interfaz gráfica.
 **/
public class UsuarioLogic {
    
    private static UsuarioDAO usuariodao = new UsuarioDAO();
    /**
     *verificar que el usuario y contraseña sean correctas.
     * @param contraseña Ingresar usuario registrado.
     * @param usuario Ingresr contraseña registrada.
     * @return boolean ¿Los datos ingresados son correctos?
     **/
    public static boolean autentificar(String usuario, String contraseña){
        if(obtener(usuario)!= null){
            Usuario jugadorConsulta = obtener(usuario);
            if(obtener(usuario).getUsuario().equals(usuario)&& jugadorConsulta.getContraseña().equals(contraseña)){
            return true;
            }else{
            return false;
            }
        }else{
        return false;
        }
    }
    /**
     * Insertar usuario.
     * @param usuario Ingresar usuario que deseemos insertar.
     **/
    public static boolean insertar(Usuario usuario){
        return usuariodao.insertar(usuario) ;
    }
    public static boolean eliminar(String usuario){
        return usuariodao.eliminar(usuario) ;
    }
    /**
     * Devuelve la lista de jugadores registrados
     * @return Lista completa de jugadores registrados.
     **/
    public static List<Usuario> getusuarios(){
        return usuariodao.getUsuarios();
    }
    /**
     * Obtener usuario.
     * @param usuario ingresar usuario del usuario.
     * @return Usuario.
     **/
    public static Usuario obtener(String usuario){
        return usuariodao.obtener(usuario);
    }
}
