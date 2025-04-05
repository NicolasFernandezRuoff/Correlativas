package org;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

class InscripcionTest {

    @Test
    public void InscripcionTestAm2() {
        Materia AM1 = new Materia(Collections.emptyList());
        Materia AGA = new Materia(Collections.emptyList());
        Materia AM2 = new Materia(Arrays.asList(AM1, AGA));

        Alumno nico = new Alumno(Arrays.asList(AM1, AGA));

        Inscripcion inscripcion = new Inscripcion(nico, Arrays.asList(AM2));


        Assertions.assertTrue(inscripcion.aprobada());
    }


    @Test
    public void InscribirAVariasMaterias() {
        Materia IT1 = new Materia(Collections.emptyList());
        Materia SPN = new Materia(Collections.emptyList());
        Materia AyED = new Materia(Collections.emptyList());
        Materia LED = new Materia(Collections.emptyList());
        Materia PdEP = new Materia(Arrays.asList(LED, LED));
        Materia ADS = new Materia(Arrays.asList(SPN, LED));
        Materia DSI = new Materia(Arrays.asList(ADS, IT1, PdEP));
        Materia IT2 = new Materia(Arrays.asList(IT1));

        Alumno nico = new Alumno(Arrays.asList(ADS,IT1, PdEP, SPN, AyED, LED));

        Inscripcion inscripcion = new Inscripcion(nico, Arrays.asList(DSI, IT2));


        Assertions.assertTrue(inscripcion.aprobada());
    }

}