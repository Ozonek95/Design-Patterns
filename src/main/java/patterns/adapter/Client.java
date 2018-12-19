package patterns.adapter;

public class Client {

    String language;
    WorldCounter worldCounter = genereteWorldCounter(Languages.valueOf(language));



    public WorldCounter genereteWorldCounter(Languages language){

        Translator translator = aTranslatorFor(language);

        return new WorldCounter(translator);
    }


    private Translator aTranslatorFor(Languages language) {
        return null;
    }
}
