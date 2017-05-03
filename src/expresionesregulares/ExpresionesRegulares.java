package expresionesregulares;

public class ExpresionesRegulares {

    public static void main(String[] args) {


        expresionsRegulares er = new expresionsRegulares();
        
        String nif = "123456789C";
        
        String ip  = "192.168.10.0";
        String ip2 = "192.168.100.10";
        String ip3 = "1920.10.100.100";
        
        
        String correo = "cosaquepasa@gmail.correo";
        
//        System.out.println(er.validarNIF(nif));
//        
//        
//        System.out.println(er.validarIP4(ip));
//        System.out.println(er.validarIP4(ip2));
//        System.out.println(er.validarIP4(ip3));
//        
        System.out.println(er.validarCorreoelectronico(correo));
        
    }

}
