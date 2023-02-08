package com.mycompany.app;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainPoszukTest {

    MainPoszuk mp =null;

    @BeforeEach
    void setUp() {
        mp = new MainPoszuk();
    }

    @Test
    void poszukSlowka_True() {
        String zapisy = "E-portmonetka to fizyczny nośnik, który możemy doładować określoną kwotą użyć"
        + " pieniędzy i użyć jej następnie do bezkontaktowego zakupu biletu jednorazowego, lub jako nośnik biletów okresowych."
        + " Tym właśnie różni się od popularnych ( i o wiele tańszych w obsłudze) \"kart miejskich\" - na te ostatnie wgrywane są tylko przedpłacone bilety okresowe.";

        String poszuk = "i";

        int d = mp.poszukSlowka(zapisy, poszuk);
        Assertions.assertEquals(2, d);
    }

    @Test
    void poszukSlowka_Exception() {
        String zapisy = "";

        String poszuk = "i";
        try {
             mp.poszukSlowka(zapisy, poszuk);
        } catch (Exception ex) {
            Assertions.assertEquals("tekst jest pusty", ex.getMessage());
        }

    }
}