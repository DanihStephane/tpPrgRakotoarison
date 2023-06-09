/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package mg.itu.tpprgrakotoarison.jsf;

import jakarta.inject.Named;
import jakarta.enterprise.context.RequestScoped;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author s.rakotoarison
 */
@Named(value = "bean3")
@RequestScoped
public class Bean3 {

    private int nombre;

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public List<Integer> getNombresSuivants() {
        int nb = 5;
        List<Integer> suivants = new ArrayList<>();
        for (int i = nombre; i < nombre + nb; i++) {
            suivants.add(i);
        }
        return suivants;
    }

    public String afficher() {
        return "affichage__4?nb=" + nombre + "&;faces-redirect=true";
    }

    /**
     * Creates a new instance of Bean3
     */
    public Bean3() {
    }
}
