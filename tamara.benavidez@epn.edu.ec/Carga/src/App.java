public class App {
    private StringBuilder progress;

    /**
     * hace un loading [#########        ] 25%
     */
    public App() {
        init();
    }

    /**
     * llamada a la carga de progreso cuando necesita ser actualizada
     *
     * @param done representa el trabajo realizado
     * @param total representa el trabajo total
     */
    public void update(int done, int total) {
        char[] workchars = {'-'};
        String format = "\n%3d%% %s %c";

        int percent = (++done * 100) / total;
        int extrachars = (percent / 2) - this.progress.length();

        while (extrachars-- > 0) {
            progress.append('=');
        }

        System.out.printf(format, percent, progress,
         workchars[done % workchars.length]);

        if (done == total) {
            System.out.flush();
            System.out.println();
            init();
        }
    }

    private void init() {
        this.progress = new StringBuilder(60);
    }
}
