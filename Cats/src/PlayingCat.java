public class PlayingCat {
            public static boolean isCatPlaying(boolean summer, int temp) {
            int maxTemp = summer ? 45 : 35;
            return temp >= 25 && temp <= maxTemp;
        }
    }

