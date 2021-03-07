/*
Write a method called printMegaBytesAndKiloBytes
        IN KiloBytes Integer
        out void
*/


public class MegaBytes {
    public static void printMegaBytesAndKiloBytes(int KiloBytes ) {
        int megaBytes;
        int remainder;

        if (KiloBytes < 0) {
            System.out.println("Invalid Value");
        }
        else {
            megaBytes = KiloBytes / 1024;
            remainder = KiloBytes % 1024;
            System.out.println(KiloBytes + " KB = " + megaBytes + " MB and " + remainder +" KB");

        }

    }
}
