public class StringAssignment {
    public static void main(String[] args) {
        /*
        Assignment on Strings in Java
        The file was created by Kc pele
        The file is about a musician in Nigeria that had her
        song released on the 14th of february which is valentines day
        The song is about love and care
         */
        String songTitle = "See the way you love";
        String artist = "Mercy Chinwo";
        String musicType = "Gospel music";
        String monthReleased = "14th of February";
        int yearReleased = 2020;
        String releasedDate = monthReleased + yearReleased;
        char at = '@';
        String directedBy = "avalonokpe";
        String styledBy = "nativespirit_ng";
        String producedBy = "e_fretz";
        String mixedBy = "israel_dammy";
        String masteredBy = mixedBy;
        String specialRelease = "Valentine's day";
        String downloadLink = "https://xclusivegospel.com/wp-content/uploads/2020/02/Mercy-Chinwo-Obinasom-XclusiveGospel.Com_.mp3";

        // Here we are printing each variable to our terminal
        System.out.println(songTitle);
        System.out.println(artist);
        System.out.println("The type of music is a " + musicType);
        System.out.println("Was released on the " + releasedDate);
        System.out.println("Directed by " + at + directedBy);
        System.out.println("Styled by " + at + styledBy);
        System.out.println("Produced by " + at + producedBy);
        System.out.println("Mixed and Mastered by " + mixedBy + " and " + masteredBy);
        System.out.println("It was released on " + specialRelease);
        System.out.println("To be downloaded from " + downloadLink);

    }
}
