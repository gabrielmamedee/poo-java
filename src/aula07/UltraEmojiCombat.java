package aula07;

public class UltraEmojiCombat {
    public static void main(String[] args) {
        Lutador lutadores[] = new Lutador[6];
        lutadores[0] = new Lutador(
                "Pretty Boy",
                "França",
                31,
                1.75,
                68.90,
                11,
                2,
                1
        );

        lutadores[1] = new Lutador(
                "Putscript",
                "Brasil",
                29,
                1.68,
                57.80,
                14,
                2,
                3
        );

        lutadores[2] = new Lutador(
                "Snapshadow",
                "EUA",
                35,
                1.65,
                80.90,
                12,
                2,
                1
        );

        lutadores[3] = new Lutador(
                "Dead Code",
                "Austrália",
                28,
                1.93,
                81.60,
                13,
                0,
                2
        );

        lutadores[4] = new Lutador(
                "UFOCobol",
                "Brasil",
                37,
                1.70,
                119.30,
                5,
                4,
                3
        );

        lutadores[5] = new Lutador(
                "Nerdaart",
                "EUA",
                30,
                1.81,
                105.70,
                12,
                2,
                4
        );

        for (int i = 0; i < lutadores.length; i++) {
            lutadores[i].apresentar();
        }
    }
}
