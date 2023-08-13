package desafios;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        //selecaoCandidatos();
        //imprimirSelecionados();

        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};

        for (String candidato: candidatos) {
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato){
        int tentativaRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;

            if (continuarTentando)
                tentativaRealizadas++;
            else
                System.out.println("CONTATO REALIZADO COM SUCESSO.");

        }while(continuarTentando && tentativaRealizadas < 3);

        if (atendeu)
            System.out.println("Conseguimos contato com " + candidato + " na " + tentativaRealizadas);

        else
            System.out.println("Não conseguimos contato com " + candidato + ", número máximo de tentativas " + tentativaRealizadas + " realizadas.");
    };


    //método auxiliar atender
    static boolean atender() {
        return new Random().nextInt(3)==1;
    }



    static void imprimirSelecionados(){

        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};

        System.out.println("Imprimindo a lista de candidatos informando o índice do elemento");

        for (int i = 0; i < candidatos.length; i++ ){
            System.out.println("O candidato de nº " + (i + 1) + " é " + candidatos[i]);
        }

        System.out.println("\nForma abreviada de iteração via For Each:");
        for (String candidato: candidatos) {
            System.out.println("O candidato selecionado foi:  " + candidato);
        }
    };

    //Método para seleção de candidatos
    static void selecaoCandidatos(){
    // Array com a lista de candidatos
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();
            System.out.println("O candidato " + candidato + " solicitou este valor de salário " + salarioPretendido);

            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga.\n");
                candidatosSelecionados ++;
            }
            candidatoAtual++;
        }
    }

    // Método que simula o valor pretendido
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
}
