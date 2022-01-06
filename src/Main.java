import com.github.paulopcrp.desafio.*;

import java.time.LocalDate;

public class Main {
  public static void main(String[] args) {

    Curso curso1 = new Curso();
    curso1.setTitulo("Curso java");
    curso1.setDescricao("Java 8");
    curso1.setCargaHoraria(20);

    Curso curso2 = new Curso();
    curso2.setTitulo("Curso javaScript");
    curso2.setDescricao("ECMA 6");
    curso2.setCargaHoraria(16);

    //Conteudo conteudo = new Curso();

    Mentoria mentoria = new Mentoria();
    mentoria.setTitulo("mentoria java 8");
    mentoria.setDescricao("mentoria de como utilizar collectors em java");
    mentoria.setData(LocalDate.now());

    Bootcamp bootcamp = new Bootcamp();
    bootcamp.setNome("Bootcamp Java 8");
    bootcamp.setDescricao("Java 8 e conteúdos");
    bootcamp.getConteudos().add(curso1);
    bootcamp.getConteudos().add(curso2);
    bootcamp.getConteudos().add(mentoria);

    Dev dev1 = new Dev();
    dev1.setNome("Jim Morrison");
    dev1.inscreverBootcamp(bootcamp);

    System.out.println("Conteudos Inscritos:" + dev1.getConteudoInscritos());

    dev1.progredrir();

    System.out.println("Conteudos Inscritos:" + dev1.getConteudoConcluidos());
    System.out.println("Conteudos Concluídos:" + dev1.getConteudoConcluidos());
    System.out.println("XP:" + dev1.calcularTotalXp());

    Dev dev2 = new Dev();
    dev2.setNome("Robert Plant");
    dev2.inscreverBootcamp(bootcamp);

    System.out.println("Conteudos Inscritos:" + dev2.getConteudoInscritos());

    dev2.progredrir();

    System.out.println("Conteudos Inscritos:" + dev2.getConteudoConcluidos());
    System.out.println("Conteudos Concluídos:" + dev2.getConteudoConcluidos());
    System.out.println("XP:" + dev2.calcularTotalXp());

    /*System.out.println(curso1);
    System.out.println(curso2);
    System.out.println(mentoria);*/

  }
}
