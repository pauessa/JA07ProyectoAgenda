
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
            if (cita.getHora() == c.getHora() && cita.getMinutos() == c.getMinutos()) {
                this.citas.remove(cita);
            }

        }
    }

    public Cita buscarCita(int hora, int minutos) {
        Cita busqueda = null, temp;
        int cont = 0;
        boolean encontrado = false;

        while (cont < this.citas.size() && encontrado == false) {
            temp = this.citas.get(cont++);
            if (temp.getHora() == hora && temp.getMinutos() == minutos) {
                busqueda = temp;
                encontrado = true;
            }
        }
        return busqueda;

        /*de otra forma
        for (Cita temp : this.citas) {
            if(temp.getHora()==c.getHora()&& temp.getMinutos()==c.getMinutos()){
                retunr temp;
            }
        }
        return null;
        
         */
    }
    
    public void leerPagina(){
        StringBuilder st= new StringBuilder(this.getDia()+"/"+this.getMes()+"\n");
        if(this.citas.isEmpty()){
            st.append("la pagina esta en blanco.\n");
        }else{
            for (int i = 0; i < this.citas.size(); i++) {
                st.append(this.citas.get(i).leerCita());
                
            }
        }
        System.out.println(st.toString());
    }
    

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }
    
    

}
