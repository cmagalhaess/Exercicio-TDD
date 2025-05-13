/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Coliveira
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PalindromoTest {

    @Test
    void deveRetornarTrueParaPalavrasSimples() {
        assertTrue(ValidadorPalindromo.ehPalindromo("ana"));
        assertTrue(ValidadorPalindromo.ehPalindromo("Ovo"));
    }

    @Test
    void deveRetornarTrueParaFrasesComEspacosEMaiusculas() {
        assertTrue(ValidadorPalindromo.ehPalindromo("Ame a ema"));
        assertTrue(ValidadorPalindromo.ehPalindromo("Socorram-me subi no ônibus em Marrocos"));
    }

    @Test
    void deveRetornarFalseParaNaoPalindromos() {
        assertFalse(ValidadorPalindromo.ehPalindromo("banana"));
        assertFalse(ValidadorPalindromo.ehPalindromo("Isso não é um palíndromo!"));
    }

    @Test
    void deveIgnorarPontuacoesEAcentos() {
        assertTrue(ValidadorPalindromo.ehPalindromo("A grama é amarga!"));
    }
}

