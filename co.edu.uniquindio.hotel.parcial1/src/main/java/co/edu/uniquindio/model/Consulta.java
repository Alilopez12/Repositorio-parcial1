package co.edu.uniquindio.model;

import java.time.LocalDate;
import java.util.Collection;

public class Consulta {

    private String idConsulta;
    private LocalDate fechaDeConsulta;
    private String diagnostico;
    private Mascota mascotaAsociado;
    private Veterinario veterinarioAsociado;

    public Consulta(String idConsulta, LocalDate fechaDeConsulta, String diagnostico, Mascota mascotaAsociado, Veterinario veterinarioAsociado) {
        this.idConsulta = idConsulta;
        this.fechaDeConsulta = fechaDeConsulta;
        this.diagnostico = diagnostico;
        this.mascotaAsociado = mascotaAsociado;
        this.veterinarioAsociado = veterinarioAsociado;
    }

    public Mascota getMascotaAsociado() {
        return mascotaAsociado;
    }

    public void setMascotaAsociado(Mascota mascotaAsociado) {
        this.mascotaAsociado = mascotaAsociado;
    }

    public Veterinario getVeterinarioAsociado() {
        return veterinarioAsociado;
    }

    public void setVeterinarioAsociado(Veterinario veterinarioAsociado) {
        this.veterinarioAsociado = veterinarioAsociado;
    }

    public String getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(String idConsulta) {
        this.idConsulta = idConsulta;
    }

    public LocalDate getFechaDeConsulta() {
        return fechaDeConsulta;
    }

    public void setFechaDeConsulta(LocalDate fechaDeConsulta) {
        this.fechaDeConsulta = fechaDeConsulta;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    @Override
    public String toString() {
        return "Consulta{" +
                "idConsulta='" + idConsulta + '\'' +
                ", fechaDeConsulta=" + fechaDeConsulta +
                ", diagnostico='" + diagnostico + '\'' +
                ", mascotaAsociado=" + mascotaAsociado +
                ", veterinarioAsociado=" + veterinarioAsociado +
                '}';
    }
}
