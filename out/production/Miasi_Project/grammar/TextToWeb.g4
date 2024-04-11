grammar TextToWeb;

// Główne reguły
page: 'Strona' STRING '{' pageContent '}';
pageContent: (theme | font | section | header )*;

theme: 'Motyw' STRING; // jasny ciemny
font: 'Czcionka' STRING;
backgroundColor: 'KolorTla' STRING; //podawany jako #... albo kolor (po zmianie API)
section: 'Sekcja' STRING '{' sectionContent '}';
header: 'Naglowek' STRING ('{' (level | color)* '}')?;
sectionContent: (alignment | backgroundColor | width | height | text | image | header | section)*;

// Elementy sekcji
alignment: 'Rozmieszczenie' STRING;
text: 'Tekst' STRING ('{' textAttributes '}')?;
image: 'Obraz' STRING '{' imageAttributes '}';
list: 'Lista' '{' 'Typ' STRING listItem* '}';
listItem: 'Element' STRING;

// Atrybuty
textAttributes: (color | fontSize | alignment | backgroundColor)*;
imageAttributes: (width | height | alignment)*;

// Atrybuty wspólne
fontSize: 'Rozmiar' STRING; //px lub mała,duża,średnia,mniejsza,większa
width: 'Szerokosc' STRING;
height: 'Wysokosc' STRING;
level: 'Poziom' STRING; //h1 - h6  dla kolejnej zagnieżdżonej sekcji niższy
color: 'KolorCzcionki' STRING; //podawany jako #... albo kolor (po zmianie API)

// Tokeny
STRING: '"' (~["\r\n])* '"';
WS: [ \t\r\n]+ -> skip;
