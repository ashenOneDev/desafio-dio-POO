import br.com.dio.dominio.Bootcamp;
import br.com.dio.dominio.Curso;
import br.com.dio.dominio.Dev;
import br.com.dio.dominio.Mentoria;
import java.time.LocalDate;


public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();

        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("mentoira de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcam Java Developer");
        bootcamp.setDescrição("Descrição Bootcamp Jva Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devIago = new Dev();
        devIago.setNome("Iago");
        devIago.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Iago:" + devIago.getConteudosInscritos());

        devIago.progredir();
        devIago.progredir();
        devIago.progredir();

        System.out.println("-");
        System.out.println("Conteúdos Inscritos Iago:" + devIago.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Iago:" + devIago.getConteudosConcluidos());
        System.out.println("XP:" + devIago.calcularTotalXp());

        System.out.println("+=+=+=+=+=+=");

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());

        devCamila.progredir();
        devCamila.progredir();

        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());

    }

}
