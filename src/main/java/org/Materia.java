package org;


import java.util.List;

public class Materia {
    private List<Materia> correlativas;

    public Materia(List<Materia> correlativas) {
        this.correlativas = correlativas;
    }

    //Asi no se tomarian las correlativas de las correlativas para hacer la materia (aunque en la practica no haria falta
    // porque desde un principio no podria a ver cursado la primera materia)
    public List<Materia> getCorrelativas() {
        return this.correlativas;
    }

    // Caso en el que se tiene que tomar las correlativas de las correlativas
//    public List<Materia> getTodasCorrelativas() {
//        List<Materia> todas = new ArrayList<>();
//        agregarCorrelativasRecursivo(this, todas);
//        return todas;
//    }
//
//    private void agregarCorrelativasRecursivo(Materia materia, List<Materia> acumulador) {
//        for (Materia correlativa : materia.getCorrelativas()) {
//            if (!acumulador.contains(correlativa)) { // Evita duplicados y bucles infinitos
//                acumulador.add(correlativa);
//                agregarCorrelativasRecursivo(correlativa, acumulador);
//            }
//        }
//    }

}