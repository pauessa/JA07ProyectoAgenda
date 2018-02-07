
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pauessa
 */
public class Pagina {

    private int dia;
    private int mes;
    private ArrayList<Cita> citas = new ArrayList<>();

    public Pagina(int dia, int mes) {
        this.dia = dia;
        this.mes = mes;
    }

    public void anadirCita(Cita c) {
        this.citas.add(c);
    }

    public void borrarCita(Cita c) {
        for (Cita cita : citas) {
            if(cita.getHora()==c.getHora()&&cita.getMinutos()==c.getMinutos()){
                this.citas.remove(cita);
            }
            
        }
    }

}
