import java.rmi.Remote;

interface Chat extends Remote{
    public String envia_msg (String nome, String conteudo);
    
}