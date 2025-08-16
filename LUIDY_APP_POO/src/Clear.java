package semana02;

public class Clear {
    public static void main(String[] args) throws InterruptedException {
        for (int h = 0; h < 24; h++) {
            for (int m = 0; m < 60; m++) {
                for (int s = 0; s < 60; s++) {
                    // Limpar a tela
                    clearConsole();

                    // Imprimir o tempo com dois dígitos
                    System.out.printf("%02d:%02d:%02d\n", h, m, s);

                    // Esperar 1 segundo
                    Thread.sleep(1000);
                }
            }
        }
    }

    // Método para limpar o console (funciona em Windows, Linux e macOS)
    public static void clearConsole() {
        try {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                // Para Unix/Linux/macOS
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (final Exception e) {
            // Ignorar exceções
            System.out.println("Erro ao limpar o console");
        }
    }
}
