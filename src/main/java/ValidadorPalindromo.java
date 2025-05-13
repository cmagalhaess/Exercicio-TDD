/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Coliveira
 */
import java.text.Normalizer;

public class ValidadorPalindromo {

    public static boolean ehPalindromo(String texto) {
        if (texto == null) return false;

        // Normalizar: remover acentos
        String normalizado = Normalizer.normalize(texto, Normalizer.Form.NFD)
                .replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");

        // Manter apenas letras e números, ignorar espaços e pontuação
        String somenteLetras = normalizado.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Verificar se é igual à string invertida
        String invertida = new StringBuilder(somenteLetras).reverse().toString();

        return somenteLetras.equals(invertida);
    }
}
