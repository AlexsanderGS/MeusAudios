package br.com.alura.minhasMusicas.modelos;

public class MinhasPreferidas {

    public void inclui(Audio audio) {
        if (audio.getClassificaca() >= 9) {
            System.out.println(audio.getTitulo() + " é considerado sucesso absoluto e preferido por todos!");
            System.out.println();
        } else {
            System.out.println(audio.getTitulo() + " também é uma boa opção para se ouvir!");
        }
    }
}
