package org;

import java.util.List;

public class Alumno {
    private List<Materia> materiasAprobadas;


    //Constructor
    public Alumno(List<Materia> materiasAprobadas) {
        this.materiasAprobadas = materiasAprobadas;
    }

    //Setter anf getter
    public List<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public void setMateriasAprobadas(List<Materia> materiasAprobadas) {
        this.materiasAprobadas = materiasAprobadas;
    }


    public boolean pudeCursarla(Materia materia) {
            return materiasAprobadas.containsAll(materia.getCorrelativas());
    }

}
