import java.rmi.server.RemoteObject;

public class Controller extends RemoteObject implements Chat {
    private static final long serialVersionUID = 1L;

    private String username;
    private String password;

    protected Controller() throws Exception {  super (); }
    @Override
    public String envia_msg(String nome, String conteudo) {
        return "Mensage enviada com sucesso:"+nome + conteudo;
    }
    
}
