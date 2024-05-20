/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.clb.ude.pb.Proyecto_De_Aula.entidades;

public class Usuario {
    protected String ID;
    protected String nombres;
    protected String apellidos;
    protected String genero;
    protected String telefono;
    protected String email;
    protected String tipoUsuario;

public Usuario() {
}

    public Usuario(String dni, String nombres, String apellidos, String genero, String telefono, String email, String tipoUsuario) {
        this.ID = dni;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.genero = genero;
        this.telefono = telefono;
        this.email = email;
        this.tipoUsuario = tipoUsuario;
    }

    public String getID() {
        return ID;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getGenero() {
        return genero;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public void mostrarInformacion() {
        System.out.println("DNI: " + ID);
        System.out.println("Nombres: " + nombres);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Género: " + genero);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Email: " + email);
        System.out.println("Tipo de usuario: " + tipoUsuario);
    }
}
