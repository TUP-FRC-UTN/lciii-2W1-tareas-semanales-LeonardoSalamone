
package herenciaclientes;


public class HerenciaClientes {

    public static void main(String[] args) {
        
        Cliente c =  new Cliente(1,"Leonardo",155091936);
        ClientePreferencial c2 = new ClientePreferencial(500,1000,"Colon 5000",2,"Martin",4745896);
        
        System.out.println(c2.toString());
    }
    
}
