Use Case sektion | Kommentar| 
-------------| -------------------------------| 
Use Case navn| Forespørg på New-Yorker væg. 
Scope        | New-Yorker.dk.
Level        | User Goal.
Primary Actor| New-Yorker.dk's kunder (håndværkerer).
Stakeholders and Interests | New-Yorker.dk samt deres kunder (håndværkerer).
Preconditions | 
Succes Guarantee | Forespørgsel på New-Yorker væg sendt.
Main Succes Scenario | 1. Håndværkeren ønsker at bestille en New-yorker væg.  <br>  2. Systemet præsenterer muligheden for at kigge New-yorker.dk's katalog igennem. <br> 3. Håndværkeren vælger et produkt. <br>  4. Systemet præsenterer produkt med standard mål.  <br> 5. Håndværkeren angiver standard mål eller erstatter dem med sine tilpassede mål. Håndværkeren kan her vælge ekstra tilvalg. <br> 6. Systemet præsenterer en plantegning med de valgte mål, valgte tillæg, samt pris. <br> 7. Håndværkeren kan vælge at tilføje den valgte væg til liste over forespørgelser. <br> 8. Håndværkeren går videre til opret forespørgsel. <br>9. Håndværkeren skriver kontakt oplysninger. <br> 10. Håndværkeren vælger forhandler.<br> 11. Systemet præsenterer liste over forhandlerer. <br> 12. Håndværkeren sender forespørgsel. <br> 13. Systemet tilføjer automatisk  plantegning til forespørgsel. <br> 14. Systemet informere at forespørglen er sendt. Systemet sender forespørslen til valgte forhandler, New-yorker.dk og forespørgsel-kvittering til håndværkeren. <br>
Extensions | 5a. Håndværkeren indtaster bogstaver eller tegn i højde/bredde felter.<br> 1. Systemet oplyser om inkorrekte værdier ved hjælp af en fejl meddelse. <br> 2. Systemet fortsætter fra punkt 5. <br> 5b. Håndværkeren indtaster et tal over grænseværdien. <br> 1. Systemet oplyser at grænseværdien på 250cm, er overskredet ved hjælp af en fejl meddelse. <br> 2.Systemet forsætter fra punkt 5.<br> 7a. Systemet tilføjer forespørgsel til liste. <br> 1. Systemet fortsætter fra punkt 2. <br> 9a. Systemet tjekker, om der er indtastet bogstaver i feltet telefon nummer.<br> 1. Systemet oplyser om inkorrekte værdier i feltet Telefon nummer ved hjælp af en fejl meddelse.<br> 2. Systemet forsætter fra punkt 8.<br> 9b. Systemet tjekker om feltet e-mail indeholder de korrekte tegn for en e-mail adresse. <br> 1. Systemet oplyser om at den indtastede e-mail adresse, mangler de korrekte tegn ved hjælp af en fejl meddelelse.<br> 2. Systemet forsætter fra punkt 8.<br> 12a. Håndværkeren vælger ikke forhandler.<br> 1. Systemet oplyser om at forhandler ikke er valgt ved hjælp af en fejl meddelse.<br> 2. Systemet forsætter fra punkt 11.<br><br> <br><br><br><br> <br>
Special Requirements | Autogeneret tegning.
Technology & Data Variations List | Exporteres til dwg-fil format.
Frequency of Occurrence | --
Miscellaneous | --