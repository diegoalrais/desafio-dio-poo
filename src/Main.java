import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Paradigma de Orientação a Objeto");
        curso1.setCargaHoraira(8);


        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Usando IDEs");
        curso2.setDescricao("Aprendendendo usar várias IDEs");
        curso2.setCargaHoraira(10);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Praticando POO com Java");
        mentoria1.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println("*********************************");
        System.out.println(mentoria1);

    }
}
