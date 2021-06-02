# Use case 1: Make and Send Request.

### Actors:
Bruger.

### Level:
Bruger mål.

### Scope:
New-Yorker.dk.

### Main Success Scenario
- **Applikationen** starter op på "SplaschScreen".
- **Applikationen** går videre til start skærmen, som viser 3 valgmulighedder for brugeren.
- **1.** Katalog. **2.** Inspiration. **3.** Om os.
- Om os viser information omkring "New-Yorker.dk".
- Inspiration viser New-yorker vægge i rigtig brug.
- Kataloget præsentere mulige vægge for brugeren, samts deres dimisioner(Højde og bredde).
- **Brugeren** vælger "Katalog".
- **Applikationen** viser mulige vægge og deres dimmensioner(Højde og Bredde).
- **Brugeren** vælger sin ønskede væg.
- **Applikationen** præsentere så: Pris, Preview af valgte væg og indtastningsmuligheder for mere defineret dimensioner(Højde og bredde).
- **Brugeren** har lavet ønsket væg og går videre til "Tilvalg".
- **Applikationen** viser tilvalg til ønsket væg: Satinglas, Akustikpanel, Frostedglas og farvemulighedder.
- **Brugeren** vælger ønskede tilvalg eller går videre til "Kurv".
- **Applikationen** viser kurven med valgte new-yorker væg og giver valgmulighederne, "gå til kataloget" eller "gå til forespørgsel".
- **Brugeren** vælger "gå til forespørgsel".
- **Applikationen** præsentere informations fælter for brugeren: Navn, Mobil nr., E-mail og Kommentar, samt hvilken forhandler der ønskes.
- **Brugeren** udfylder felterne og vælger forhandler.
- **Brugeren** trykker "Send Forespørgsel".
- **Applikationen** sender forspørgelsen til relevante mails og viser afslut tekst "Tak for din forespørgsel. Vi vender tilbage på din henvendelse snarest muligt.".

### Alternate Scenarios
- Hvis brugeren angiver Højde højere end maks, angiver programmet en fejlbesked og beder brugeren om at holde sig inde for 250cm. 
- Hvis brugeren angiver Højde mindrer end minimum, angiver programmet en fejbesked og beder brugeren om at holde sig inde for 10cm.
- Hvis brugeren angiver Bredde mindrer end minimum, angiver programmet en fejlbesked og beder brugeren om at holde sig inde for 10cm.
- Hvis brugeren angiver Højde med et negativt tal, angiver programmet en fejl besked og beder brugeren om at skrive et positivt tal.
- Hvis brugeren angiver breden med et negativt tal, angiver programmet en fejl besked og beder brugeren om at skrive et positivt tal.
- Hvis brugeren angiver Højden med et symbol, angiver programmet en fejl besked og beder brugeren om at skrive et tal.
- Hvis brugeren angiver bredden med et symbol, angiver programmet en fejl besked og beder brugeren om at skrive et tal.
- Hvis brugeren angiver Højde med et bogstav, angiver programmet en fejl besked og beder brugeren om at skrive et tal.
- Hvis brugeren angiver Bredde med et bogstav, angiver programmet en fejl besked og beder brugeren om at skrive et tal.
- Hvis brugeren angiver et Mobil nr. med bogstaver, angiver programmen en fejl besked og bede brugeren om at skrive et tal.
- Hvis brugeren angiver et Mobil nr. med et symbol, angiver programmen en fejl besked og bede brugeren om at skrive et tal.
- Hvis brugeren angiver E-mail uden @, angiver programmet en fejl besked og beder brugeren om at tjekke sin indtastede E-mail adresse.
- Hvis brugeren angiver E-mail uden et punktum, angiver programmet en fejl besked og beder brugeren om at tjekke sin indtastede E-mail adresse.
- Hvis brugeren ikke angiver en forhandler, angiver programmet en fejl besked og beder brugeren om at  vælge en forhandler.
