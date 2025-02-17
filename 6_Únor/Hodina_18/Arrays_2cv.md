# Playlist

- V poli `songs` je uloženo 100 písniček
- V poli `ratings`, máme hodnocení jednotlivých písníček z pole `songs`
- `song[index]` má hodnocení `ratings[index]`
  - ```java
    // Příklad  
    int index = 0;
    songs[0] //     "Bohemian Rhapsody - Queen"
    ratings[0] //   Hodnocení Bohemian Rhapsody = 4.54
    ```

### Úkoly

- vypište všechny písníčky a jejich hodnocení
- přidejte do pole `songs` svou oblíbenou písníčku (nebo jakoukoliv jinou) a do pole `ratings` vložte hodnocení této písničky
- vypište nejlepší a nejhorší písničku
- vypište písničky od nejlepší po nejhorší

```java
import java.util.Random;

public class MusicRatings {
    public static void main(String[] args) {
        String[] songs = {
                "Bohemian Rhapsody - Queen",
                "Stairway to Heaven - Led Zeppelin",
                "Hotel California - Eagles",
                "Imagine - John Lennon",
                "Smells Like Teen Spirit - Nirvana",
                "Sweet Child O' Mine - Guns N' Roses",
                "Hey Jude - The Beatles",
                "Like a Rolling Stone - Bob Dylan",
                "What's Going On - Marvin Gaye",
                "Respect - Aretha Franklin",
                "Good Vibrations - The Beach Boys",
                "Johnny B. Goode - Chuck Berry",
                "I Can't Get No Satisfaction - The Rolling Stones",
                "Yesterday - The Beatles",
                "Blowin' in the Wind - Bob Dylan",
                "No Woman, No Cry - Bob Marley",
                "Comfortably Numb - Pink Floyd",
                "Kashmir - Led Zeppelin",
                "All Along the Watchtower - Jimi Hendrix",
                "Billie Jean - Michael Jackson",
                "Back in Black - AC/DC",
                "Wonderwall - Oasis",
                "Purple Haze - Jimi Hendrix",
                "Let It Be - The Beatles",
                "Every Breath You Take - The Police",
                "One - U2",
                "Livin' on a Prayer - Bon Jovi",
                "Piano Man - Billy Joel",
                "Free Bird - Lynyrd Skynyrd",
                "Light My Fire - The Doors",
                "Superstition - Stevie Wonder",
                "Roxanne - The Police",
                "I Will Always Love You - Whitney Houston",
                "Enter Sandman - Metallica",
                "Black Dog - Led Zeppelin",
                "Hallelujah - Leonard Cohen",
                "Dream On - Aerosmith",
                "I Want to Hold Your Hand - The Beatles",
                "Rehab - Amy Winehouse",
                "Uptown Funk - Mark Ronson ft. Bruno Mars",
                "Rolling in the Deep - Adele",
                "Shape of You - Ed Sheeran",
                "Thinking Out Loud - Ed Sheeran",
                "All of Me - John Legend",
                "Despacito - Luis Fonsi",
                "Thriller - Michael Jackson",
                "Beat It - Michael Jackson",
                "In the End - Linkin Park",
                "Numb - Linkin Park",
                "Chandelier - Sia",
                "Bad Guy - Billie Eilish",
                "Old Town Road - Lil Nas X",
                "Blinding Lights - The Weeknd",
                "Firework - Katy Perry",
                "Roar - Katy Perry",
                "Halo - Beyoncé",
                "Crazy in Love - Beyoncé",
                "Lose Yourself - Eminem",
                "Stan - Eminem",
                "Without Me - Eminem",
                "What a Wonderful World - Louis Armstrong",
                "Fly Me to the Moon - Frank Sinatra",
                "My Way - Frank Sinatra",
                "New York, New York - Frank Sinatra",
                "I Got a Woman - Ray Charles",
                "Georgia on My Mind - Ray Charles",
                "Ain't No Sunshine - Bill Withers",
                "Lean on Me - Bill Withers",
                "A Change Is Gonna Come - Sam Cooke",
                "At Last - Etta James",
                "Chain of Fools - Aretha Franklin",
                "I Heard It Through the Grapevine - Marvin Gaye",
                "Let's Stay Together - Al Green",
                "Super Freak - Rick James",
                "Dancing Queen - ABBA",
                "Mamma Mia - ABBA",
                "Take a Chance on Me - ABBA",
                "Waterloo - ABBA",
                "Money, Money, Money - ABBA",
                "The Winner Takes It All - ABBA",
                "Dancing in the Dark - Bruce Springsteen",
                "Born in the U.S.A. - Bruce Springsteen",
                "Thunder Road - Bruce Springsteen",
                "Sweet Home Alabama - Lynyrd Skynyrd",
                "Ramblin' Man - The Allman Brothers Band",
                "Free Fallin' - Tom Petty",
                "American Girl - Tom Petty and the Heartbreakers",
                "Space Oddity - David Bowie",
                "Heroes - David Bowie",
                "Let's Dance - David Bowie",
                "Under Pressure - Queen & David Bowie",
                "Radio Ga Ga - Queen",
                "Somebody to Love - Queen",
                "I Want to Break Free - Queen",
                "Don't Stop Me Now - Queen",
                "We Will Rock You - Queen",
                "We Are the Champions - Queen",
                "Another Brick in the Wall - Pink Floyd",
                "Time - Pink Floyd",
                "Money - Pink Floyd"
        };

        double[] ratings = {4.54, 4.42, 3.01, 4.74, 3.17, 3.77, 3.72, 3.06, 3.16, 2.04, 4.12, 2.60, 3.25, 2.71, 2.11, 3.16, 0.12, 2.90, 1.09, 2.32, 4.64, 4.43, 0.84, 4.00, 0.97, 2.51, 4.37, 3.57, 4.92, 2.63, 2.19, 4.44, 4.72, 1.13, 3.55, 3.91, 0.85, 0.73, 4.28, 0.24, 4.07, 2.46, 2.38, 0.74, 2.36, 1.26, 4.84, 0.74, 2.66, 3.28, 3.73, 0.90, 2.50, 3.99, 4.87, 1.00, 4.86, 2.22, 4.56, 1.34, 1.56, 1.55, 2.90, 3.44, 1.45, 2.14, 2.51, 0.58, 4.46, 2.38, 1.98, 4.29, 1.39, 1.65, 1.64, 1.87, 2.02, 2.54, 2.67, 1.53, 0.49, 2.68, 1.31, 0.28, 2.70, 3.71, 1.60, 2.07, 4.51, 2.38, 3.33, 2.26, 2.98, 1.15, 1.39, 2.26, 0.27, 3.50, 3.92, 2.18, 2.3};

        // pro náhodné generování hodnocení
//        double[] ratings = new double[songs.length];
//        
//        Random random = new Random();
//        for (int i = 0; i < ratings.length; i++) {
//            ratings[i] = random.nextDouble() * 5;
//        }
    }
}

```