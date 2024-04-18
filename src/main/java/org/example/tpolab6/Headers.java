package org.example.tpolab6;

public class Headers {
    String firstName;
    String lastName;
    String dateOfBirth;
    String address;
    String universityName;
    String originCountry;
    String clashOfClansFavoriteDefensiveBuilding;
    String clashOfClansFavoriteTroop;
    String favoritePokemonType;
    String clashOfClansRank;
    String spongeBobFavoriteEpisode;
    String spongeBobFavoriteCharacter;
    String favoritePokemon;
    public Headers(){}

    public void setLanguage(String language){
        switch (language){
            case "EN":
                firstName = "First name";
                lastName = "Last name";
                dateOfBirth = "Date of birth";
                address = "Address";
                universityName = "University name";
                originCountry = "Origin country";
                clashOfClansFavoriteDefensiveBuilding = "Clash of clans favorite defensive building";
                clashOfClansFavoriteTroop= "Clash of clans favorite troop";
                favoritePokemonType = "Favorite pokemon type";
                clashOfClansRank = "Clash of clans rank";
                spongeBobFavoriteEpisode = "Sponge Bob favorite episode";
                spongeBobFavoriteCharacter = "Sponge Bob favorite character";
                favoritePokemon = "Favorite pokemon";
                break;
            case "DE":
                firstName = "Vorname";
                lastName = "Nachname";
                dateOfBirth = "Geburtsdatum";
                address = "Adresse";
                universityName = "Universitätsname";
                originCountry = "Herkunftsland";
                clashOfClansFavoriteDefensiveBuilding = "Lieblingsverteidigungsgebäude in Clash of Clans";
                clashOfClansFavoriteTroop = "Lieblingstruppe in Clash of Clans";
                favoritePokemonType = "Lieblings-Pokémon-Typ";
                clashOfClansRank = "Rang in Clash of Clans";
                spongeBobFavoriteEpisode = "Lieblingsfolge von SpongeBob";
                spongeBobFavoriteCharacter = "Lieblingscharakter von SpongeBob";
                favoritePokemon = "Lieblings-Pokémon";
                break;
            case "PT":
                firstName = "Primeiro nome";
                lastName = "Sobrenome";
                dateOfBirth = "Data de nascimento";
                address = "Endereço";
                universityName = "Nome da universidade";
                originCountry = "País de origem";
                clashOfClansFavoriteDefensiveBuilding = "Edifício defensivo favorito do Clash of Clans";
                clashOfClansFavoriteTroop = "Tropa favorita do Clash of Clans";
                favoritePokemonType = "Tipo de Pokémon favorito";
                clashOfClansRank = "Classificação do Clash of Clans";
                spongeBobFavoriteEpisode = "Episódio favorito do Bob Esponja";
                spongeBobFavoriteCharacter = "Personagem favorito do Bob Esponja";
                favoritePokemon = "Pokémon favorito";
                break;
            case "BR":
                firstName = "Primeiro nome";
                lastName = "Sobrenome";
                dateOfBirth = "Data de nascimento";
                address = "Endereço";
                universityName = "Nome da universidade";
                originCountry = "País de origem";
                clashOfClansFavoriteDefensiveBuilding = "Edifício defensivo favorito do Clash of Clans";
                clashOfClansFavoriteTroop = "Tropa favorita do Clash of Clans";
                favoritePokemonType = "Tipo de Pokémon favorito";
                clashOfClansRank = "Classificação no Clash of Clans";
                spongeBobFavoriteEpisode = "Episódio favorito do Bob Esponja";
                spongeBobFavoriteCharacter = "Personagem favorito do Bob Esponja";
                favoritePokemon = "Pokémon favorito";
                break;
            case "ES":
                firstName = "Nombre";
                lastName = "Apellido";
                dateOfBirth = "Fecha de nacimiento";
                address = "Dirección";
                universityName = "Nombre de la universidad";
                originCountry = "País de origen";
                clashOfClansFavoriteDefensiveBuilding = "Edificio defensivo favorito de Clash of Clans";
                clashOfClansFavoriteTroop = "Tropa favorita de Clash of Clans";
                favoritePokemonType = "Tipo de Pokémon favorito";
                clashOfClansRank = "Rango en Clash of Clans";
                spongeBobFavoriteEpisode = "Episodio favorito de Bob Esponja";
                spongeBobFavoriteCharacter = "Personaje favorito de Bob Esponja";
                favoritePokemon = "Pokémon favorito";
                break;
            case "IT":
                firstName = "Nome";
                lastName = "Cognome";
                dateOfBirth = "Data di nascita";
                address = "Indirizzo";
                universityName = "Nome dell'università";
                originCountry = "Paese d'origine";
                clashOfClansFavoriteDefensiveBuilding = "Edificio difensivo preferito di Clash of Clans";
                clashOfClansFavoriteTroop = "Unità preferita di Clash of Clans";
                favoritePokemonType = "Tipo di Pokémon preferito";
                clashOfClansRank = "Grado in Clash of Clans";
                spongeBobFavoriteEpisode = "Episodio preferito di SpongeBob";
                spongeBobFavoriteCharacter = "Personaggio preferito di SpongeBob";
                favoritePokemon = "Pokémon preferito";
                break;
            case "RU":
                firstName = "Имя";
                lastName = "Фамилия";
                dateOfBirth = "Дата рождения";
                address = "Адрес";
                universityName = "Название университета";
                originCountry = "Страна происхождения";
                clashOfClansFavoriteDefensiveBuilding = "Любимое защитное здание в Clash of Clans";
                clashOfClansFavoriteTroop = "Любимая войска в Clash of Clans";
                favoritePokemonType = "Любимый тип Покемона";
                clashOfClansRank = "Ранг в Clash of Clans";
                spongeBobFavoriteEpisode = "Любимая серия Спанч Боба";
                spongeBobFavoriteCharacter = "Любимый персонаж Спанч Боба";
                favoritePokemon = "Любимый Покемон";
                break;
            case "PL":
                firstName = "Imię";
                lastName = "Nazwisko";
                dateOfBirth = "Data urodzenia";
                address = "Adres";
                universityName = "Nazwa uniwersytetu";
                originCountry = "Kraj pochodzenia";
                clashOfClansFavoriteDefensiveBuilding = "Ulubione budynki obronne w Clash of Clans";
                clashOfClansFavoriteTroop = "Ulubione jednostki w Clash of Clans";
                favoritePokemonType = "Ulubiony typ Pokemonów";
                clashOfClansRank = "Ranga w Clash of Clans";
                spongeBobFavoriteEpisode = "Ulubiony odcinek SpongeBoba";
                spongeBobFavoriteCharacter = "Ulubiona postać SpongeBoba";
                favoritePokemon = "Ulubiony Pokemon";
                break;
            case "FR":
                firstName = "Prénom";
                lastName = "Nom de famille";
                dateOfBirth = "Date de naissance";
                address = "Adresse";
                universityName = "Nom de l'université";
                originCountry = "Pays d'origine";
                clashOfClansFavoriteDefensiveBuilding = "Bâtiment défensif préféré dans Clash of Clans";
                clashOfClansFavoriteTroop = "Unité préférée dans Clash of Clans";
                favoritePokemonType = "Type de Pokémon préféré";
                clashOfClansRank = "Classement dans Clash of Clans";
                spongeBobFavoriteEpisode = "Épisode préféré de Bob l'éponge";
                spongeBobFavoriteCharacter = "Personnage préféré de Bob l'éponge";
                favoritePokemon = "Pokémon préféré";
                break;
            case "TH":
                firstName = "ชื่อ";
                lastName = "นามสกุล";
                dateOfBirth = "วันเกิด";
                address = "ที่อยู่";
                universityName = "ชื่อมหาวิทยาลัย";
                originCountry = "ประเทศกำเนิด";
                clashOfClansFavoriteDefensiveBuilding = "อาคารป้องกันที่โปรดใน Clash of Clans";
                clashOfClansFavoriteTroop = "หน่วยที่โปรดใน Clash of Clans";
                favoritePokemonType = "ชนิดของ Pokemon ที่โปรด";
                clashOfClansRank = "อันดับใน Clash of Clans";
                spongeBobFavoriteEpisode = "ตอนที่โปรดของสป็องบ็อบ";
                spongeBobFavoriteCharacter = "ตัวละครที่โปรดของสป็องบ็อบ";
                favoritePokemon = "Pokemon ที่โปรด";
                break;
        }
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public String getUniversityName() {
        return universityName;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public String getClashOfClansFavoriteDefensiveBuilding() {
        return clashOfClansFavoriteDefensiveBuilding;
    }

    public String getClashOfClansFavoriteTroop() {
        return clashOfClansFavoriteTroop;
    }

    public String getFavoritePokemonType() {
        return favoritePokemonType;
    }

    public String getClashOfClansRank() {
        return clashOfClansRank;
    }

    public String getSpongeBobFavoriteEpisode() {
        return spongeBobFavoriteEpisode;
    }

    public String getSpongeBobFavoriteCharacter() {
        return spongeBobFavoriteCharacter;
    }

    public String getFavoritePokemon() {
        return favoritePokemon;
    }
}
