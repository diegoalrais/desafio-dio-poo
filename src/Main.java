import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Paradigma de Orientação a Objeto");
        curso1.setCargaHoraria(8);


        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Usando IDEs");
        curso2.setDescricao("Aprendendendo usar várias IDEs");
        curso2.setCargaHoraria(10);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Praticando POO com Java");
        mentoria1.setData(LocalDate.now());

        //Exemplo de polimorfismo - ter o objeto de diversas formas
        Conteudo conteudo = new Curso();
        conteudo.setTitulo("testando");
        conteudo.setDescricao("polimorfismo");

/*
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println("*********************************");
        System.out.println(mentoria1);
        System.out.println("******** Exemplo de polimorfismo ******");
        System.out.println(conteudo);*/

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Bootcamp Java Develper");
        bootcamp1.setDescricao("Descrição Bootcamp java Developer");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(mentoria1);

        Dev dev1 = new Dev();
        dev1.setNome("Diego");
        dev1.inscreverBootcamp(bootcamp1);
        dev1.progredir();
        dev1.progredir();
        Dev dev2 = new Dev();
        dev2.setNome("Maria");
        dev2.inscreverBootcamp(bootcamp1);
        dev2.progredir();

        System.out.println("Conteúdos inscritos do(a) dev " + dev1.getNome() + " " + dev1.getConteudosInscritos());
        System.out.println("Conteúdos concluído do(a) dev " + dev1.getNome() + " " + dev1.getConteudoConcluido());
        System.out.println("XP do(a) dev " + dev1.getNome() + " " + dev1.calcularTotalXp());

        System.out.println("Conteúdos inscritos do(a) dev " + dev2.getNome() + " " + dev2.getConteudosInscritos());
        System.out.println("Conteúdos concluído do(a) dev " + dev2.getNome() + " " + dev2.getConteudoConcluido());
        System.out.println("XP do(a) dev " + dev2.getNome() + " " + dev2.calcularTotalXp());

    }
}
