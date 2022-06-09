package org.pbragan.exceptions.examples.utils;

import org.pbragan.exceptions.examples.model.*;

import java.util.ArrayList;
import java.util.Collection;

public class PublisherUtils {
    private static Collection<Publisher> publisherCollections;

    private static void loadPublisher() {
        publisherCollections = new ArrayList<>();
        publisherCollections.add( new Publisher(10000, "BERE", "BERE@mail.com", CountryEnum.AR));
        publisherCollections.add( new Publisher(10001, "ALEXIS", "ALEXIS@mail.com", CountryEnum.AR));
        publisherCollections.add( new Publisher(10002, "SERGIO ALEJANDRO", "SERGIO-ALEJANDRO@mail.com", CountryEnum.AR));
        publisherCollections.add( new Publisher(10003, "DIEGO ISMAEL", "DIEGO-ISMAEL@mail.com", CountryEnum.AR));
        publisherCollections.add( new Publisher(10004, "AURORA", "AURORA@mail.com", CountryEnum.AR));
        publisherCollections.add( new Publisher(10005, "JOYCELENE FABIOLA", "JOYCELENE-FABIOLA@mail.com", CountryEnum.AR));
        publisherCollections.add( new Publisher(10006, "FRANCISCO", "FRANCISCO@mail.com", CountryEnum.AR));
        publisherCollections.add( new Publisher(10007, "LEONARDO DANIEL", "LEONARDO-DANIEL@mail.com", CountryEnum.AR));
        publisherCollections.add( new Publisher(10008, "RAMON ANDRES", "RAMON-ANDRES@mail.com", CountryEnum.AR));
        publisherCollections.add( new Publisher(10009, "EDGAR ANDRES", "EDGAR-ANDRES@mail.com", CountryEnum.AR));
        publisherCollections.add( new Publisher(10010, "MARIA FERNANDA", "MARIA-FERNANDA@mail.com", CountryEnum.BR));
        publisherCollections.add( new Publisher(10011, "ALEJANDRO", "ALEJANDRO@mail.com", CountryEnum.BR));
        publisherCollections.add( new Publisher(10012, "MARTHA ALICIA", "MARTHA-ALICIA@mail.com", CountryEnum.BR));
        publisherCollections.add( new Publisher(10013, "JOSAFAT GERARDO", "JOSAFAT-GERARDO@mail.com", CountryEnum.BR));
        publisherCollections.add( new Publisher(10014, "ROSALIA", "ROSALIA@mail.com", CountryEnum.BR));
        publisherCollections.add( new Publisher(10015, "LAURA CELENE", "LAURA-CELENE@mail.com", CountryEnum.BR));
        publisherCollections.add( new Publisher(10016, "ANGELICA", "ANGELICA@mail.com", CountryEnum.BR));
        publisherCollections.add( new Publisher(10017, "CRISTIAN IVAN", "CRISTIAN-IVAN@mail.com", CountryEnum.BR));
        publisherCollections.add( new Publisher(10018, "MARLENE GABRIELA", "MARLENE-GABRIELA@mail.com", CountryEnum.BR));
        publisherCollections.add( new Publisher(10019, "ALEJANDRA", "ALEJANDRA@mail.com", CountryEnum.BR));
        publisherCollections.add( new Publisher(10020, "CONSUELO YURIDIANA THALIA", "CONSUELO-YURIDIANA-THALIA@mail.com", CountryEnum.PE));
        publisherCollections.add( new Publisher(10021, "JAVIER ADRIAN", "JAVIER-ADRIAN@mail.com", CountryEnum.PE));
        publisherCollections.add( new Publisher(10022, "JUAN CARLOS EVARISTO", "JUAN-CARLOS-EVARISTO@mail.com", CountryEnum.PE));
        publisherCollections.add( new Publisher(10023, "JAZMIN ALEJANDRA", "JAZMIN-ALEJANDRA@mail.com", CountryEnum.PE));
        publisherCollections.add( new Publisher(10024, "GUSTAVO", "GUSTAVO@mail.com", CountryEnum.PE));
        publisherCollections.add( new Publisher(10025, "CARLOS NIVARDO", "CARLOS-NIVARDO@mail.com", CountryEnum.PE));
        publisherCollections.add( new Publisher(10026, "KARLA JOHANA", "KARLA-JOHANA@mail.com", CountryEnum.PE));
        publisherCollections.add( new Publisher(10027, "YESSICA YOSELINNE", "YESSICA-YOSELINNE@mail.com", CountryEnum.PE));
        publisherCollections.add( new Publisher(10028, "CHRISTIAN EDUARDO", "CHRISTIAN-EDUARDO@mail.com", CountryEnum.PE));
        publisherCollections.add( new Publisher(10029, "LUIS ROBERTO", "LUIS-ROBERTO@mail.com", CountryEnum.PE));
        publisherCollections.add( new Publisher(10030, "ADRIAN", "ADRIAN@mail.com", CountryEnum.MX));
        publisherCollections.add( new Publisher(10031, "EDUARDO YAIR", "EDUARDO-YAIR@mail.com", CountryEnum.MX));
        publisherCollections.add( new Publisher(10032, "JUAN FRANCISCO", "JUAN-FRANCISCO@mail.com", CountryEnum.MX));
        publisherCollections.add( new Publisher(10033, "ZULEICA ELIZABETH", "ZULEICA-ELIZABETH@mail.com", CountryEnum.MX));
        publisherCollections.add( new Publisher(10034, "ADRIANA YUNUHEN", "ADRIANA-YUNUHEN@mail.com", CountryEnum.MX));
        publisherCollections.add( new Publisher(10035, "OSCAR URIEL", "OSCAR-URIEL@mail.com", CountryEnum.MX));
        publisherCollections.add( new Publisher(10036, "ERICK DE JESUS", "ERICK-DE-JESUS@mail.com", CountryEnum.MX));
        publisherCollections.add( new Publisher(10037, "MARIA GUADALUPE", "MARIA-GUADALUPE@mail.com", CountryEnum.MX));
        publisherCollections.add( new Publisher(10038, "JESSICA NOEMI", "JESSICA-NOEMI@mail.com", CountryEnum.MX));
        publisherCollections.add( new Publisher(10039, "FLOR MARGARITA", "FLOR-MARGARITA@mail.com", CountryEnum.MX));
        publisherCollections.add( new Publisher(10040, "LUIS ANTONIO", "LUIS-ANTONIO@mail.com", CountryEnum.AR));
        publisherCollections.add( new Publisher(10041, "EDGAR IVAN", "EDGAR-IVAN@mail.com", CountryEnum.AR));
        publisherCollections.add( new Publisher(10042, "LUIS ALFONSO", "LUIS-ALFONSO@mail.com", CountryEnum.PE));
        publisherCollections.add( new Publisher(10043, "JOSE CARLOS", "JOSE-CARLOS@mail.com", CountryEnum.PE));
        publisherCollections.add( new Publisher(10044, "JUDITH", "JUDITH@mail.com", CountryEnum.BR));
        publisherCollections.add( new Publisher(10045, "BRENDA SORAYA", "BRENDA-SORAYA@mail.com", CountryEnum.BR));
        publisherCollections.add( new Publisher(10046, "ALMA ROSA", "ALMA-ROSA@mail.com", CountryEnum.MX));
        publisherCollections.add( new Publisher(10047, "maria andrea", "maria-andrea@mail.com", CountryEnum.MX));
        publisherCollections.add( new Publisher(10048, "miguel antonio", "miguel-antonio@mail.com", CountryEnum.AR));
        publisherCollections.add( new Publisher(10049, "danilo", "danilo@mail.com", CountryEnum.AR));
    }

    public static Collection<Publisher> getPublishers() {
        loadPublisher();
        return publisherCollections;
    }
}
