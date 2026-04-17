public class matriz {
    public static  void  main(String[] args){

        int [] [] numeros = new int [3][3];

        numeros [0] [0] = 1;
        numeros [0] [1] = 10;
        numeros [0] [2] = 100;
        numeros [1] [0] = 2;
        numeros [1] [1] = 20;
        numeros [1] [2] = 200;
        numeros [2] [0] = 3;
        numeros [2] [1] = 30;
        numeros [2] [2] = 300;

        // Primeiro loop: percorre as linhas da matriz
        // numeros.length representa a quantidade de linhas
        // Se eu alterar o tamanho da matriz, esse loop também se ajusta automaticamente

        for(int i =0; i < numeros.length;i++){

            // Segundo loop: percorre as colunas da matriz
            // numeros[i].length representa a quantidade de colunas

            for (int j = 0; j < numeros[i].length;j++) {

                // Aqui estou imprimindo os valores da matriz
                // numeros[i][j] acessa cada posição da matriz
                // O " " serve para dar espaço entre os números
                System.out.print( numeros [i][j] + " ");
            }

            // Após imprimir todos os elementos da linha
            // o println() quebra a linha para mostrar a próxima
            System.out.println();
            
        }




    }
}
