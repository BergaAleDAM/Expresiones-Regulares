package expresionesregulares;


public class expresionsRegulares {

    public boolean validarNIF(String nif){
        
        return nif.matches("[0-9]{9}[A-Z]{1}");
    }
    
    public boolean validarTelMobil(String mobil){
        
        return mobil.matches("[0-9]{9}");
    }
    
    public boolean validarCodigoPostal(String codipostal){
        return codipostal.matches("[0-9]{5}");
    }
    
    public boolean validarIP4(String ip){
        
        return ip.matches("[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}");
    }

    public boolean validarCorreoelectronico(String correo){
        
        return correo.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
    }
}
