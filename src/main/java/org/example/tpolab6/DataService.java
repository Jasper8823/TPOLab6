package org.example.tpolab6;

import org.springframework.stereotype.Service;
import net.datafaker.Faker;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@Service
public class DataService {
    public List<Person> generateData(int count, String language, List<String> choice) {
        List<Person> pList = new ArrayList<>();
        Faker faker = new Faker(new Locale(language));

        for (int i = 0; i < count; i++) {
            Person person = new Person();
            person.setFirstName(faker.name().firstName());
            person.setLastName(faker.name().lastName());
            person.setDateOfBirth(faker.date().birthday());
            if (choice.contains("address")) person.setAddress(faker.address().fullAddress());
            if (choice.contains("university")) person.setUniversityName(faker.university().name());
            if (choice.contains("originCountry")) person.setOriginCountry(faker.country().name());
            if (choice.contains("clashOfClansFavoriteDefensiveBuilding")) person.setClashOfClansFavoriteDefensiveBuilding(faker.clashOfClans().defensiveBuilding());
            if (choice.contains("favoritePokemonType")) person.setFavoritePokemonType(faker.pokemon().type());
            if (choice.contains("favoritePokemon")) person.setFavoritePokemon(faker.pokemon().name());
            if (choice.contains("clashOfClansFavoriteTroop")) person.setClashOfClansFavoriteTroop(faker.clashOfClans().troop());
            if (choice.contains("clashOfClansRank")) person.setClashOfClansRank(faker.clashOfClans().rank());
            if (choice.contains("spongeBobFavoriteEpisode")) person.setSpongeBobFavoriteEpisode(faker.spongebob().episodes());
            if (choice.contains("spongeBobFavoriteCharacter")) person.setSpongeBobFavoriteCharacter(faker.spongebob().characters());
            pList.add(person);
        }
        return pList;
    }
}
