/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.List;

/**
 *
 * @author jaime
 */
public class Medico extends Persona {

    private int idMedico;
    private String especialidad;
    private List<Cita> citasAtendidas;

    public Medico(int idMedico, String especialidad, List<Cita> citasAtendidas,
            String nombre, String apellidos) {
        super(nombre, apellidos);
        this.idMedico = idMedico;
        this.especialidad = especialidad;
        this.citasAtendidas = citasAtendidas;
    }

    public int getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public List<Cita> getCitasAtendidas() {
        return citasAtendidas;
    }

    public void setCitasAtendidas(List<Cita> citasAtendidas) {
        this.citasAtendidas = citasAtendidas;
    }
    public void atenderCita(Cita cita) {
        citasAtendidas.add(cita);
    }
}
