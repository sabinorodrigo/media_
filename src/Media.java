public class Media {
    
    int nota1;
    int nota2;
    int nota3;

    public int calculoMedia() {
        int result = (nota1 + nota2 + nota3) / 3;

        if (result >= 6) {
            System.out.println("Parabéns você foi aprovado");
        } else {
            System.out.printf("Sua nota é: %d!%n", result);
            System.out.printf("Você foi reprovado: porem não desista");
        }
        return result;
    }
}
