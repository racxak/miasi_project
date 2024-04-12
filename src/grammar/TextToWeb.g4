grammar TextToWeb;

// Główne reguły
page: 'Strona' STRING '{' pageContent '}';
pageContent: (theme | font | section | header )*;

theme: 'Motyw' STRING; // jasny ciemny
font: 'Czcionka' STRING;
backgroundColor: 'KolorTla' STRING; //podawany jako #... albo kolor (po zmianie API)
section: 'Sekcja' STRING '{' sectionContent '}';
header: 'Naglowek' STRING ('{' (level | color)* '}')?;
sectionContent: (borderRadius | margin | padding | alignment | backgroundColor | width | height | text | image |list| header | section)*;

// Elementy sekcji
alignment: 'Rozmieszczenie' STRING (STRING)?; //kolumna/rzad środek itp
textAlignment: 'Wyrownanie tekstu' STRING;
textDecoration: 'Ozdoby tekstu' STRING;
text: 'Tekst' STRING ('{' textAttributes '}')?;
image: 'Obraz' STRING '{' imageAttributes '}';
list: 'Lista' '{' ('Typ' STRING)? listItem* '}'; //typ : numerowana
listItem: 'Element' STRING;

// Atrybuty
textAttributes: (borderRadius | margin | padding | width | height | color | textDecoration| fontSize | textAlignment | alignment | backgroundColor)*;
imageAttributes: (borderRadius | width | height | alignment |source)*;


// Atrybuty wspólne
fontSize: 'Rozmiar' STRING; //px lub mała,duża,średnia,mniejsza,większa
width: 'Szerokosc' STRING;
height: 'Wysokosc' STRING;
level: 'Poziom' STRING; //h1 - h6  dla kolejnej zagnieżdżonej sekcji niższy
color: 'KolorCzcionki' STRING; //podawany jako #... albo kolor (po zmianie API)
source: 'Zrodlo' STRING;
margin: 'Margines' STRING;
padding: 'Padding' STRING;
borderRadius: 'Zaokraglenie' STRING;
// Tokeny
STRING: '"' (~["\r\n])* '"';
WS: [ \t\r\n]+ -> skip;
