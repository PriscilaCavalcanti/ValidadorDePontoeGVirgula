package Validador;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ValidadorPontoVirgula {

    public static void main(String[] args) {
        String caminhoArquivo = "C:\\Users\\Gigabyte\\Documents\\Validação de Script SQL\\script.sql";  // Criar uma pasta com o nome Validação de Script SQL nesse mesmo caminho, na maquina que sera executado.

        try {
            validarLinhasScriptSQL(caminhoArquivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void validarLinhasScriptSQL(String caminhoArquivo) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            int numeroLinha = 1;
            while ((linha = br.readLine()) != null) {
                if (!linha.trim().endsWith(";")) {
                    System.out.println("Linha " + numeroLinha + " Script >> " + linha);
                    
                }
                numeroLinha++;
            }
            System.out.println("\n\n\n>>>>  Validação concluída  <<<< \n\nCaso seja encontrado erros no script, entre em contato com o responsavel e solicite correção!");
            
        }
    }
}
