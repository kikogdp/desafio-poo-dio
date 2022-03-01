package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = (Curso)new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());


      Bootcamp bootcamp = new Bootcamp();
      bootcamp.setNome("Bootcamp Java Developer");
      bootcamp.setDescricao("Descrição  Bootcamp Java Developer");
      bootcamp.getConteudos().add(curso1);
      //bootcamp.getConteudos().add(curso2);
      bootcamp.getConteudos().add(mentoria);



      Dev dev = new Dev();
      dev.setNome("kiko");
      dev.inscreverBootCamp(bootcamp);
      System.out.println("Conteudos Inscritos" + dev.getConteudosInstritos());
      dev.progredir();
        System.out.println("=========================================================");
        System.out.println("Conteudos Concluidos" + dev.getConteudosConcluidos());
        System.out.println("Conteudos Inscritos" + dev.getConteudosInstritos());


      Dev dev2 = new Dev();
      dev.setNome("Layane");
      dev2.inscreverBootCamp(bootcamp);
      System.out.println("Conteudos Inscritos" + dev2.getConteudosInstritos());
      dev2.progredir();
        System.out.println(dev2.calcularTotalXp());
        System.out.println("============================================================");
        System.out.println("Conteudos Concluidos" + dev2.getConteudosConcluidos());
        System.out.println("Conteudos Inscritos" + dev2.getConteudosInstritos());

    }
}
