# Use Case 02: Edit Catalog

### Actors:
Adminstrator

### Scope:
New-Yorker.dk

### Level:
User Goal

### Description
- New-Yorker.dk ønsker at opdatere en pris.
- System anmoder om login oplysninger.
- New-Yorker.dk angiver gyldige login oplysninger.
- Systemet validere login oplysninger og giver adgang.
- Systemet præsenterer redigerings muligheder.
- New-Yorker.dk vælger rediger pris.
- Systemet præsentere eksisterende produkter.
- New-Yorker.dk vælger ét bestemt produkt.
- Systemet åbner for redigering for valgte produkt.
- New-Yorker.dk redigere pris for valgte produkt.
- Systemet acceptere redigering og ændre pris for valgte produkt.
- Systemet præsentere opdateret eksisterende produkter.
- New-Yorker.dk logger af.

### Alternate Scenarios

- Hvis programmet gennemgår en fejl på noget tidspunkt, angiver programmet med en system fejl: "New-Yorker.dk genstarter app".
- Hvis adminstrator angiver ugyldige login oplysninger, angiver programmet med en fejl besked og afviser adgang. 
- Hvis adminstrator angiver ugyldige tegn for redigereingen af prisen, angiver programmet med en fejl besked og beder adminstrator om kun at bruge tal.
