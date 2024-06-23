import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso de Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição do curso de JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Descrição da mentoria de Java");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        System.out.println("----------");
        Dev devSantiago = new Dev();
        devSantiago.setNome("Santiago");
        devSantiago.inscreverBootcamp(bootcamp);
        System.out.println(devSantiago.getNome() + " conteudos inscritos: " + devSantiago.getConteudosInscritos());
        devSantiago.progredir();
        devSantiago.progredir();
        System.out.println("-");
        System.out.println(devSantiago.getNome() + " conteudos inscritos: " + devSantiago.getConteudosInscritos());
        System.out.println(devSantiago.getNome() + " conteudos concluidos: " + devSantiago.getConteudosConcluidos());
        System.out.println("XP: " + devSantiago.calcularTotalXp());

        System.out.println("----------");

        Dev devPaula = new Dev();
        devPaula.setNome("Paula");
        devPaula.inscreverBootcamp(bootcamp);
        System.out.println(devPaula.getNome() + " conteudos inscritos: " + devPaula.getConteudosInscritos());
        devPaula.progredir();
        devPaula.progredir();
        devPaula.progredir();
        System.out.println("-");
        System.out.println(devPaula.getNome() + " conteudos inscritos: " + devPaula.getConteudosInscritos());
        System.out.println(devPaula.getNome() + " conteudos concluidos: " + devPaula.getConteudosConcluidos());
        System.out.println("XP: " + devPaula.calcularTotalXp());

    }
}
