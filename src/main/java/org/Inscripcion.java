package org;

import java.util.ArrayList;
import java.util.List;

public class Inscripcion {
    private Alumno alumno;
    private List<Materia> materiasQueSeQuiereAnotar;

    //Constructor
    public Inscripcion(Alumno alumno, List<Materia> materias) {
        this.alumno = alumno;
        this.materiasQueSeQuiereAnotar = new ArrayList<>(materias); // Copia la lista
    }

    // Getter y Setter
    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public List<Materia> getMateriasQueSeQuiereAnotar() {
        return materiasQueSeQuiereAnotar;
    }

    public boolean aprobo() { // La inscripcion
        return materiasQueSeQuiereAnotar.stream().allMatch(materia -> alumno.pudeCursarla(materia));
    }
}
