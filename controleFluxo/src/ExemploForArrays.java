public class ExemploForArrays {

    public static void main(String[] args) {

        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

        for (int x=0; x < alunos.length; x++) {
            System.out.println("O aluno no indice x = " + x + " é " + alunos[x]);
        }

        /*String alunos [] =  {"FELIPE","JONAS","JULIA","MARCOS"};

        //uso do for / each está fortemente relacionado, com um cenário onde contenha um array ou coleção, e assim , a interação é baseada nos elementos da coleção.
        //Forma abreviada
        for(String aluno : alunos) {
            System.out.println(aluno);
        }
         */
    }
}
