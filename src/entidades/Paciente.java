/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

/**
 *
 * @author jaime
 */
public class Paciente extends Persona {

    private int idPaciente;
    private LocalDate fechaNacimiento;
    private String genero;
    private HistorialMedico historialMedico;
    private List<Cita> citas;

    public Paciente(int idPaciente, LocalDate fechaNacimiento, 
            String genero, HistorialMedico historialMedico, List<Cita> citas,
            String nombre, String apellidos) {
        super(nombre, apellidos);
        this.idPaciente = idPaciente;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.historialMedico = historialMedico;
        this.citas = citas;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public List<Cita> getCitas() {
        return citas;
    }

    public void setCitas(List<Cita> citas) {
        this.citas = citas;
    }
     public void agregarCita(Cita cita) {
        citas.add(cita);
    }

    public HistorialMedico getHistorialMedico() {
        return historialMedico;
    }

    public void setHistorialMedico(HistorialMedico historialMedico) {
        this.historialMedico = historialMedico;
    }
    
     public void agregarHistorial(String historial) {
        historialMedico.agregarHistorial(historial);
    }
     public void programarCita(Medico medico, Date fechaHora) {
        Cita cita = new Cita(this, medico, fechaHora);
        citas.add(cita);
    }
     
}
