package com.loginUsers.login.Document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Users")
public class User {

    @Id
    private int id;

    private String usuarioEstudiante;

    private String passwordEstudiante;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuarioEstudiante() {
        return usuarioEstudiante;
    }

    public void setUsuarioEstudiante(String usuarioEstudiante) {
        this.usuarioEstudiante = usuarioEstudiante;
    }

    public String getPasswordEstudiante() {
        return passwordEstudiante;
    }

    public void setPasswordEstudiante(String passwordEstudiante) {
        this.passwordEstudiante = passwordEstudiante;
    }
}
