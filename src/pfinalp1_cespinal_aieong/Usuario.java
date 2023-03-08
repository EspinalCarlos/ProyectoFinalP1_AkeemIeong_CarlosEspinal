
package pfinalp1_cespinal_aieong;


public class Usuario {
    private String Username;
    private String Correo;
    private String Password;

    public Usuario(String Username, String Correo, String Password) {
        this.Username = Username;
        this.Correo = Correo;
        this.Password = Password;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    @Override
    public String toString() {
        return "Usuario{" + "Username=" + Username + ", Correo=" + Correo + ", Password=" + Password + '}';
    }
    
    
    
}
